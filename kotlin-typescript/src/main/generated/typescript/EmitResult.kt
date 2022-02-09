// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface EmitResult {
    var emitSkipped: Boolean

    /** Contains declaration emit diagnostics */
    var diagnostics: ReadonlyArray<Diagnostic>
    var emittedFiles: ReadonlyArray<String>?
}
