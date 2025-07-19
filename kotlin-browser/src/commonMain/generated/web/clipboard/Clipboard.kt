// Automatically generated - do not modify!

package web.clipboard

import js.core.JsString
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.EventTarget
import kotlin.js.JsName

/**
 * The **`Clipboard`** interface of the Clipboard API provides read and write access to the contents of the system clipboard.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard)
 */
open external class Clipboard
private constructor() :
    EventTarget {
    /**
     * The **`read()`** method of the Clipboard interface requests a copy of the clipboard's contents, fulfilling the returned Promise with the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read)
     */
    @JsName("read")
    fun readAsync(): Promise<ClipboardItems>

    /**
     * The **`readText()`** method of the Clipboard interface returns a Promise which fulfills with a copy of the textual contents of the system clipboard.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText)
     */
    @JsName("readText")
    fun readTextAsync(): Promise<JsString>

    /**
     * The **`write()`** method of the Clipboard interface writes arbitrary ClipboardItem data such as images and text to the clipboard, fulfilling the returned Promise on completion.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write)
     */
    @JsName("write")
    fun writeAsync(data: ClipboardItems): Promise<Void>

    /**
     * The **`writeText()`** method of the Clipboard interface writes the specified text to the system clipboard, returning a Promise that is resolved once the system clipboard has been updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText)
     */
    @JsName("writeText")
    fun writeTextAsync(data: String): Promise<Void>
}

/**
 * The **`read()`** method of the Clipboard interface requests a copy of the clipboard's contents, fulfilling the returned Promise with the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read)
 */
suspend inline fun Clipboard.read(): ClipboardItems {
    return readAsync().await()
}

/**
 * The **`readText()`** method of the Clipboard interface returns a Promise which fulfills with a copy of the textual contents of the system clipboard.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText)
 */
suspend inline fun Clipboard.readText(): String {
    return readTextAsync().await().toString()
}

/**
 * The **`write()`** method of the Clipboard interface writes arbitrary ClipboardItem data such as images and text to the clipboard, fulfilling the returned Promise on completion.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write)
 */
suspend inline fun Clipboard.write(data: ClipboardItems) {
    writeAsync(data = data).await()
}

/**
 * The **`writeText()`** method of the Clipboard interface writes the specified text to the system clipboard, returning a Promise that is resolved once the system clipboard has been updated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText)
 */
suspend inline fun Clipboard.writeText(data: String) {
    writeTextAsync(data = data).await()
}
