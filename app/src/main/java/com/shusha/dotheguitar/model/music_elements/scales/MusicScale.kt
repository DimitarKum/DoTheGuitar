package com.shusha.dotheguitar.model.music_elements.scales

import com.shusha.dotheguitar.model.music_elements.MusicNote
import java.util.*

private val pickableScaleModes: List<ScaleMode> = listOf(
    ScaleMode.MAJOR,
    ScaleMode.MINOR
)

// create a random scale
fun createARandomMusicScale(): MusicScale {
    return MusicScale(
        MusicNote.values()[Random().nextInt(
            MusicNote.values().size
        )], pickableScaleModes[Random().nextInt(pickableScaleModes.size)]
    )
}

class MusicScale(val rootNote: MusicNote, val scaleMode: ScaleMode) {
}