// Automatically generated - do not modify!

package react.query

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

external class AbortController {
    /**
     * Returns the AbortSignal object associated with this object.
     */
    val signal: AbortSignal

    /**
     * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
     */
    fun abort()
}

/** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
external class AbortSignal : EventTarget {
    /**
     * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
     */
    val aborted: Boolean
    val onabort: ((event: Event) -> Unit)?
}
