// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

/** Return code used by getEmitOutput function to indicate status of the function */
// language=JavaScript
@JsName("""(/*union*/{Success: 0, DiagnosticsPresent_OutputsSkipped: 1, DiagnosticsPresent_OutputsGenerated: 2, InvalidProject_OutputsSkipped: 3, ProjectReferenceCycle_OutputsSkipped: 4, ProjectReferenceCycle_OutputsSkupped: 4}/*union*/)""")
external enum class ExitStatus {
    Success,
    DiagnosticsPresent_OutputsSkipped,
    DiagnosticsPresent_OutputsGenerated,
    InvalidProject_OutputsSkipped,
    ProjectReferenceCycle_OutputsSkipped,

    /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
    ProjectReferenceCycle_OutputsSkupped,

    ;
}
