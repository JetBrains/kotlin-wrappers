// Automatically generated - do not modify!

package web.abort

import js.array.ReadonlyArray
import js.core.UInt53
import js.errors.JsError
import web.events.*
import kotlin.js.definedExternally

/**
 * The **`AbortSignal`** interface represents a signal object that allows you to communicate with an asynchronous operation (such as a fetch request) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 */
external class AbortSignal
private constructor() :
    EventTarget {
    /**
     * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
     */
    val aborted: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
     */
    var onabort: EventHandler<Event, AbortSignal, AbortSignal>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     */
    val reason: JsError?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     */
    fun throwIfAborted()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<Event, AbortSignal /* this */, AbortSignal /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         */
        fun abort(reason: JsError? = definedExternally): AbortSignal

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         */
        fun any(signals: ReadonlyArray<AbortSignal>): AbortSignal

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         */
        fun timeout(milliseconds: UInt53): AbortSignal
    }
}
