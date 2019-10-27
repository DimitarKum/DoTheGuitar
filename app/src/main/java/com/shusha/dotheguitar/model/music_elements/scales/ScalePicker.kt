package com.shusha.dotheguitar.model.music_elements.scales

import com.shusha.dotheguitar.model.displayable_elements.DisplayableScale
import com.shusha.dotheguitar.model.music_elements.GuitarString
import java.util.*

class ScalePicker {
    private val pickableStrings: List<GuitarString> = listOf(
        GuitarString.FOURTH,
        GuitarString.FIFTH,
        GuitarString.SIXTH
    )

    fun pickAScale(): DisplayableScale {
        return DisplayableScale(
            createARandomMusicScale(),
            pickableStrings[Random().nextInt(pickableStrings.size)],
            Random().nextInt(2) == 1
        )
    }
}