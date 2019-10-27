package com.shusha.dotheguitar.model.music_elements.scales

import com.shusha.dotheguitar.model.music_elements.MusicNote

// create a random scale
fun createARandomMusicScale(): MusicScale {
    return MusicScale(MusicNote.G_SHARP, ScaleMode.MAJOR)
}

class MusicScale(val rootNote: MusicNote, val scaleMode: ScaleMode) {
}