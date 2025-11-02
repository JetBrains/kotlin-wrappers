// Automatically generated - do not modify!

package web.history

import web.url.URL
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`History`** interface of the History API allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History)
 */
open external class History
private constructor() {
    /**
     * The **`length`** read-only property of the History interface returns an integer representing the number of entries in the session history, including the currently loaded page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/length)
     */
    val length: Int

    /**
     * The **`scrollRestoration`** property of the History interface allows web applications to explicitly set default scroll restoration behavior on history navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration)
     */
    var scrollRestoration: ScrollRestoration

    /**
     * The **`state`** read-only property of the History interface returns a value representing the state at the top of the history stack. This is a way to look at the state without having to wait for a popstate event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/state)
     */
    val state: JsAny?

    /**
     * The **`back()`** method of the History interface causes the browser to move back one page in the session history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/back)
     */
    fun back()

    /**
     * The **`forward()`** method of the History interface causes the browser to move forward one page in the session history. It has the same effect as calling history.go(1).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/forward)
     */
    fun forward()

    /**
     * The **`go()`** method of the History interface loads a specific page from the session history. You can use it to move forwards and backwards through the history depending on the value of a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/go)
     */
    fun go(delta: Int = definedExternally)

    /**
     * The **`pushState()`** method of the History interface adds an entry to the browser's session history stack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/pushState)
     */
    fun pushState(
        data: JsAny?,
        unused: String,
        url: String? = definedExternally,
    )

    fun pushState(
        data: JsAny?,
        unused: String,
        url: URL?,
    )

    /**
     * The **`replaceState()`** method of the History interface modifies the current history entry, replacing it with the state object and URL passed in the method parameters. This method is particularly useful when you want to update the state object or URL of the current history entry in response to some user action.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/replaceState)
     */
    fun replaceState(
        data: JsAny?,
        unused: String,
        url: String? = definedExternally,
    )

    fun replaceState(
        data: JsAny?,
        unused: String,
        url: URL?,
    )
}
