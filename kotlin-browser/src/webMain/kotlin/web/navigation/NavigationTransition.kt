package web.navigation

import js.core.Void
import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition)
 */
external interface NavigationTransition {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/navigationType)
     */
    val navigationType: NavigationType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/from)
     */
    val from: NavigationHistoryEntry

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/finished)
     */
    val finished: Promise<Void>
}
