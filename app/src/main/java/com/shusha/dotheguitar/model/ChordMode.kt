package com.shusha.dotheguitar.model

enum class ChordMode(val symbol: String, val fullName: String) {
    MAJOR("△7", "major"),
    MINOR("-7", "minor"),
    DOMINANT("7", "dominant"),
    HALF_DIMINISHED("ø7", "half-diminished")
}