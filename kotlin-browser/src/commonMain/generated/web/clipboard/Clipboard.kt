// Automatically generated - do not modify!

package web.clipboard

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventTarget

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard)
 */
external class Clipboard
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read)
     */
    @JsAsync
    suspend fun read(): ClipboardItems

    @JsName("read")
    fun readAsync(): Promise<ClipboardItems>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText)
     */
    @JsAsync
    suspend fun readText(): String

    @JsName("readText")
    fun readTextAsync(): Promise<String>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write)
     */
    @JsAsync
    suspend fun write(data: ClipboardItems)

    @JsName("write")
    fun writeAsync(data: ClipboardItems): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText)
     */
    @JsAsync
    suspend fun writeText(data: String)

    @JsName("writeText")
    fun writeTextAsync(data: String): Promise<Void>
}
