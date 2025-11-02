// Automatically generated - do not modify!

package web.navigation

/**
 * The **`NavigationActivation`** interface of the Navigation API represents a recent cross-document navigation. It contains the navigation type and outgoing and inbound document history entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation)
 */
open external class NavigationActivation
private constructor() {
    /**
     * The **`entry`** read-only property of the NavigationActivation interface contains a NavigationHistoryEntry object representing the history entry for the inbound ("to") document in the navigation. This is equivalent to the Navigation.currentEntry property at the moment the inbound document was activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/entry)
     */
    val entry: NavigationHistoryEntry

    /**
     * The **`from`** read-only property of the NavigationActivation interface contains a NavigationHistoryEntry object representing the history entry for the outgoing ("from") document in the navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/from)
     */
    val from: NavigationHistoryEntry?

    /**
     * The **`navigationType`** read-only property of the NavigationActivation interface contains a string indicating the type of navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/navigationType)
     */
    val navigationType: NavigationType
}
