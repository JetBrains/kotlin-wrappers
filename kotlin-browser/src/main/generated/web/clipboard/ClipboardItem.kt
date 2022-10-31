// Automatically generated - do not modify!

package web.clipboard

import kotlinx.js.ReadonlyArray
import kotlinx.js.Record
import web.buffer.Blob
import kotlin.js.Promise

external class ClipboardItem(
    items: Record<String, Any /* String | Blob | PromiseLike<String | Blob> */>,
    options: ClipboardItemOptions = definedExternally,
) {
    val types: ReadonlyArray<String>
    fun getType(type: String): Promise<Blob>
}
