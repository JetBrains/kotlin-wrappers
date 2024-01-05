// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface CombinedCodeActions {
    var changes: ReadonlyArray<FileTextChanges>
    var commands: ReadonlyArray<CodeActionCommand>?
}
