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
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types) */
    val types: ReadonlyArray<String>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType) */
    fun getType(type: String): Promise<Blob>
}
