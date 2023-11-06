// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

/** Return code used by getEmitOutput function to indicate status of the function */
@JsUnion
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

        /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
        @JsIntValue(4)
        val ProjectReferenceCycle_OutputsSkupped: ExitStatus
    }
}
