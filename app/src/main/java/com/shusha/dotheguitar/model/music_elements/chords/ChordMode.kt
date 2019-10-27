package com.shusha.dotheguitar.model.music_elements.chords

import com.shusha.dotheguitar.model.music_elements.GuitarString


const val EMPTY_FRET: Int = 100

enum class ChordMode(
    val symbol: String,
    val fullName: String,
    val referenceStringToFretPositions: Map<GuitarString, IntArray>
) {
    MAJOR(
        "△7",
        "major",
        mapOf(
            GuitarString.FIFTH to intArrayOf(
                EMPTY_FRET, 0, 2, 1, 2,
                EMPTY_FRET
            ),
            GuitarString.SIXTH to intArrayOf(0,
                EMPTY_FRET, 1, 1, 0,
                EMPTY_FRET
            )
        )
    ),
    MINOR(
        "-7",
        "minor",
        mapOf(
            GuitarString.FIFTH to intArrayOf(
                EMPTY_FRET, 0, 2, 0, 1,
                EMPTY_FRET
            ),
            GuitarString.SIXTH to intArrayOf(0,
                EMPTY_FRET, 0, 0, 0,
                EMPTY_FRET
            )
        )
    ),
    DOMINANT(
        "7",
        "dominant",
        mapOf(
            GuitarString.FIFTH to intArrayOf(
                EMPTY_FRET, 0, -1, 0, -2,
                EMPTY_FRET
            ),
            GuitarString.SIXTH to intArrayOf(0,
                EMPTY_FRET, 0, 1, 0,
                EMPTY_FRET
            )
        )
    ),
    HALF_DIMINISHED(
        "ø7",
        "half-diminished",
        mapOf(
            GuitarString.FIFTH to intArrayOf(
                EMPTY_FRET, 0, 1, 0, 1,
                EMPTY_FRET
            ),
            GuitarString.SIXTH to intArrayOf(0,
                EMPTY_FRET, 0, 0, -1,
                EMPTY_FRET
            )
        )
    );
}