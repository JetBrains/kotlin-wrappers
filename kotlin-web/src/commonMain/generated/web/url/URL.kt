// Automatically generated - do not modify!

package web.url

import web.blob.Blob
import kotlin.js.definedExternally

/**
 * The **`URL`** interface is used to parse, construct, normalize, and encode URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL)
 */
open external class URL(
    url: String,
    base: String = definedExternally,
) {
    constructor(
        url: URL,
        base: String = definedExternally,
    )

    constructor(
        url: String,
        base: URL,
    )

    constructor(
        url: URL,
        base: URL,
    )

    /**
     * The **`hash`** property of the URL interface is a string containing a `'#'` followed by the fragment identifier of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hash)
     */
    var hash: String

    /**
     * The **`host`** property of the URL interface is a string containing the host, which is the URL.hostname, and then, if the port of the URL is nonempty, a `':'`, followed by the URL.port of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/host)
     */
    var host: String

    /**
     * The **`hostname`** property of the URL interface is a string containing either the domain name or IP address of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hostname)
     */
    var hostname: String

    /**
     * The **`href`** property of the URL interface is a string containing the whole URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/href)
     */
    var href: String

    /**
     * The **`origin`** read-only property of the URL interface returns a string containing the Unicode serialization of the origin of the represented URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/origin)
     */
    val origin: String

    /**
     * The **`password`** property of the URL interface is a string containing the password component of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/password)
     */
    var password: String

    /**
     * The **`pathname`** property of the URL interface represents a location in a hierarchical structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/pathname)
     */
    var pathname: String

    /**
     * The **`port`** property of the URL interface is a string containing the port number of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/port)
     */
    var port: String

    /**
     * The **`protocol`** property of the URL interface is a string containing the protocol or scheme of the URL, including the final `':'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/protocol)
     */
    var protocol: String

    /**
     * The **`search`** property of the URL interface is a search string, also called a _query string_, that is a string containing a `'?'` followed by the parameters of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/search)
     */
    var search: String

    /**
     * The **`searchParams`** read-only property of the access to the [MISSING: httpmethod('GET')] decoded query arguments contained in the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/searchParams)
     */
    val searchParams: URLSearchParams

    /**
     * The **`username`** property of the URL interface is a string containing the username component of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/username)
     */
    var username: String

    /**
     * The **`toJSON()`** method of the URL interface returns a string containing a serialized version of the URL, although in practice it seems to have the same effect as ```js-nolint toJSON() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/toJSON)
     */
    fun toJSON(): String

    companion object {
        /**
         * The **`URL.canParse()`** static method of the URL interface returns a boolean indicating whether or not an absolute URL, or a relative URL combined with a base URL, are parsable and valid.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/canParse_static)
         */
        fun canParse(
            url: String,
            base: String = definedExternally,
        ): Boolean

        fun canParse(
            url: URL,
            base: String = definedExternally,
        ): Boolean

        fun canParse(
            url: String,
            base: URL,
        ): Boolean

        fun canParse(
            url: URL,
            base: URL,
        ): Boolean

        /**
         * The **`createObjectURL()`** static method of the URL interface creates a string containing a URL representing the object given in the parameter.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/createObjectURL_static)
         */
        fun createObjectURL(obj: Blob /* | MediaSource */): String

        /**
         * The **`URL.parse()`** static method of the URL interface returns a newly created URL object representing the URL defined by the parameters.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/parse_static)
         */
        fun parse(
            url: String,
            base: String = definedExternally,
        ): URL?

        fun parse(
            url: URL,
            base: String = definedExternally,
        ): URL?

        fun parse(
            url: String,
            base: URL,
        ): URL?

        fun parse(
            url: URL,
            base: URL,
        ): URL?

        /**
         * The **`revokeObjectURL()`** static method of the URL interface releases an existing object URL which was previously created by calling Call this method when you've finished using an object URL to let the browser know not to keep the reference to the file any longer.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/revokeObjectURL_static)
         */
        fun revokeObjectURL(url: String)
    }
}
