package com.pratham.chikitse

object EmergencyData {
    fun getEmergencies(): List<Emergency> {
        return listOf(
            Emergency(1,  "Snake Bite",       "ಹಾವು ಕಡಿತ",        R.drawable.ic_snake),
            Emergency(2,  "Heart Attack",     "ಹೃದಯಾಘಾತ",         R.drawable.ic_heart),
            Emergency(3,  "Choking",          "ಉಸಿರುಗಟ್ಟುವಿಕೆ",   R.drawable.ic_choke),
            Emergency(4,  "Burns",            "ಸುಟ್ಟ ಗಾಯ",         R.drawable.ic_burn),
            Emergency(5,  "Fracture",         "ಮೂಳೆ ಮುರಿತ",       R.drawable.ic_fracture),
            Emergency(6,  "Drowning",         "ಮುಳುಗುವಿಕೆ",       R.drawable.ic_drown),
            Emergency(7,  "Seizure",          "ಅಪಸ್ಮಾರ",           R.drawable.ic_seizure),
            Emergency(8,  "Electric Shock",   "ವಿದ್ಯುತ್ ಆಘಾತ",    R.drawable.ic_electric),
            Emergency(9,  "Poisoning",        "ವಿಷ ಸೇವನೆ",        R.drawable.ic_poison),
            Emergency(10, "Allergic Reaction","ಅಲರ್ಜಿ ಪ್ರತಿಕ್ರಿಯೆ", R.drawable.ic_allergy),
            Emergency(11, "Bleeding",         "ರಕ್ತಸ್ರಾವ",         R.drawable.ic_bleeding),
            Emergency(12, "CPR",              "ಸಿಪಿಆರ್",           R.drawable.ic_cpr),
            Emergency(13, "Asthma Attack",    "ಆಸ್ತಮಾ ದಾಳಿ",      R.drawable.ic_asthma),
            Emergency(14, "Eye Injury",       "ಕಣ್ಣಿನ ಗಾಯ",       R.drawable.ic_eye),
            Emergency(15, "Head Injury",      "ತಲೆ ಗಾಯ",          R.drawable.ic_head),
            Emergency(16, "Sprain",           "ಮಚ್ಚೆ ಉಳುಕು",      R.drawable.ic_sprain),
            Emergency(17, "Fainting",         "ಮೂರ್ಛೆ",            R.drawable.ic_fainting),
            Emergency(18, "Nose Bleed",       "ಮೂಗಿನ ರಕ್ತಸ್ರಾವ",  R.drawable.ic_nose),
            Emergency(19, "Dog Bite",         "ನಾಯಿ ಕಡಿತ",        R.drawable.ic_dogbite),
            Emergency(20, "Heat Stroke",      "ಶಾಖದ ಹೊಡೆತ",       R.drawable.ic_heatstroke)
        )
    }
}