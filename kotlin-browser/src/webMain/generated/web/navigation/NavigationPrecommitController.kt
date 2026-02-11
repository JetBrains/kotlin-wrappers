// Automatically generated - do not modify!

package web.navigation

import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`NavigationPrecommitController`** interface of the Navigation API is passed as an argument to a navigation precommit handler callback.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPrecommitController)
 */
open external class NavigationPrecommitController
private constructor() {
    /**
     * The **`redirect()`** method of the NavigationPrecommitController interface redirects the browser to a specified URL and specifies history behavior and any desired state information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPrecommitController/redirect)
     */
    fun redirect(
        url: String,
        options: NavigationNavigateOptions = definedExternally,
    )

    fun redirect(
        url: URL,
        options: NavigationNavigateOptions = definedExternally,
    )
}
