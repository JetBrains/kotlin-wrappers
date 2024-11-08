// Automatically generated - do not modify!

package web.navigation

import js.core.JsLong
import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry)
 */
sealed external class NavigationHistoryEntry :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/index)
     */
    val index: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    var ondispose: EventHandler<Event, NavigationHistoryEntry, NavigationHistoryEntry>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/sameDocument)
     */
    val sameDocument: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/url)
     */
    val url: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/getState)
     */
    fun getState(): Any

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    @JsEvent("dispose")
    val disposeEvent: EventInstance<Event, NavigationHistoryEntry /* this */, NavigationHistoryEntry /* this */>
}
