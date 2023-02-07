// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface FileTextChanges {
    var fileName: String
    var textChanges: ReadonlyArray<TextChange>
    var isNewFile: Boolean?
}
