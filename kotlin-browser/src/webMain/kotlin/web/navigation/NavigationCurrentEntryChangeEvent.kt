package web.navigation

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent)
 */
open external class NavigationCurrentEntryChangeEvent(
    override val type: EventType<NavigationCurrentEntryChangeEvent>,
    init: NavigationCurrentEntryChangeEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/navigationType)
     */
    val navigationType: NavigationType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/from)
     */
    val from: NavigationHistoryEntry
}
