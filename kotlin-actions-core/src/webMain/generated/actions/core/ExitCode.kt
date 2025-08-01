// Automatically generated - do not modify!

package actions.core

import seskar.js.JsRawValue

sealed external interface ExitCode {
    companion object {
        /**
         * A code indicating that the action was successful
         */
        @JsRawValue("0")
        val Success: ExitCode

        /**
         * A code indicating that the action was a failure
         */
        @JsRawValue("1")
        val Failure: ExitCode
    }
}
