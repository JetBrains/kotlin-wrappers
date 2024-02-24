// Automatically generated - do not modify!

package web.abort

import js.array.ReadonlyArray
import js.core.JsLong
import js.errors.JsError
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 */
sealed external class AbortSignal :
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
    var onabort: EventHandler<Event<AbortSignal>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     */
    val reason: JsError?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     */
    fun throwIfAborted()

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         */
        fun abort(reason: JsError = definedExternally): AbortSignal

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         */
        fun any(signals: ReadonlyArray<AbortSignal>): AbortSignal

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         */
        fun timeout(milliseconds: JsLong): AbortSignal
    }
}
