package com.shusha.dotheguitar.model

class DisplayableChord(
    private val rootNote: MusicNote,
    private val mode: ChordMode,
    private val rootString: GuitarString
) {

    fun getFullName(): String {
        return rootNote.text + mode.symbol + " on " + rootString.text + " string"
    }

    fun getTab(): String {
        val rootPosition: Int = rootString.findPositionOfNoteOnString(rootNote)

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