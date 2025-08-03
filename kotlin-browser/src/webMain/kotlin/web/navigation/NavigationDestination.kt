package web.navigation

import js.core.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination)
 */
external interface NavigationDestination {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/url)
     */
    val url: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/index)
     */
    val index: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/sameDocument)
     */
    val sameDocument: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/getState)
     */
    fun getState(): JsAny?
}
