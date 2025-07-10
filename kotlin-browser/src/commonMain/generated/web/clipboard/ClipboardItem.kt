// Automatically generated - do not modify!

package web.clipboard

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import web.blob.Blob
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ClipboardItem`** interface of the Clipboard API represents a single item format, used when reading or writing clipboard data using Clipboard.read() and Clipboard.write() respectively.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem)
 */
open external class ClipboardItem(
    items: ReadonlyRecord<JsString, JsAny /* String | Blob | PromiseLike<String | Blob> */>,
    options: ClipboardItemOptions = definedExternally,
) {
    /**
     * The read-only **`presentationStyle`** property of the ClipboardItem interface returns a string indicating how an item should be presented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle)
     */
    val presentationStyle: PresentationStyle

    /**
     * The read-only **`types`** property of the ClipboardItem interface returns an Array of MIME type available within the ClipboardItem.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types)
     */
    val types: ReadonlyArray<JsString>

    /**
     * The **`getType()`** method of the ClipboardItem interface returns a Promise that resolves with a Blob of the requested MIME type or an error if the MIME type is not found.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType)
     */
    @JsName("getType")
    fun getTypeAsync(type: String): Promise<Blob>

    companion object {
        /**
         * The **`supports()`** static method of the ClipboardItem interface returns `true` if the given MIME type is supported by the clipboard, and `false` otherwise.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/supports_static)
         */
        fun supports(type: String): Boolean
    }
}

/**
 * The **`getType()`** method of the ClipboardItem interface returns a Promise that resolves with a Blob of the requested MIME type or an error if the MIME type is not found.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType)
 */
suspend inline fun ClipboardItem.getType(type: String): Blob {
    return getTypeAsync(type = type).await()
}
