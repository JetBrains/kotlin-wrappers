// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ProgramUpdateLevel {
    companion object {
        /** Program is updated with same root file names and options */
        @JsIntValue(0)
        val Update: ProgramUpdateLevel

        /** Loads program after updating root file names from the disk */
        @JsIntValue(1)
        val RootNamesAndUpdate: ProgramUpdateLevel

        /**
         * Loads program completely, including:
         *  - re-reading contents of config file from disk
         *  - calculating root file names for the program
         *  - Updating the program
         */
        @JsIntValue(2)
        val Full: ProgramUpdateLevel
    }
}
