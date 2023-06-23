// Automatically generated - do not modify!

package web.history

import web.url.URL

/**
 * Allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History)
 */
sealed external class History {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/length) */
    val length: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration) */
    var scrollRestoration: ScrollRestoration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/state) */
    val state: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/back) */
    fun back()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/forward) */
    fun forward()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/go) */
    fun go(delta: Number = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/pushState) */
    fun pushState(
        data: Any?,
        unused: String,
        url: String? = definedExternally,
    )

    fun pushState(
        data: Any?,
        unused: String,
        url: URL?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/replaceState) */
    fun replaceState(
        data: Any?,
        unused: String,
        url: String? = definedExternally,
    )

    fun replaceState(
        data: Any?,
        unused: String,
        url: URL?,
    )
}
