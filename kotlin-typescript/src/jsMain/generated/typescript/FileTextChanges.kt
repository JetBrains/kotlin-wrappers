// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface FileTextChanges {
    var fileName: String
    var textChanges: ReadonlyArray<TextChange>
    var isNewFile: Boolean?
}
