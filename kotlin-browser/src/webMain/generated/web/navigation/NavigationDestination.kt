// Automatically generated - do not modify!

package web.navigation

import js.numbers.Int53

/**
 * The **`NavigationDestination`** interface of the Navigation API represents the destination being navigated to in the current navigation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination)
 */
open external class NavigationDestination
private constructor() {
    /**
     * The **`id`** read-only property of the NavigationDestination interface returns the id value of the destination NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or an empty string otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/id)
     */
    open val id: String

    /**
     * The **`index`** read-only property of the NavigationDestination interface returns the index value of the destination NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or -1 otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/index)
     */
    open val index: Int53

    /**
     * The **`key`** read-only property of the NavigationDestination interface returns the key value of the destination NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or an empty string otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/key)
     */
    open val key: String

    /**
     * The **`sameDocument`** read-only property of the NavigationDestination interface returns true if the navigation is to the same document as the current Document value, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/sameDocument)
     */
    open val sameDocument: Boolean

    /**
     * The **`url`** read-only property of the NavigationDestination interface returns the URL being navigated to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/url)
     */
    open val url: String

    /**
     * The **`getState()`** method of the NavigationDestination interface returns a clone of the developer-supplied state associated with the destination NavigationHistoryEntry, or navigation operation (e.g., navigate()) as appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/getState)
     */
    open fun getState(): JsAny?
}
