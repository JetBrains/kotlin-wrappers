package org.w3c.fetch

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

/** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
external class AbortSignal : EventTarget {
    /**
     * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
     */
    val aborted: Boolean
    var onabort: ((event: Event) -> Unit)?
}
