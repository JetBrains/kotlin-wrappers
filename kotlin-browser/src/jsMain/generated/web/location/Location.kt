// Automatically generated - do not modify!

package web.location

import web.dom.DOMStringList
import web.url.URL

sealed external class Location {
    /**
     * Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing context to the top-level browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/ancestorOrigins)
     */
    val ancestorOrigins: DOMStringList

    /**
     * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
     *
     * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hash)
     */
    var hash: String

    /**
     * Returns the Location object's URL's host and port (if different from the default port for the scheme).
     *
     * Can be set, to navigate to the same URL with a changed host and port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/host)
     */
    var host: String

    /**
     * Returns the Location object's URL's host.
     *
     * Can be set, to navigate to the same URL with a changed host.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hostname)
     */
    var hostname: String

    /**
     * Returns the Location object's URL.
     *
     * Can be set, to navigate to the given URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/href)
     */
    var href: String

    /**
     * Returns the Location object's URL's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/origin)
     */
    val origin: String

    /**
     * Returns the Location object's URL's path.
     *
     * Can be set, to navigate to the same URL with a changed path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/pathname)
     */
    var pathname: String

    /**
     * Returns the Location object's URL's port.
     *
     * Can be set, to navigate to the same URL with a changed port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/port)
     */
    var port: String

    /**
     * Returns the Location object's URL's scheme.
     *
     * Can be set, to navigate to the same URL with a changed scheme.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/protocol)
     */
    var protocol: String

    /**
     * Returns the Location object's URL's query (includes leading "?" if non-empty).
     *
     * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/search)
     */
    var search: String

    /**
     * Navigates to the given URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/assign)
     */
    fun assign(url: String)
    fun assign(url: URL)

    /**
     * Reloads the current page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/reload)
     */
    fun reload()

    /**
     * Removes the current page from the session history and navigates to the given URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/replace)
     */
    fun replace(url: String)
    fun replace(url: URL)
}
