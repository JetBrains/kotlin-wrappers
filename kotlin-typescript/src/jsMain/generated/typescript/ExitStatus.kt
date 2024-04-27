// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

/** Return code used by getEmitOutput function to indicate status of the function */
@JsVirtual
sealed external interface ExitStatus {
    companion object {
        @JsIntValue(0)
        val Success: ExitStatus

        @JsIntValue(1)
        val DiagnosticsPresent_OutputsSkipped: ExitStatus

        @JsIntValue(2)
        val DiagnosticsPresent_OutputsGenerated: ExitStatus

        @JsIntValue(3)
        val InvalidProject_OutputsSkipped: ExitStatus

        @JsIntValue(4)
        val ProjectReferenceCycle_OutputsSkipped: ExitStatus
    }
}
