// Automatically generated - do not modify!

package web.navigation

import js.core.Void
import js.promise.Promise

/**
 * The **`NavigationTransition`** interface of the Navigation API represents an ongoing navigation, that is, a navigation that hasn't yet reached the navigatesuccess or navigateerror stage.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition)
 */
open external class NavigationTransition
private constructor() {
    val committed: Promise<Void>

    /**
     * The **`finished`** read-only property of the NavigationTransition interface returns a Promise that fulfills at the same time the navigatesuccess event fires, or rejects at the same time the navigateerror event fires.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/finished)
     */
    val finished: Promise<Void>

    /**
     * The **`from`** read-only property of the NavigationTransition interface returns the NavigationHistoryEntry that the transition is coming from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/from)
     */
    val from: NavigationHistoryEntry

    /**
     * The **`navigationType`** read-only property of the NavigationTransition interface returns the type of the ongoing navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/navigationType)
     */
    val navigationType: NavigationType
}
