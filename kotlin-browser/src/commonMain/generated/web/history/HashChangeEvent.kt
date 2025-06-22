// Automatically generated - do not modify!

package web.history

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`HashChangeEvent`** interface represents events that fire when the fragment identifier of the URL has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent)
 */
open external class HashChangeEvent(
    override val type: EventType<HashChangeEvent>,
    init: HashChangeEventInit = definedExternally,
) : Event {
    /**
     * The **`newURL`** read-only property of the navigating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/newURL)
     */
    val newURL: String

    /**
     * The **`oldURL`** read-only property of the was navigated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/oldURL)
     */
    val oldURL: String

    companion object {
        @JsValue("hashchange")
        val HASH_CHANGE: EventType<HashChangeEvent>
    }
}

inline fun HashChangeEvent.asInit(): HashChangeEventInit =
    unsafeCast(this)
