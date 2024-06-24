// Automatically generated - do not modify!

package typescript

sealed external interface EmitResult {
    var emitSkipped: Boolean

    /** Contains declaration emit diagnostics */
    var diagnostics: js.array.ReadonlyArray<Diagnostic>
    var emittedFiles: js.array.ReadonlyArray<String>?
}
