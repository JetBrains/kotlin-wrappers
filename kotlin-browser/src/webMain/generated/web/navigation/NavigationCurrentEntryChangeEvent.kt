// Automatically generated - do not modify!

package web.navigation

import web.events.Event
import web.events.EventType

/**
 * The **`NavigationCurrentEntryChangeEvent`** interface of the Navigation API is the event object for the currententrychange event, which fires when the Navigation.currentEntry has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent)
 */
open external class NavigationCurrentEntryChangeEvent(
    override val type: EventType<NavigationCurrentEntryChangeEvent>,
    init: NavigationCurrentEntryChangeEventInit,
) : Event {
    /**
     * The **`from`** read-only property of the NavigationCurrentEntryChangeEvent interface returns the NavigationHistoryEntry that was navigated from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/from)
     */
    val from: NavigationHistoryEntry

    /**
     * The **`navigationType`** read-only property of the NavigationCurrentEntryChangeEvent interface returns the type of the navigation that resulted in the change. The property may be null if the change occurs due to Navigation.updateCurrentEntry().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/navigationType)
     */
    val navigationType: NavigationType?

    companion object
}

inline val NavigationCurrentEntryChangeEvent.Companion.CURRENT_ENTRY_CHANGE: EventType<NavigationCurrentEntryChangeEvent>
    get() = EventType("currententrychange")
