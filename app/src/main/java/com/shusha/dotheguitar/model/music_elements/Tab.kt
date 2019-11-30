package com.shusha.dotheguitar.model.music_elements

import com.shusha.dotheguitar.model.music_elements.chords.EMPTY_FRET
import kotlin.math.max
import kotlin.math.min

class Tab(val stringToNotesMap: Map<GuitarString, IntArray>) {

    fun getOffsetedTab(offset: Int): Tab {
        return Tab(stringToNotesMap.mapValues { notesOnString ->
            notesOnString.value.map { note -> if (note == EMPTY_FRET) EMPTY_FRET else note + offset }
                .toIntArray()
        })
    }

    fun getStartFret(): Int {
        var minFret: Int = 1000

        for (notesOnString in stringToNotesMap.values) {
            for (note in notesOnString) {
                if (note != EMPTY_FRET) {
                    minFret = min(minFret, note)
                }
            }
        }

        System.out.println("debugdebug: getStartFret... minFret = " + minFret)
        if (minFret == 1000) {
            return 0
        }
        return minFret
    }

    fun getRange(): Int {
        var minFret: Int = 1000
        var maxFret: Int = -1000

        for (notesOnString in stringToNotesMap.values) {
            for (note in notesOnString) {

                if (note != EMPTY_FRET) {
                    System.out.println("debugdebug: INSIDE IF note = " + note)
                    minFret = min(minFret, note)
                    maxFret = max(maxFret, note)
                } else {
                    System.out.println("debugdebug: INSIDE ELSE note = " + note)
                }
            }
        }

        System.out.println("debugdebug: getRange... minFret = " + minFret + ", maxFret = " + maxFret)
        if (minFret == 1000) {
            return 0
        }
        return maxFret - minFret
    }
}
