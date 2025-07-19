// Automatically generated - do not modify!

package web.location

import web.dom.DOMStringList
import web.url.URL

/**
 * The **`Location`** interface represents the location (URL) of the object it is linked to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location)
 */
open external class Location
private constructor() {
    /**
     * The **`ancestorOrigins`** read-only property of the Location interface is a static browsing contexts of the document associated with the given Location object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/ancestorOrigins)
     */
    val ancestorOrigins: DOMStringList

    /**
     * The **`hash`** property of the Location interface is a string containing a `'#'` followed by the fragment identifier of the location URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hash)
     */
    var hash: String

    /**
     * The **`host`** property of the Location interface is a string containing the host, which is the Location.hostname, and then, if the port of the URL is nonempty, a `':'`, followed by the Location.port of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/host)
     */
    var host: String

    /**
     * The **`hostname`** property of the Location interface is a string containing either the domain name or IP address of the location URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hostname)
     */
    var hostname: String

    /**
     * The **`href`** property of the Location interface is a stringifier that returns a string containing the whole URL, and allows the href to be updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/href)
     */
    var href: String

    /**
     * The **`origin`** read-only property of the Location interface returns a string containing the Unicode serialization of the origin of the location's URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/origin)
     */
    val origin: String

    /**
     * The **`pathname`** property of the Location interface is a string containing the path of the URL for the location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/pathname)
     */
    var pathname: String

    /**
     * The **`port`** property of the Location interface is a string containing the port number of the location's URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/port)
     */
    var port: String

    /**
     * The **`protocol`** property of the Location interface is a string containing the protocol or scheme of the location's URL, including the final `':'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/protocol)
     */
    var protocol: String

    /**
     * The **`search`** property of the Location interface is a search string, also called a _query string_, that is a string containing a `'?'` followed by the parameters of the location's URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/search)
     */
    var search: String

    /**
     * The **`assign()`** method of the Location interface causes the window to load and display the document at the URL specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/assign)
     */
    fun assign(url: String)
    fun assign(url: URL)

    /**
     * The **`reload()`** method of the Location interface reloads the current URL, like the Refresh button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/reload)
     */
    fun reload()

    /**
     * The **`replace()`** method of the Location interface replaces the current resource with the one at the provided URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/replace)
     */
    fun replace(url: String)
    fun replace(url: URL)
}
