// Automatically generated - do not modify!

package web.abort

import js.array.ReadonlyArray
import js.core.UInt53
import js.errors.JsError
import js.errors.JsErrorLike
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`AbortSignal`** interface represents a signal object that allows you to communicate with an asynchronous operation (such as a fetch request) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 */
open external class AbortSignal
private constructor() :
    EventTarget {
    /**
     * The **`aborted`** read-only property returns a value that indicates whether the asynchronous operations the signal is communicating with are aborted (true) or not (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
     */
    val aborted: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
     */
    var onabort: EventHandler<Event, AbortSignal, AbortSignal>?

    /**
     * The **`reason`** read-only property returns a JavaScript value that indicates the abort reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     */
    val reason: JsErrorLike?

    /**
     * The **`throwIfAborted()`** method throws the signal's abort reason if the signal has been aborted; otherwise it does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     */
    fun throwIfAborted()

    companion object {
        /**
         * The **`AbortSignal.abort()`** static method returns an AbortSignal that is already set as aborted (and which does not trigger an abort event).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         */
        fun abort(reason: JsError? = definedExternally): AbortSignal

        /**
         * The **`AbortSignal.any()`** static method takes an iterable of abort signals and returns an AbortSignal. The returned abort signal is aborted when any of the input iterable abort signals are aborted. The abort reason will be set to the reason of the first signal that is aborted. If any of the given abort signals are already aborted then so will be the returned AbortSignal.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         */
        fun any(signals: ReadonlyArray<AbortSignal>): AbortSignal

        /**
         * The **`AbortSignal.timeout()`** static method returns an AbortSignal that will automatically abort after a specified time.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         */
        fun timeout(milliseconds: UInt53): AbortSignal
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
 */
inline val <C : AbortSignal> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "abort")
