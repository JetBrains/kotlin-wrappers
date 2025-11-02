// Automatically generated - do not modify!

package web.navigation

import js.core.Int53
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsAny

/**
 * The **`NavigationHistoryEntry`** interface of the Navigation API represents a single navigation history entry.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry)
 */
open external class NavigationHistoryEntry
private constructor() :
    EventTarget {
    /**
     * The **`id`** read-only property of the NavigationHistoryEntry interface returns the id of the history entry, or an empty string if current document is not fully active. This is a unique, UA-generated value that always represents a specific history entry, useful to correlate it with an external resource such as a storage cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/id)
     */
    val id: String

    /**
     * The **`index`** read-only property of the NavigationHistoryEntry interface returns the index of the history entry in the history entries list (that is, the list returned by Navigation.entries()), or -1 if the entry does not appear in the list or if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/index)
     */
    val index: Int53

    /**
     * The **`key`** read-only property of the NavigationHistoryEntry interface returns the key of the history entry, or an empty string if current document is not fully active. This is a unique, UA-generated value that represents the history entry's slot in the entries list. It is used to navigate that particular slot via Navigation.traverseTo(). The key will be reused by other entries that replace the entry in the list (that is, if the NavigateEvent.navigationType is replace).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    var ondispose: EventHandler<Event, NavigationHistoryEntry, NavigationHistoryEntry>?

    /**
     * The **`sameDocument`** read-only property of the NavigationHistoryEntry interface returns true if this history entry is for the same document as the current Document value and current document is fully active, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/sameDocument)
     */
    val sameDocument: Boolean

    /**
     * The **`url`** read-only property of the NavigationHistoryEntry interface returns the absolute URL of this history entry. If the entry corresponds to a different Document than the current one (like sameDocument property is false), and that Document was fetched with a Referrer-Policy header set to no-referrer or origin, the property returns null. If current document is not fully active, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/url)
     */
    val url: String?

    /**
     * The **`getState()`** method of the NavigationHistoryEntry interface returns a clone of the developer-supplied state associated with this history entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/getState)
     */
    fun getState(): JsAny?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
 */
inline val <C : NavigationHistoryEntry> C.disposeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "dispose")
