// Automatically generated - do not modify!

package web.navigation

import js.array.ReadonlyArray
import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`Navigation`** interface of the Navigation API allows control over all navigation actions for the current window in one central place, including initiating navigations programmatically, examining navigation history entries, and managing navigations as they happen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation)
 */
open external class Navigation
private constructor() :
    EventTarget {
    /**
     * The **`activation`** read-only property of the Navigation interface returns a NavigationActivation object containing information about the most recent cross-document navigation, which "activated" this Document. The property will stay constant during same-document navigations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/activation)
     */
    val activation: NavigationActivation?

    /**
     * The **`canGoBack`** read-only property of the Navigation interface returns true if it is possible to navigate backwards in the navigation history (i.e., the currentEntry is not the first one in the history entry list), and false if it is not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoBack)
     */
    val canGoBack: Boolean

    /**
     * The **`canGoForward`** read-only property of the Navigation interface returns true if it is possible to navigate forwards in the navigation history (i.e., the currentEntry is not the last one in the history entry list), and false if it is not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoForward)
     */
    val canGoForward: Boolean

    /**
     * The **`currentEntry`** read-only property of the Navigation interface returns a NavigationHistoryEntry object representing the location the user is currently navigated to right now.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currentEntry)
     */
    val currentEntry: NavigationHistoryEntry?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currententrychange_event)
     */
    var oncurrententrychange: EventHandler<NavigationCurrentEntryChangeEvent, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate_event)
     */
    var onnavigate: EventHandler<NavigateEvent, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigateerror_event)
     */
    var onnavigateerror: EventHandler<ErrorEvent, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigatesuccess_event)
     */
    var onnavigatesuccess: EventHandler<Event, Navigation, Navigation>?

    /**
     * The **`transition`** read-only property of the Navigation interface returns a NavigationTransition object representing the status of an in-progress navigation, which can be used to track it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/transition)
     */
    val transition: NavigationTransition?

    /**
     * The **`back()`** method of the Navigation interface navigates backwards by one entry in the navigation history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back)
     */
    fun back(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * The **`entries()`** method of the Navigation interface returns an array of NavigationHistoryEntry objects representing all existing history entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/entries)
     */
    fun entries(): ReadonlyArray<NavigationHistoryEntry>

    /**
     * The **`forward()`** method of the Navigation interface navigates forwards by one entry in the navigation history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/forward)
     */
    fun forward(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * The **`navigate()`** method of the Navigation interface navigates to a specific URL, updating any provided state in the history entries list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate)
     */
    fun navigate(
        url: String,
        options: NavigationNavigateOptions = definedExternally,
    ): NavigationResult

    fun navigate(
        url: URL,
        options: NavigationNavigateOptions = definedExternally,
    ): NavigationResult

    /**
     * The **`reload()`** method of the Navigation interface reloads the current URL, updating any provided state in the history entries list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/reload)
     */
    fun reload(options: NavigationReloadOptions = definedExternally): NavigationResult

    /**
     * The **`traverseTo()`** method of the Navigation interface navigates to the NavigationHistoryEntry identified by the given key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/traverseTo)
     */
    fun traverseTo(
        key: String,
        options: NavigationOptions = definedExternally,
    ): NavigationResult

    /**
     * The **`updateCurrentEntry()`** method of the Navigation interface updates the state of the currentEntry; used in cases where the state change will be independent of a navigation or reload.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/updateCurrentEntry)
     */
    fun updateCurrentEntry(options: NavigationUpdateCurrentEntryOptions)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currententrychange_event)
 */
inline val <C : Navigation> C.currentEntryChangeEvent: EventInstance<NavigationCurrentEntryChangeEvent, C, C>
    get() = EventInstance(this, "currententrychange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate_event)
 */
inline val <C : Navigation> C.navigateEvent: EventInstance<NavigateEvent, C, C>
    get() = EventInstance(this, "navigate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigateerror_event)
 */
inline val <C : Navigation> C.navigateErrorEvent: EventInstance<ErrorEvent, C, C>
    get() = EventInstance(this, "navigateerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigatesuccess_event)
 */
inline val <C : Navigation> C.navigateSuccessEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "navigatesuccess")
