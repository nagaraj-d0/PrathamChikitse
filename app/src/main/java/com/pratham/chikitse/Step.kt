package com.pratham.chikitse

data class Step(
    val stepNumber: Int,
    val instructionEn: String,
    val instructionKn: String,
    val isDo: Boolean = true
)