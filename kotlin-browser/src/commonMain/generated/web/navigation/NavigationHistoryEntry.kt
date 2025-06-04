// Automatically generated - do not modify!

package web.navigation

import js.core.Int53
import js.core.JsAny
import web.events.*

/**
 * The **`NavigationHistoryEntry`** interface of the Navigation API represents a single navigation history entry.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry)
 */
external class NavigationHistoryEntry
private constructor() :
    EventTarget {
    /**
     * The **`id`** read-only property of the NavigationHistoryEntry interface returns the `id` of the history entry, or an empty string if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/id)
     */
    val id: String

    /**
     * The **`index`** read-only property of the NavigationHistoryEntry interface returns the index of the history entry in the history entries list (that is, the list returned by Navigation.entries()), or `-1` if the entry does not appear in the list or if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/index)
     */
    val index: Int53

    /**
     * The **`key`** read-only property of the NavigationHistoryEntry interface returns the `key` of the history entry, or an empty string if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    var ondispose: EventHandler<Event, NavigationHistoryEntry, NavigationHistoryEntry>?

    /**
     * The **`sameDocument`** read-only property of the NavigationHistoryEntry interface returns `true` if this history entry is for the same `document` as the current Document value and current document is fully active, or `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/sameDocument)
     */
    val sameDocument: Boolean

    /**
     * The **`url`** read-only property of the NavigationHistoryEntry interface returns the absolute URL of this history entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/url)
     */
    val url: String?

    /**
     * The **`getState()`** method of the NavigationHistoryEntry interface returns a clone of the developer-supplied state associated with this history entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/getState)
     */
    fun getState(): JsAny

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    @JsEvent("dispose")
    val disposeEvent: EventInstance<Event, NavigationHistoryEntry /* this */, NavigationHistoryEntry /* this */>
}
