// Automatically generated - do not modify!

package web.navigation

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/NavigationCurrentEntryChangeEvent#options)
 */
@JsPlainObject
external interface NavigationCurrentEntryChangeEventInit :
    EventInit {
    var from: NavigationHistoryEntry
    var navigationType: NavigationType?
}
