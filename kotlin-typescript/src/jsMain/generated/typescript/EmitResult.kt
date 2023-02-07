// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface EmitResult {
    var emitSkipped: Boolean

    /** Contains declaration emit diagnostics */
    var diagnostics: ReadonlyArray<Diagnostic>
    var emittedFiles: ReadonlyArray<String>?
}
