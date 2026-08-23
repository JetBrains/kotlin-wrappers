// Automatically generated - do not modify!

package web.navigation

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept#options)
 */
@JsPlainObject
external interface NavigationInterceptOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept#focusReset)
     */
    var focusReset: NavigationFocusReset?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept#handler)
     */
    var handler: NavigationInterceptHandler?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept#precommitHandler)
     */
    var precommitHandler: NavigationPrecommitHandler?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept#scroll)
     */
    var scroll: NavigationScrollBehavior?
}
