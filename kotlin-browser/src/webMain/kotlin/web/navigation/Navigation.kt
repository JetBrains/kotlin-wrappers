package web.navigation

import js.iterable.JsIterator
import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation)
 */
open external class Navigation
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/entries)
     */
    fun entries(): JsIterator<NavigationHistoryEntry>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currentEntry)
     */
    val currentEntry: NavigationHistoryEntry?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/updateCurrentEntry)
     */
    fun updateCurrentEntry(options: NavigationUpdateCurrentEntryOptions)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/transition)
     */
    val transition: NavigationTransition?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/activation)
     */
    val activation: NavigationActivation?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoBack)
     */
    val canGoBack: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoForward)
     */
    val canGoForward: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate)
     */
    fun navigate(
        url: String,
        options: NavigationNavigateOptions = definedExternally,
    ): NavigationResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/reload)
     */
    fun reload(options: NavigationReloadOptions = definedExternally): NavigationResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/traverseTo)
     */
    fun traverseTo(
        key: String,
        options: NavigationOptions = definedExternally,
    ): NavigationResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back)
     */
    fun back(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/forward)
     */
    fun forward(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate_event)
     */
    var onnavigate: EventHandler<NavigateEvent, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigatesuccess_event)
     */
    var onnavigatesuccess: EventHandler<Event, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigateerror_event)
     */
    var onnavigateerror: EventHandler<ErrorEvent, Navigation, Navigation>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currententrychange_event)
     */
    var oncurrententrychange: EventHandler<NavigationCurrentEntryChangeEvent, Navigation, Navigation>?
}
