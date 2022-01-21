// Automatically generated - do not modify!

package typescript

external interface CodeFixAction : CodeAction {
    /** Short name to identify the fix, for use by telemetry. */
    var fixName: String

    /**
     * If present, one may call 'getCombinedCodeFix' with this fixId.
     * This may be omitted to indicate that the code fix can't be applied in a group.
     */
    var fixId: Any?
    var fixAllDescription: String?
}
