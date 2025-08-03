package web.navigation

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/NavigationCurrentEntryChangeEvent#options)
 */
@JsPlainObject
external interface NavigationCurrentEntryChangeEventInit :
    EventInit {
    var navigationType: NavigationType?
    var from: NavigationHistoryEntry
}
