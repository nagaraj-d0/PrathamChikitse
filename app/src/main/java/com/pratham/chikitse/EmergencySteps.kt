package com.pratham.chikitse

object EmergencySteps {
    fun getSteps(emergencyId: Int): List<Step> {
        return when (emergencyId) {

            1 -> listOf( // Snake Bite
                Step(1, "Stay calm — panicking speeds up venom spread through your blood", "ಶಾಂತವಾಗಿರಿ — ಗಾಬರಿಯಿಂದ ವಿಷ ವೇಗವಾಗಿ ಹರಡುತ್ತದೆ"),
                Step(2, "Do NOT suck, cut or squeeze the bite wound", "ಕಚ್ಚಿದ ಗಾಯವನ್ನು ಹೀರಬೇಡಿ, ಕತ್ತರಿಸಬೇಡಿ ಅಥವಾ ಒತ್ತಬೇಡಿ"),
                Step(3, "Immobilise the bitten arm or leg using a splint or cloth", "ಕಚ್ಚಿದ ಕೈ ಅಥವಾ ಕಾಲನ್ನು ಬಟ್ಟೆಯಿಂದ ಕಟ್ಟಿ ಚಲಿಸದಂತೆ ಇರಿಸಿ"),
                Step(4, "Keep the bitten area BELOW the level of the heart at all times", "ಕಚ್ಚಿದ ಭಾಗವನ್ನು ಯಾವಾಗಲೂ ಹೃದಯಕ್ಕಿಂತ ಕೆಳಗೆ ಇರಿಸಿ"),
                Step(5, "Remove rings, watches, tight clothing near the bite immediately", "ಉಂಗುರ, ಗಡಿಯಾರ ಮತ್ತು ಬಿಗಿ ಬಟ್ಟೆಗಳನ್ನು ತಕ್ಷಣ ತೆಗೆಯಿರಿ"),
                Step(6, "Do NOT apply tourniquet or ice — this causes more damage", "ಟೂರ್ನಿಕೆಟ್ ಅಥವಾ ಐಸ್ ಹಾಕಬೇಡಿ — ಇದು ಹೆಚ್ಚು ಹಾನಿ ಮಾಡುತ್ತದೆ"),
                Step(7, "Note the time of bite and describe the snake if possible", "ಕಚ್ಚಿದ ಸಮಯ ಮತ್ತು ಹಾವಿನ ಬಣ್ಣ/ಆಕಾರ ನೆನಪಿಟ್ಟುಕೊಳ್ಳಿ"),
                Step(8, "Carry the person to hospital — do not let them walk", "ವ್ಯಕ್ತಿಯನ್ನು ಎತ್ತಿಕೊಂಡು ಹೋಗಿ — ನಡೆಯಲು ಬಿಡಬೇಡಿ"),
                Step(9, "Call 108 immediately and stay on the line", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ ಮತ್ತು ಲೈನ್‌ನಲ್ಲಿ ಇರಿ")
            )

            2 -> listOf( // Heart Attack
                Step(1, "Make the person sit upright or in a comfortable half-lying position", "ವ್ಯಕ್ತಿಯನ್ನು ನೇರವಾಗಿ ಅಥವಾ ಅರೆ-ಮಲಗಿದ ಸ್ಥಿತಿಯಲ್ಲಿ ಕೂರಿಸಿ"),
                Step(2, "Loosen tie, belt, collar or any tight clothing around chest", "ಟೈ, ಬೆಲ್ಟ್, ಕಾಲರ್ ಮತ್ತು ಎದೆಯ ಸುತ್ತಲಿನ ಬಿಗಿ ಬಟ್ಟೆ ಸಡಿಲಿಸಿ"),
                Step(3, "Give 1 aspirin tablet (325mg) to chew if conscious and not allergic", "ಪ್ರಜ್ಞೆಯಲ್ಲಿದ್ದರೆ 1 ಆಸ್ಪಿರಿನ್ ಮಾತ್ರೆ ಜಗಿಯಲು ಕೊಡಿ"),
                Step(4, "Do NOT give food, water or any other medicine", "ಆಹಾರ, ನೀರು ಅಥವಾ ಬೇರೆ ಯಾವುದೇ ಔಷಧ ನೀಡಬೇಡಿ"),
                Step(5, "If unconscious and not breathing — start CPR immediately", "ಪ್ರಜ್ಞೆ ತಪ್ಪಿದ್ದರೆ ಮತ್ತು ಉಸಿರಾಡದಿದ್ದರೆ — ತಕ್ಷಣ CPR ಪ್ರಾರಂಭಿಸಿ"),
                Step(6, "Keep the person warm using a blanket or shawl", "ಹೊದಿಕೆ ಅಥವಾ ಶಾಲು ಹೊದಿಸಿ ವ್ಯಕ್ತಿಯನ್ನು ಬೆಚ್ಚಗಿಡಿ"),
                Step(7, "Do NOT leave the person alone even for a minute", "ವ್ಯಕ್ತಿಯನ್ನು ಒಂದು ನಿಮಿಷವೂ ಒಂಟಿಯಾಗಿ ಬಿಡಬೇಡಿ"),
                Step(8, "Call 108 immediately and describe chest pain symptoms clearly", "ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ ಮತ್ತು ಎದೆ ನೋವಿನ ಲಕ್ಷಣಗಳನ್ನು ಸ್ಪಷ್ಟವಾಗಿ ವಿವರಿಸಿ")
            )

            3 -> listOf( // Choking
                Step(1, "Ask loudly 'Can you speak or cough?' — if yes, encourage forceful coughing", "ಜೋರಾಗಿ ಕೇಳಿ 'ಮಾತನಾಡಬಲ್ಲಿರಾ?' — ಹೌದು ಎಂದರೆ ಜೋರಾಗಿ ಕೆಮ್ಮಲು ಹೇಳಿ"),
                Step(2, "If cannot cough — lean them forward and give 5 firm back blows between shoulder blades", "ಕೆಮ್ಮಲು ಸಾಧ್ಯವಿಲ್ಲದಿದ್ದರೆ — ಮುಂದೆ ಬಗ್ಗಿಸಿ ಭುಜದ ಮಧ್ಯೆ 5 ಬಲವಾದ ಏಟು ನೀಡಿ"),
                Step(3, "Stand behind them, make a fist above navel, give 5 inward-upward abdominal thrusts", "ಹಿಂದೆ ನಿಂತು ಹೊಕ್ಕಳ ಮೇಲೆ ಮುಷ್ಟಿ ಮಾಡಿ 5 ಬಾರಿ ಒಳಕ್ಕೆ-ಮೇಲಕ್ಕೆ ಒತ್ತಿರಿ"),
                Step(4, "Alternate 5 back blows and 5 abdominal thrusts until object comes out", "ವಸ್ತು ಹೊರಬರುವವರೆಗೆ 5 ಬೆನ್ನು ಏಟು ಮತ್ತು 5 ಹೊಟ್ಟೆ ಒತ್ತುವಿಕೆ ಪರ್ಯಾಯವಾಗಿ ಮಾಡಿ"),
                Step(5, "For infants — hold face-down, give 5 gentle back blows, then 5 chest thrusts", "ಶಿಶುಗಳಿಗೆ — ಮುಖ ಕೆಳಗಾಗಿ ಹಿಡಿದು 5 ಮೃದು ಬೆನ್ನು ಏಟು ನೀಡಿ"),
                Step(6, "If person becomes unconscious — lay them down and start CPR", "ವ್ಯಕ್ತಿ ಪ್ರಜ್ಞೆ ಕಳೆದುಕೊಂಡರೆ — ಮಲಗಿಸಿ CPR ಪ್ರಾರಂಭಿಸಿ"),
                Step(7, "Call 108 if object is not removed within 1 minute", "1 ನಿಮಿಷದಲ್ಲಿ ವಸ್ತು ಹೊರಬರದಿದ್ದರೆ 108 ಕರೆ ಮಾಡಿ")
            )

            4 -> listOf( // Burns
                Step(1, "Remove the person from the source of heat immediately", "ವ್ಯಕ್ತಿಯನ್ನು ತಕ್ಷಣ ಶಾಖದ ಮೂಲದಿಂದ ದೂರ ಮಾಡಿ"),
                Step(2, "Cool the burn under cool running water for minimum 20 minutes", "ಸುಟ್ಟ ಭಾಗವನ್ನು ಕನಿಷ್ಠ 20 ನಿಮಿಷ ತಂಪು ನೀರಿನಲ್ಲಿ ತೊಳೆಯಿರಿ"),
                Step(3, "Do NOT use ice, butter, toothpaste or oil on burns — this causes infection", "ಐಸ್, ಬೆಣ್ಣೆ, ಟೂತ್‌ಪೇಸ್ಟ್ ಅಥವಾ ಎಣ್ಣೆ ಹಚ್ಚಬೇಡಿ — ಇದು ಸೋಂಕು ಉಂಟುಮಾಡುತ್ತದೆ"),
                Step(4, "Gently remove jewellery and clothing near the burn before swelling starts", "ಊತ ಬರುವ ಮೊದಲು ಒಡವೆ ಮತ್ತು ಬಟ್ಟೆಗಳನ್ನು ಮೆಲ್ಲಗೆ ತೆಗೆಯಿರಿ"),
                Step(5, "Cover loosely with a clean non-fluffy cloth or cling film", "ಸ್ವಚ್ಛ ಬಟ್ಟೆ ಅಥವಾ ಕ್ಲಿಂಗ್ ಫಿಲ್ಮ್‌ನಿಂದ ಸಡಿಲವಾಗಿ ಮುಚ್ಚಿ"),
                Step(6, "Do NOT burst blisters — this opens wound to infection", "ಗುಳ್ಳೆಗಳನ್ನು ಒಡೆಯಬೇಡಿ — ಇದು ಗಾಯವನ್ನು ಸೋಂಕಿಗೆ ತೆರೆಯುತ್ತದೆ"),
                Step(7, "For large burns, chemical burns or burns on face — call 108 immediately", "ದೊಡ್ಡ ಸುಟ್ಟ ಗಾಯ, ರಾಸಾಯನಿಕ ಸುಟ್ಟ ಗಾಯ ಅಥವಾ ಮುಖದ ಮೇಲೆ ಸುಟ್ಟರೆ — ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ")
            )

            5 -> listOf( // Fracture
                Step(1, "Do NOT try to straighten or realign the broken bone yourself", "ಮುರಿದ ಮೂಳೆಯನ್ನು ನೀವೇ ನೇರ ಮಾಡಲು ಪ್ರಯತ್ನಿಸಬೇಡಿ"),
                Step(2, "Immobilise the injured area using a splint, rolled newspaper or firm cloth", "ಸ್ಪ್ಲಿಂಟ್, ಸುರುಳಿ ಮಾಡಿದ ಪೇಪರ್ ಅಥವಾ ಗಟ್ಟಿ ಬಟ್ಟೆ ಬಳಸಿ ಗಾಯದ ಭಾಗ ಚಲಿಸದಂತೆ ಇರಿಸಿ"),
                Step(3, "Apply ice pack wrapped in cloth to reduce swelling — not directly on skin", "ಊತ ಕಡಿಮೆ ಮಾಡಲು ಬಟ್ಟೆಯಲ್ಲಿ ಸುತ್ತಿದ ಐಸ್ ಪ್ಯಾಕ್ ಇಡಿ — ನೇರ ಚರ್ಮದ ಮೇಲೆ ಅಲ್ಲ"),
                Step(4, "Elevate the injured limb above heart level if possible", "ಸಾಧ್ಯವಾದರೆ ಗಾಯದ ಕೈ ಅಥವಾ ಕಾಲನ್ನು ಹೃದಯಕ್ಕಿಂತ ಮೇಲೆ ಎತ್ತಿ ಇಡಿ"),
                Step(5, "If bone is visible through skin — cover with clean cloth, do not push it back", "ಮೂಳೆ ಚರ್ಮದ ಮೂಲಕ ಕಾಣಿಸಿದರೆ — ಸ್ವಚ್ಛ ಬಟ್ಟೆಯಿಂದ ಮುಚ್ಚಿ, ಒಳಗೆ ತಳ್ಳಬೇಡಿ"),
                Step(6, "For spine, neck or hip injury — do NOT move the person at all", "ಬೆನ್ನುಮೂಳೆ, ಕತ್ತು ಅಥವಾ ಸೊಂಟ ಗಾಯವಾದರೆ — ವ್ಯಕ್ತಿಯನ್ನು ಚಲಿಸಬೇಡಿ"),
                Step(7, "Give pain relief only if available and person is conscious", "ವ್ಯಕ್ತಿ ಪ್ರಜ್ಞೆಯಲ್ಲಿದ್ದರೆ ಮಾತ್ರ ನೋವಿನ ಔಷಧ ನೀಡಿ"),
                Step(8, "Call 108 and keep the person still and warm until help arrives", "108 ಕರೆ ಮಾಡಿ ಮತ್ತು ಸಹಾಯ ಬರುವವರೆಗೆ ವ್ಯಕ್ತಿಯನ್ನು ಸ್ಥಿರವಾಗಿ ಮತ್ತು ಬೆಚ್ಚಗಿ ಇರಿಸಿ")
            )

            6 -> listOf( // Drowning
                Step(1, "Do NOT jump into water unless you are a trained swimmer", "ನೀವು ತರಬೇತಿ ಪಡೆದ ಈಜುಗಾರರಲ್ಲದಿದ್ದರೆ ನೀರಿಗೆ ಹಾರಬೇಡಿ"),
                Step(2, "Throw a rope, branch, clothing or any floating object to the person", "ಹಗ್ಗ, ಕೊಂಬೆ, ಬಟ್ಟೆ ಅಥವಾ ತೇಲುವ ವಸ್ತು ಎಸೆದು ವ್ಯಕ್ತಿಯನ್ನು ಎಳೆಯಿರಿ"),
                Step(3, "Once out of water — lay them on their back on a flat surface", "ನೀರಿನಿಂದ ಹೊರ ತಂದ ತಕ್ಷಣ ಸಮತಲ ಜಾಗದಲ್ಲಿ ಮಲಗಿಸಿ"),
                Step(4, "Check for breathing — tilt head back, lift chin, look for chest movement", "ಉಸಿರಾಟ ಪರೀಕ್ಷಿಸಿ — ತಲೆ ಹಿಂದಕ್ಕೆ ತಿರುಗಿಸಿ, ಗದ್ದ ಮೇಲಕ್ಕೆತ್ತಿ, ಎದೆ ಚಲನೆ ನೋಡಿ"),
                Step(5, "If not breathing — start CPR immediately (30 compressions, 2 rescue breaths)", "ಉಸಿರಾಡದಿದ್ದರೆ — ತಕ್ಷಣ CPR ಪ್ರಾರಂಭಿಸಿ (30 ಒತ್ತುವಿಕೆ, 2 ಉಸಿರು)"),
                Step(6, "Do NOT try to shake or turn upside down to remove water", "ನೀರು ತೆಗೆಯಲು ತಲೆಕೆಳಗಾಗಿ ತಿರುಗಿಸಬೇಡಿ ಅಥವಾ ಅಲ್ಲಾಡಿಸಬೇಡಿ"),
                Step(7, "Keep them warm — remove wet clothing, cover with blanket", "ಬೆಚ್ಚಗಿಡಿ — ಒದ್ದೆ ಬಟ್ಟೆ ತೆಗೆದು ಹೊದಿಕೆ ಹೊದಿಸಿ"),
                Step(8, "Call 108 immediately even if person seems to recover", "ವ್ಯಕ್ತಿ ಚೇತರಿಸಿಕೊಂಡಂತೆ ಕಂಡರೂ ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ")
            )

            7 -> listOf( // Seizure
                Step(1, "Stay calm — most seizures stop on their own within 1-2 minutes", "ಶಾಂತವಾಗಿರಿ — ಹೆಚ್ಚಿನ ಅಪಸ್ಮಾರ ದಾಳಿಗಳು 1-2 ನಿಮಿಷದಲ್ಲಿ ತಾನೇ ನಿಲ್ಲುತ್ತವೆ"),
                Step(2, "Clear the area — remove hard, sharp or hot objects from around them", "ಸುತ್ತ ಮುತ್ತಲಿನ ಗಟ್ಟಿ, ಚೂಪಾದ ಮತ್ತು ಬಿಸಿ ವಸ್ತುಗಳನ್ನು ತೆಗೆಯಿರಿ"),
                Step(3, "Gently turn the person on their side to prevent choking on saliva", "ಜೊಲ್ಲು ಸರಿಯಲು ವ್ಯಕ್ತಿಯನ್ನು ಮೆಲ್ಲಗೆ ಒಂದು ಬದಿಗೆ ತಿರುಗಿಸಿ"),
                Step(4, "Place something soft under their head — a folded cloth or jacket", "ತಲೆಯ ಕೆಳಗೆ ಮಡಿಸಿದ ಬಟ್ಟೆ ಅಥವಾ ಜ್ಯಾಕೆಟ್ ಇಡಿ"),
                Step(5, "Do NOT hold down or restrain the person forcefully", "ವ್ಯಕ್ತಿಯನ್ನು ಬಲವಾಗಿ ಹಿಡಿಯಬೇಡಿ ಅಥವಾ ತಡೆಯಬೇಡಿ"),
                Step(6, "Do NOT put anything in their mouth — they cannot swallow their tongue", "ಬಾಯಿಯಲ್ಲಿ ಏನನ್ನೂ ಹಾಕಬೇಡಿ — ನಾಲಿಗೆ ನುಂಗಲು ಸಾಧ್ಯವಿಲ್ಲ"),
                Step(7, "Time the seizure — if it lasts more than 5 minutes call 108 immediately", "ದಾಳಿಯ ಅವಧಿ ಗಮನಿಸಿ — 5 ನಿಮಿಷಕ್ಕಿಂತ ಹೆಚ್ಚು ನಡೆದರೆ ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ"),
                Step(8, "After seizure — keep them on their side, speak calmly until they are aware", "ದಾಳಿ ನಿಂತ ನಂತರ — ಅವರು ಎಚ್ಚರವಾಗುವವರೆಗೆ ಪಕ್ಕಕ್ಕೆ ಮಲಗಿಸಿ ಶಾಂತವಾಗಿ ಮಾತನಾಡಿ")
            )

            8 -> listOf( // Electric Shock
                Step(1, "Do NOT touch the person directly — you will also get shocked", "ವ್ಯಕ್ತಿಯನ್ನು ನೇರವಾಗಿ ಮುಟ್ಟಬೇಡಿ — ನಿಮಗೂ ವಿದ್ಯುತ್ ಆಘಾತ ಆಗುತ್ತದೆ"),
                Step(2, "Switch off the main power switch immediately or unplug the device", "ತಕ್ಷಣ ಮುಖ್ಯ ವಿದ್ಯುತ್ ಸ್ವಿಚ್ ಆಫ್ ಮಾಡಿ ಅಥವಾ ಪ್ಲಗ್ ತೆಗೆಯಿರಿ"),
                Step(3, "If power cannot be shut — push them away using dry wood, rubber or plastic", "ಸ್ವಿಚ್ ಆಫ್ ಮಾಡಲು ಸಾಧ್ಯವಿಲ್ಲದಿದ್ದರೆ — ಒಣ ಮರ, ರಬ್ಬರ್ ಅಥವಾ ಪ್ಲಾಸ್ಟಿಕ್‌ನಿಂದ ತಳ್ಳಿ"),
                Step(4, "Check breathing — if not breathing start CPR immediately", "ಉಸಿರಾಟ ಪರೀಕ್ಷಿಸಿ — ಉಸಿರಾಡದಿದ್ದರೆ ತಕ್ಷಣ CPR ಪ್ರಾರಂಭಿಸಿ"),
                Step(5, "Treat visible burns with cool water — do not use ice", "ಕಾಣುವ ಸುಟ್ಟ ಗಾಯಗಳನ್ನು ತಂಪು ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ — ಐಸ್ ಬಳಸಬೇಡಿ"),
                Step(6, "Do not give food or water if person is unconscious", "ವ್ಯಕ್ತಿ ಪ್ರಜ್ಞೆಯಲ್ಲಿ ಇಲ್ಲದಿದ್ದರೆ ಆಹಾರ ಅಥವಾ ನೀರು ನೀಡಬೇಡಿ"),
                Step(7, "Call 108 — all electric shock victims need hospital evaluation", "108 ಕರೆ ಮಾಡಿ — ವಿದ್ಯುತ್ ಆಘಾತಕ್ಕೊಳಗಾದ ಎಲ್ಲರಿಗೂ ಆಸ್ಪತ್ರೆ ಮೌಲ್ಯಮಾಪನ ಅಗತ್ಯ")
            )

            9 -> listOf( // Poisoning
                Step(1, "Identify the poison — read label, note substance name and amount taken", "ವಿಷ ಗುರುತಿಸಿ — ಲೇಬಲ್ ಓದಿ, ವಸ್ತುವಿನ ಹೆಸರು ಮತ್ತು ತೆಗೆದುಕೊಂಡ ಪ್ರಮಾಣ ಗಮನಿಸಿ"),
                Step(2, "Do NOT induce vomiting unless specifically told by doctor or 108 operator", "ವೈದ್ಯರು ಅಥವಾ 108 ಆಪರೇಟರ್ ಹೇಳದ ಹೊರತು ವಾಂತಿ ಮಾಡಿಸಬೇಡಿ"),
                Step(3, "For skin contact — remove clothing and wash skin with soap and water for 15 min", "ಚರ್ಮಕ್ಕೆ ಸಂಪರ್ಕವಾದರೆ — ಬಟ್ಟೆ ತೆಗೆದು 15 ನಿಮಿಷ ಸೋಪು ಮತ್ತು ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ"),
                Step(4, "For eye contact — rinse eye with clean water continuously for 15 minutes", "ಕಣ್ಣಿಗೆ ಸಂಪರ್ಕವಾದರೆ — 15 ನಿಮಿಷ ಸ್ವಚ್ಛ ನೀರಿನಿಂದ ತೊಳೆಯಿರಿ"),
                Step(5, "Keep the person awake and monitor breathing closely", "ವ್ಯಕ್ತಿಯನ್ನು ಎಚ್ಚರವಾಗಿ ಇಡಿ ಮತ್ತು ಉಸಿರಾಟ ಗಮನಿಸಿ"),
                Step(6, "Bring the poison container or pill bottle to hospital — helps doctors treat faster", "ವಿಷದ ಡಬ್ಬ ಅಥವಾ ಮಾತ್ರೆ ಬಾಟಲ್ ಆಸ್ಪತ್ರೆಗೆ ತಂದರೆ ವೈದ್ಯರಿಗೆ ತ್ವರಿತ ಚಿಕಿತ್ಸೆ ಸಾಧ್ಯ"),
                Step(7, "Call 108 immediately with details of what was swallowed", "ಏನು ನುಂಗಿದ್ದಾರೆ ಎಂಬ ವಿವರದೊಂದಿಗೆ ತಕ್ಷಣ 108 ಕರೆ ಮಾಡಿ")
            )

            10 -> listOf( // Allergic Reaction
                Step(1, "Identify and remove the trigger — food, insect sting, medicine or plant", "ಪ್ರಚೋದನೆ ಗುರುತಿಸಿ ತೆಗೆಯಿರಿ — ಆಹಾರ, ಕೀಟ ಕುಟುಕು, ಔಷಧ ಅಥವಾ ಗಿಡ"),
                Step(2, "For severe reaction (anaphylaxis) — use EpiPen if available, inject outer thigh", "ತೀವ್ರ ಪ್ರತಿಕ್ರಿಯೆಗೆ — ಎಪಿಪೆನ್ ಲಭ್ಯವಿದ್ದರೆ ತೊಡೆಯ ಹೊರ ಭಾಗಕ್ಕೆ ಚುಚ್ಚಿ"),
                Step(3, "Make person sit upright if having difficulty breathing", "ಉಸಿರಾಡಲು ಕಷ್ಟವಾದರೆ ವ್ಯಕ್ತಿಯನ್ನು ನೇರವಾಗಿ ಕೂರಿಸಿ"),
                Step(4, "If unconscious and breathing — lay on side in recovery position", "ಪ್ರಜ್ಞೆ ತಪ್ಪಿ ಉಸಿರಾಡುತ್ತಿದ್ದರೆ — ಪಕ್ಕಕ್ಕೆ ತಿರುಗಿಸಿ ಮಲಗಿಸಿ"),
                Step(5, "For hives or skin rash — apply cool wet cloth to reduce itching", "ಚರ್ಮದ ಮೇಲೆ ತುರಿಕೆ ಅಥವಾ ಗುಳ್ಳೆ ಆದರೆ — ತಂಪು ಒದ್ದೆ ಬಟ್ಟೆ ಇಡಿ"),
                Step(6, "Do NOT give antihistamine to unconscious person", "ಪ್ರಜ್ಞೆ ಇಲ್ಲದ ವ್ಯಕ್ತಿಗೆ ಆಂಟಿಹಿಸ್ಟಮಿನ್ ನೀಡಬೇಡಿ"),
                Step(7, "Call 108 for severe reactions — swelling of throat is life threatening", "ಗಂಟಲು ಊತ ಜೀವಕ್ಕೆ ಅಪಾಯ — ತೀವ್ರ ಪ್ರತಿಕ್ರಿಯೆಗೆ 108 ಕರೆ ಮಾಡಿ")
            )

            else -> listOf(
                Step(1, "Stay calm and assess the situation carefully", "ಶಾಂತವಾಗಿರಿ ಮತ್ತು ಪರಿಸ್ಥಿತಿ ಅಳೆಯಿರಿ"),
                Step(2, "Ensure the area is safe for you and the patient", "ನೀವು ಮತ್ತು ರೋಗಿಗೆ ಪ್ರದೇಶ ಸುರಕ್ಷಿತವೆಂದು ಖಚಿತಪಡಿಸಿ"),
                Step(3, "Check if the person is conscious — tap shoulder and call out loudly", "ವ್ಯಕ್ತಿ ಪ್ರಜ್ಞೆಯಲ್ಲಿ ಇದ್ದಾರೆಯೇ — ಭುಜ ತಟ್ಟಿ ಜೋರಾಗಿ ಕರೆಯಿರಿ"),
                Step(4, "Check breathing — look for chest movement for 10 seconds", "ಉಸಿರಾಟ ಪರೀಕ್ಷಿಸಿ — 10 ಸೆಕೆಂಡ್ ಎದೆ ಚಲನೆ ನೋಡಿ"),
                Step(5, "If not breathing — start CPR immediately (30 compressions + 2 breaths)", "ಉಸಿರಾಡದಿದ್ದರೆ — ತಕ್ಷಣ CPR ಮಾಡಿ (30 ಒತ್ತುವಿಕೆ + 2 ಉಸಿರು)"),
                Step(6, "Send someone to call 108 while you continue first aid", "ನೀವು ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ ಮುಂದುವರಿಸುವಾಗ ಬೇರೊಬ್ಬರನ್ನು 108 ಕರೆ ಮಾಡಲು ಕಳುಹಿಸಿ"),
                Step(7, "Keep the person warm and still until ambulance arrives", "ಆಂಬ್ಯುಲೆನ್ಸ್ ಬರುವವರೆಗೆ ವ್ಯಕ್ತಿಯನ್ನು ಬೆಚ್ಚಗಿ ಮತ್ತು ಸ್ಥಿರವಾಗಿ ಇರಿಸಿ")
            )
        }
    }
}