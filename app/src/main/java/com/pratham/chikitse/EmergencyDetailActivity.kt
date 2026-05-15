package com.pratham.chikitse

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import java.util.Locale

class EmergencyDetailActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var tts: TextToSpeech
    private lateinit var btnAudio: MaterialButton
    private lateinit var btnCallDetail: MaterialButton
    private lateinit var viewPager: ViewPager2
    private lateinit var tvTitle: TextView
    private lateinit var tvTitleKn: TextView
    private lateinit var tvStepCounter: TextView

    private var isTtsOn = false
    private var emergencyId = 0
    private var emergencyNameEn = ""
    private var emergencyNameKn = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_detail)

        // Get data passed from MainActivity
        emergencyId = intent.getIntExtra("EMERGENCY_ID", 0)
        emergencyNameEn = intent.getStringExtra("EMERGENCY_NAME_EN") ?: ""
        emergencyNameKn = intent.getStringExtra("EMERGENCY_NAME_KN") ?: ""

        // Setup views
        tvTitle = findViewById(R.id.tvDetailTitle)
        tvTitleKn = findViewById(R.id.tvDetailTitleKn)  // ← new line
        tvStepCounter = findViewById(R.id.tvStepCounter)
        btnAudio = findViewById(R.id.btnAudio)
        btnCallDetail = findViewById(R.id.btnCallDetail)
        viewPager = findViewById(R.id.viewPagerSteps)

        // Set titles correctly — each emergency shows its own name
        tvTitle.text = emergencyNameEn
        tvTitleKn.text = emergencyNameKn  // ← fixes the hardcoded Kannada bug

        // Initialize TTS
        tts = TextToSpeech(this, this)

        // Setup steps
        val steps = EmergencySteps.getSteps(emergencyId)
        val stepAdapter = StepAdapter(steps)
        viewPager.adapter = stepAdapter

        // Update step counter on swipe
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tvStepCounter.text = "Step ${position + 1} of ${steps.size}"
                // Auto read current step aloud when swiped if audio is on
                if (isTtsOn) {
                    tts.speak(
                        steps[position].instructionKn,
                        TextToSpeech.QUEUE_FLUSH,
                        null,
                        "STEP_TTS"
                    )
                }
            }
        })

        // Initial counter
        tvStepCounter.text = "Step 1 of ${steps.size}"

        // Audio toggle button
        btnAudio.setOnClickListener {
            if (isTtsOn) {
                stopAudio()
            } else {
                startAudio(steps)
            }
        }

        // Call 108
        btnCallDetail.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:108")
            startActivity(intent)
        }
    }

    private fun startAudio(steps: List<Step>) {
        isTtsOn = true
        btnAudio.text = "🔇  TAP TO STOP AUDIO"
        btnAudio.backgroundTintList =
            android.content.res.ColorStateList.valueOf(
                android.graphics.Color.parseColor("#D32F2F")
            )
        val currentStep = viewPager.currentItem
        tts.speak(
            steps[currentStep].instructionKn,
            TextToSpeech.QUEUE_FLUSH,
            null,
            "STEP_TTS"
        )
    }

    private fun stopAudio() {
        isTtsOn = false
        btnAudio.text = "🔊  ಕನ್ನಡದಲ್ಲಿ ಕೇಳಿ  •  Hear in Kannada"
        btnAudio.backgroundTintList =
            android.content.res.ColorStateList.valueOf(
                android.graphics.Color.parseColor("#00897B")
            )
        tts.stop()
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale("kn", "IN")
        }
    }

    override fun onDestroy() {
        tts.stop()
        tts.shutdown()
        super.onDestroy()
    }
}