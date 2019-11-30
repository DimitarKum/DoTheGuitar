package com.shusha.dotheguitar.model.music_elements.scales

import com.shusha.dotheguitar.model.music_elements.GuitarString

enum class ScaleMode(
    val modeName: String
//    val referenceStringToFretPositions: Map<GuitarString, Map<GuitarString, IntArray>>
) {
    MAJOR("MAJOR"),
    MINOR("MINOR")
//    enum class ChordMode(
//        val symbol: String,
//        val fullName: String,
//        val referenceStringToFretPositions: Map<GuitarString, IntArray>
//    ) {
//        MAJOR(
//            "△7",
//            "major",
//            mapOf(
//                GuitarString.FIFTH to intArrayOf(
//                    EMPTY_FRET, 0, 2, 1, 2,
//                    EMPTY_FRET
//                ),
//                GuitarString.SIXTH to intArrayOf(
//                    0, EMPTY_FRET, 1, 1, 0, EMPTY_FRET
//                )
//            )
//        ),
}