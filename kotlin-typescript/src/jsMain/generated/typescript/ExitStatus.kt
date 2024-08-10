// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/** Return code used by getEmitOutput function to indicate status of the function */
sealed external interface ExitStatus {
    companion object {
        val Success: ExitStatus
        val DiagnosticsPresent_OutputsSkipped: ExitStatus
        val DiagnosticsPresent_OutputsGenerated: ExitStatus
        val InvalidProject_OutputsSkipped: ExitStatus
        val ProjectReferenceCycle_OutputsSkipped: ExitStatus
    }
}
