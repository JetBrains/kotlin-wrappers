// Automatically generated - do not modify!

package web.url

import kotlin.js.definedExternally

/**
 * The **`URLPattern`** interface of the URL Pattern API matches URLs or parts of URLs against a pattern.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern)
 */
open external class URLPattern(
    input: String,
    baseURL: String,
    options: URLPatternOptions = definedExternally,
) {
    constructor(
        input: URLPatternInit,
        baseURL: String,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: String,
        baseURL: URL,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: URLPatternInit,
        baseURL: URL,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: String = definedExternally,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: URLPatternInit,
        options: URLPatternOptions = definedExternally,
    )

    /**
     * The **`hasRegExpGroups`** read-only property of the URLPattern interface is a boolean indicating whether or not any of the `URLPattern` components contain regular expression capturing groups.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hasRegExpGroups)
     */
    val hasRegExpGroups: Boolean

    /**
     * The **`hash`** read-only property of the URLPattern interface is a string containing the pattern used to match the fragment part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hash)
     */
    val hash: String

    /**
     * The **`hostname`** read-only property of the URLPattern interface is a string containing the pattern used to match the hostname part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hostname)
     */
    val hostname: String

    /**
     * The **`password`** read-only property of the URLPattern interface is a string containing the pattern used to match the password part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/password)
     */
    val password: String

    /**
     * The **`pathname`** read-only property of the URLPattern interface is a string containing the pattern used to match the pathname part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/pathname)
     */
    val pathname: String

    /**
     * The **`port`** read-only property of the URLPattern interface is a string containing the pattern used to match the port part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/port)
     */
    val port: String

    /**
     * The **`protocol`** read-only property of the URLPattern interface is a string containing the pattern used to match the protocol part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/protocol)
     */
    val protocol: String

    /**
     * The **`search`** read-only property of the URLPattern interface is a string containing the pattern used to match the search part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/search)
     */
    val search: String

    /**
     * The **`username`** read-only property of the URLPattern interface is a string containing the pattern used to match the username part of a URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/username)
     */
    val username: String

    /**
     * The **`exec()`** method of the URLPattern interface takes a URL or object of URL parts, and returns either an object containing the results of matching the URL to the pattern, or `null` if the URL does not match the pattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/exec)
     */
    fun exec(
        input: String = definedExternally,
        baseURL: String = definedExternally,
    ): URLPatternResult?

    fun exec(
        input: URLPatternInit,
        baseURL: String = definedExternally,
    ): URLPatternResult?

    fun exec(
        input: String = definedExternally,
        baseURL: URL,
    ): URLPatternResult?

    fun exec(
        input: URLPatternInit,
        baseURL: URL,
    ): URLPatternResult?

    /**
     * The **`test()`** method of the URLPattern interface takes a URL or object of URL parts, and returns a boolean indicating if the given input matches the current pattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/test)
     */
    fun test(
        input: String = definedExternally,
        baseURL: String = definedExternally,
    ): Boolean

    fun test(
        input: URLPatternInit,
        baseURL: String = definedExternally,
    ): Boolean

    fun test(
        input: String = definedExternally,
        baseURL: URL,
    ): Boolean

    fun test(
        input: URLPatternInit,
        baseURL: URL,
    ): Boolean
}
