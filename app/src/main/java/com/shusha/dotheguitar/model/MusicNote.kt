package com.shusha.dotheguitar.model

fun findPositionOfNoteOnString(note: MusicNote, stringNumber: Int): Int {
    if (stringNumber < 1 || stringNumber > 6) throw IllegalArgumentException(
        "findOnString for $stringNumber is not defined. Only 5 and 6 are allowed."
    )

    return getNoteForString(stringNumber).findDistanceToNote(note)
}

fun getNoteForString(stringNumber: Int): MusicNote {
    return when (stringNumber) {
        1 -> MusicNote.E
        2 -> MusicNote.B
        3 -> MusicNote.G
        4 -> MusicNote.D
        5 -> MusicNote.A
        6 -> MusicNote.E
        else -> throw IllegalArgumentException(
            "getNoteForString for $stringNumber is not defined. Only 1...6 are allowed."
        )
    }
}

enum class MusicNote(val text: String) {
    A("A"),
    A_SHARP("A#"),
    B("B"),
    C("C"),
    C_SHARP("C#"),
    D("D"),
    D_SHARP("D#"),
    E("E"),
    F("F"),
    F_SHARP("F#"),
    G("G"),
    G_SHARP("G#");
    /**
     * Returns the positive distance needed to advance from the current note to the targetNote.
     */
    fun findDistanceToNote(targetNote: MusicNote): Int {
        return (targetNote.ordinal - this.ordinal + MusicNote.values().size) % MusicNote.values().size

    }
}