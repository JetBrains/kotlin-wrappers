// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface ProgramUpdateLevel {
    companion object {
        /** Program is updated with same root file names and options */
        val Update: ProgramUpdateLevel

        /** Loads program after updating root file names from the disk */
        val RootNamesAndUpdate: ProgramUpdateLevel

        /**
         * Loads program completely, including:
         *  - re-reading contents of config file from disk
         *  - calculating root file names for the program
         *  - Updating the program
         */
        val Full: ProgramUpdateLevel
    }
}
