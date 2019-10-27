package com.shusha.dotheguitar.model.music_elements.chords

import com.shusha.dotheguitar.model.music_elements.MusicNote

class MusicChord(
    val rootNote: MusicNote,
    val mode: ChordMode
) {
    val text: String = rootNote.text + mode.symbol
}