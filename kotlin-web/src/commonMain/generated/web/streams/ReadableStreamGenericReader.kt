// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.streams

import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

sealed external interface ReadableStreamGenericReader {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/closed)
     */
    val closed: Promise<Void>
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel)
     */
    @JsName("cancel")
    fun cancelAsync(reason: JsError? = definedExternally): Promise<Void> = definedExternally
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel)
 */
suspend inline fun ReadableStreamGenericReader.cancel(reason: JsError?) {
    cancelAsync(
        reason = reason,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel)
 */
suspend inline fun ReadableStreamGenericReader.cancel() {
    cancelAsync().await()
}
