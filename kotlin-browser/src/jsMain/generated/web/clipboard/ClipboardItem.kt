// Automatically generated - do not modify!

package web.clipboard

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.promise.Promise
import seskar.js.JsAsync
import web.blob.Blob

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem)
 */
external class ClipboardItem(
    items: ReadonlyRecord<String, Any /* String | Blob | PromiseLike<String | Blob> */>,
    options: ClipboardItemOptions = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle)
     */
    val presentationStyle: PresentationStyle

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types)
     */
    val types: ReadonlyArray<String>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType)
     */
    @JsAsync
    suspend fun getType(type: String): Blob

    @JsName("getType")
    fun getTypeAsync(type: String): Promise<Blob>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/supports_static)
         */
        fun supports(type: String): Boolean
    }
}
