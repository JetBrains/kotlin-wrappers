// Automatically generated - do not modify!

package web.navigation

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/NavigationCurrentEntryChangeEvent#options)
 */
@JsPlainObject
external interface NavigationCurrentEntryChangeEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/NavigationCurrentEntryChangeEvent#from)
     */
    var from: NavigationHistoryEntry

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/NavigationCurrentEntryChangeEvent#navigationType)
     */
    var navigationType: NavigationType?
}
