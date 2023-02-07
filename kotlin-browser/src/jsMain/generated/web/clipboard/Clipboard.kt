// Automatically generated - do not modify!

package web.clipboard

import js.core.Void
import web.events.EventTarget
import kotlin.js.Promise

sealed external class Clipboard :
    EventTarget {
    fun read(): Promise<ClipboardItems>
    fun readText(): Promise<String>
    fun write(data: ClipboardItems): Promise<Void>
    fun writeText(data: String): Promise<Void>
}
