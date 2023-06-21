// Automatically generated - do not modify!

package web.clipboard

import js.core.Void
import web.events.EventTarget
import kotlin.js.Promise

sealed external class Clipboard :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read) */
    fun read(): Promise<ClipboardItems>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText) */
    fun readText(): Promise<String>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write) */
    fun write(data: ClipboardItems): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText) */
    fun writeText(data: String): Promise<Void>
}
