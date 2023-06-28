// Automatically generated - do not modify!

package web.clipboard

import js.core.ReadonlyArray
import js.core.ReadonlyRecord
import js.promise.Promise
import web.buffer.Blob

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem)
 */
external class ClipboardItem(
    items: ReadonlyRecord<String, Any /* String | Blob | PromiseLike<String | Blob> */>,
    options: ClipboardItemOptions = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types) */
    val types: ReadonlyArray<String>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType) */
    fun getType(type: String): Promise<Blob>
}
