// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlin.js.Promise

sealed external interface ReadableStreamGenericReader {
    val closed: Promise<Void>
    fun cancel(reason: Any = definedExternally): Promise<Void>
}
