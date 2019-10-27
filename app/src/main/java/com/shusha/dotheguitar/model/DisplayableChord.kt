package com.shusha.dotheguitar.model

import java.util.*

class DisplayableChord(
    private val rootNote: MusicNote,
    private val mode: ChordMode,
    private val rootString: Int
) {

    fun getFullName(): String {
        return rootNote.text + mode.symbol + " on " + rootString + "th string"
    }

    fun getTab(): String {
        val rootPosition: Int = findPositionOfNoteOnString(rootNote, rootString)
//        val frets: IntArray? = mode.referenceStringToFretPositions.get(rootString)
////        .forEach { fret -> fret+ rootPosition}
////        frets?.forEach { fret -> fret+ rootPosition}.
//        val transformedFrets: List<Int>? = frets?.map { fret -> fret + rootPosition }
//        val result: String? =
//            transformedFrets?.joinToString(prefix = "---", postfix = "---", separator = "\n")
//        return result.orEmpty()

        return mode.referenceStringToFretPositions[rootString]
            ?.map { fret -> if (fret == EMPTY_FRET) "-" else (fret + rootPosition).toString() }
            ?.reversed()
            ?.joinToString(
                prefix = "---",
                postfix = "---",
                separator = "---\n---"
            ).orEmpty()
    }
}