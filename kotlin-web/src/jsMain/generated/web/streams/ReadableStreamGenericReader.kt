// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.streams

import js.core.Void
import js.errors.JsError
import js.promise.Promise

sealed external interface ReadableStreamGenericReader {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/closed)
     */
    val closed: Promise<Void>
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel)
     */
    suspend fun cancel(reason: JsError = definedExternally): Unit = definedExternally

    @JsName("cancel")
    fun cancelAsync(reason: JsError = definedExternally): Promise<Void> = definedExternally
}
