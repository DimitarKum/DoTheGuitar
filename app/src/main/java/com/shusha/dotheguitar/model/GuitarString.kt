package com.shusha.dotheguitar.model

enum class GuitarString(val note: MusicNote, val text: String) {
    FIRST(MusicNote.E, "1st"),
    SECOND(MusicNote.B, "2nd"),
    THIRD(MusicNote.G, "3rd"),
    FOURTH(MusicNote.D, "4th"),
    FIFTH(MusicNote.A, "5th"),
    SIXTH(MusicNote.E, "6th");

    fun findPositionOfNoteOnString(note: MusicNote): Int {
        return this.note.findDistanceToNote(note)
    }
}