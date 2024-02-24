// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events that fire when the fragment identifier of the URL has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent)
 */
open external class HashChangeEvent<out C : EventTarget?>(
    override val type: EventType<HashChangeEvent<*>>,
    init: HashChangeEventInit = definedExternally,
) : Event<C>,
    HashChangeEventInit {
    /**
     * Returns the URL of the session history entry that is now current.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/newURL)
     */
    override val newURL: String

    /**
     * Returns the URL of the session history entry that was previously current.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/oldURL)
     */
    override val oldURL: String

    companion object : HashChangeEventTypes
}
