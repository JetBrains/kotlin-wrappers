// Automatically generated - do not modify!

package web.cookie

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`CookieChangeEvent`** interface of the Cookie Store API is the event type of the CookieStore/change_event event fired at a CookieStore when any cookies are created or deleted.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent)
 */
open external class CookieChangeEvent(
    override val type: EventType<CookieChangeEvent>,
    init: CookieChangeEventInit = definedExternally,
) : Event {
    /**
     * The **`changed`** read-only property of the CookieChangeEvent interface returns an array of the cookies that have been changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent/changed)
     */
    val changed: ReadonlyArray<CookieListItem>

    /**
     * The **`deleted`** read-only property of the CookieChangeEvent interface returns an array of the cookies that have been deleted by the given `CookieChangeEvent` instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent/deleted)
     */
    val deleted: ReadonlyArray<CookieListItem>

    companion object
}

inline fun CookieChangeEvent.asInit(): CookieChangeEventInit =
    unsafeCast(this)

inline val CookieChangeEvent.Companion.CHANGE: EventType<CookieChangeEvent>
    get() = EventType("change")
