// Automatically generated - do not modify!

package web.clipboard

import js.core.JsString
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventTarget
import kotlin.js.JsName

/**
 * The **`Clipboard`** interface of the Clipboard API provides read and write access to the contents of the system clipboard.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard)
 */
external class Clipboard
private constructor() :
    EventTarget {
    /**
     * The **`read()`** method of the Clipboard interface requests a copy of the clipboard's contents, fulfilling the returned Promise with the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun read(): ClipboardItems

    @JsName("read")
    fun readAsync(): Promise<ClipboardItems>

    /**
     * The **`readText()`** method of the Clipboard interface returns a Promise which fulfills with a copy of the textual contents of the system clipboard.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun readText(): String

    @JsName("readText")
    fun readTextAsync(): Promise<JsString>

    /**
     * The **`write()`** method of the Clipboard interface writes arbitrary ClipboardItem data such as images and text to the clipboard, fulfilling the returned Promise on completion.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun write(data: ClipboardItems)

    @JsName("write")
    fun writeAsync(data: ClipboardItems): Promise<Void>

    /**
     * The **`writeText()`** method of the Clipboard interface writes the specified text to the system clipboard, returning a Promise that is resolved once the system clipboard has been updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun writeText(data: String)

    @JsName("writeText")
    fun writeTextAsync(data: String): Promise<Void>
}
