// Automatically generated - do not modify!

package web.stream

import kotlinx.js.Void
import kotlin.js.Promise

sealed external interface ReadableStreamGenericReader {
    val closed: Promise<Void>
    fun cancel(reason: Any = definedExternally): Promise<Void>
}
