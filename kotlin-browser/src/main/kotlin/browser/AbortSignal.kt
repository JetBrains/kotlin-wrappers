package browser

import web.events.EventTarget

/** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
external class AbortSignal : web.AbortSignal, EventTarget {
    /**
     * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
     */
    override val aborted: Boolean
    override var onabort: Function<Unit>? /* ((event: Event) -> Unit)? */
}
