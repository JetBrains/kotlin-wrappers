// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

/** Return code used by getEmitOutput function to indicate status of the function */
// language=JavaScript
@JsName("""(/*union*/{Success: 0, DiagnosticsPresent_OutputsSkipped: 1, DiagnosticsPresent_OutputsGenerated: 2, InvalidProject_OutputsSkipped: 3, ProjectReferenceCycle_OutputsSkipped: 4, ProjectReferenceCycle_OutputsSkupped: 4}/*union*/)""")
sealed external interface ExitStatus {
    companion object {
        val Success: ExitStatus
        val DiagnosticsPresent_OutputsSkipped: ExitStatus
        val DiagnosticsPresent_OutputsGenerated: ExitStatus
        val InvalidProject_OutputsSkipped: ExitStatus
        val ProjectReferenceCycle_OutputsSkipped: ExitStatus

        /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
        val ProjectReferenceCycle_OutputsSkupped: ExitStatus
    }
}
