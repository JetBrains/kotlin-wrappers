// Automatically generated - do not modify!

package web.clipboard

import js.core.ReadonlyArray
import js.core.ReadonlyRecord
import web.buffer.Blob
import kotlin.js.Promise

external class ClipboardItem(
    items: ReadonlyRecord<String, Any /* String | Blob | PromiseLike<String | Blob> */>,
    options: ClipboardItemOptions = definedExternally,
) {
    val types: ReadonlyArray<String>
    fun getType(type: String): Promise<Blob>
}
