// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface FileTextChanges {
    var fileName: String
    var textChanges: ReadonlyArray<TextChange>
    var isNewFile: Boolean?
}
