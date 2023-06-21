// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.streams

import js.core.Void
import kotlin.js.Promise

sealed external interface ReadableStreamGenericReader {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/closed) */
    val closed: Promise<Void>
        get() = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel) */
    fun cancel(reason: Any? = definedExternally): Promise<Void> = definedExternally
}
