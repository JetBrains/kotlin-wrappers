// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface CombinedCodeActions {
    var changes: ReadonlyArray<FileTextChanges>
    var commands: ReadonlyArray<CodeActionCommand>?
}
