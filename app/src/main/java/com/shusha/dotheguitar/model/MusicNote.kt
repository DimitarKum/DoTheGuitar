package com.shusha.dotheguitar.model

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