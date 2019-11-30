package com.shusha.dotheguitar.model.displayable_elements

import com.shusha.dotheguitar.model.music_elements.Tab

class DisplayableTab(val cannonicalTab: Tab?, val offset: Int) {

    override fun toString(): String {
        val offsetTab: Tab? = cannonicalTab?.getOffsetedTab(offset)
//        return musicChord.mode.referenceStringToFretPositions[rootString]
//            ?.map { fret -> if (fret == EMPTY_FRET) "-" else (fret + rootPosition).toString() }
//            ?.reversed()
//            ?.joinToString(
//                prefix = "---",
//                postfix = "---",
//                separator = "---\n---"
//            ).orEmpty()
        var stringRepresentation = ""
        if (offsetTab != null) {
            System.out.println("debugdebug: offsetTab.getStartFret() = " + offsetTab.getStartFret())
            System.out.println("debugdebug: offsetTab.getStartFret() + offsetTab.getRange() = " + (offsetTab.getStartFret() + offsetTab.getRange()))
            for (notesInString in offsetTab.stringToNotesMap.values) {
                stringRepresentation += "∙∙"
                for (i in offsetTab.getStartFret()..offsetTab.getStartFret() + offsetTab.getRange()) {
                    stringRepresentation += if (i in notesInString) {
                        "$i∙∙"
                    } else {
                        "∙∙∙"
                    }
                }
                stringRepresentation += "∙∙\n"
            }
        }
        return stringRepresentation
//        return "∙∙5∙∙6∙∙∙∙∙8∙∙∙∙\n∙∙∙∙∙6∙∙∙∙∙8∙∙∙∙\n∙∙5∙∙∙∙∙7∙∙8∙∙∙∙\n∙∙5∙∙∙∙∙7∙∙8∙∙∙∙\n∙∙5∙∙6∙∙∙∙∙8∙∙∙∙\n∙∙5∙∙6∙∙∙∙∙8∙∙9∙"
    }
}
