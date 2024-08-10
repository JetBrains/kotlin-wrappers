// Automatically generated - do not modify!

package web.url

import web.blob.Blob

/**
 * The URL interface represents an object providing static methods used for creating object URLs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL)
 */
external class URL(
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hash)
     */
    var hash: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/host)
     */
    var host: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hostname)
     */
    var hostname: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/href)
     */
    var href: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/origin)
     */
    val origin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/password)
     */
    var password: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/pathname)
     */
    var pathname: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/port)
     */
    var port: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/protocol)
     */
    var protocol: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/search)
     */
    var search: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/searchParams)
     */
    val searchParams: URLSearchParams

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/username)
     */
    var username: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/toJSON)
     */
    fun toJSON(): String

    companion object {
        /**
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
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/createObjectURL_static)
         */
        fun createObjectURL(obj: Blob /* | MediaSource */): String

        /**
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
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/revokeObjectURL_static)
         */
        fun revokeObjectURL(url: String)
    }
}
