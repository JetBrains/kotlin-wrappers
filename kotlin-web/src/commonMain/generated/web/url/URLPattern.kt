package web.url

import kotlin.js.definedExternally

/**
 * The URLPattern API provides a web platform primitive for matching URLs based
 * on a convenient pattern syntax.
 *
 * The syntax is based on path-to-regexp. Wildcards, named capture groups,
 * regular groups, and group modifiers are all supported.
 *
 * ```ts
 * // Specify the pattern as structured data.
 * const pattern = new URLPattern({ pathname: "/users/:user" });
 * const match = pattern.exec("https://blog.example.com/users/joe");
 * console.log(match.pathname.groups.user); // joe
 * ```
 *
 * ```ts
 * // Specify a fully qualified string pattern.
 * const pattern = new URLPattern("https://example.com/books/:id");
 * console.log(pattern.test("https://example.com/books/123")); // true
 * console.log(pattern.test("https://deno.land/books/123")); // false
 * ```
 *
 * ```ts
 * // Specify a relative string pattern with a base URL.
 * const pattern = new URLPattern("/article/:id", "https://blog.example.com");
 * console.log(pattern.test("https://blog.example.com/article")); // false
 * console.log(pattern.test("https://blog.example.com/article/123")); // true
 * ```
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern)
 */
open external class URLPattern(
    input: String = definedExternally,
    options: URLPatternOptions = definedExternally,
) {
    constructor(
        input: URLPatternInit,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: String,
        baseURL: String,
        options: URLPatternOptions = definedExternally,
    )

    constructor(
        input: URLPatternInit,
        baseURL: String,
        options: URLPatternOptions = definedExternally,
    )

    /**
     * Test if the given input matches the stored pattern.
     *
     * The input can either be provided as an absolute URL string with an optional base,
     * relative URL string with a required base, or as individual components
     * in the form of an `URLPatternInit` object.
     *
     * ```ts
     * const pattern = new URLPattern("https://example.com/books/:id");
     *
     * // Test an absolute url string.
     * console.log(pattern.test("https://example.com/books/123")); // true
     *
     * // Test a relative url with a base.
     * console.log(pattern.test("/books/123", "https://example.com")); // true
     *
     * // Test an object of url components.
     * console.log(pattern.test({ pathname: "/books/123" })); // true
     * ```
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/test)
     */
    fun test(
        input: String,
        baseURL: String = definedExternally,
    ): Boolean

    fun test(
        input: URLPatternInit,
        baseURL: String = definedExternally,
    ): Boolean

    /**
     * Match the given input against the stored pattern.
     *
     * The input can either be provided as an absolute URL string with an optional base,
     * relative URL string with a required base, or as individual components
     * in the form of an `URLPatternInit` object.
     *
     * ```ts
     * const pattern = new URLPattern("https://example.com/books/:id");
     *
     * // Match an absolute url string.
     * let match = pattern.exec("https://example.com/books/123");
     * console.log(match.pathname.groups.id); // 123
     *
     * // Match a relative url with a base.
     * match = pattern.exec("/books/123", "https://example.com");
     * console.log(match.pathname.groups.id); // 123
     *
     * // Match an object of url components.
     * match = pattern.exec({ pathname: "/books/123" });
     * console.log(match.pathname.groups.id); // 123
     * ```
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/exec)
     */
    fun exec(
        input: String,
        baseURL: String = definedExternally,
    ): URLPatternResult?

    fun exec(
        input: URLPatternInit,
        baseURL: String = definedExternally,
    ): URLPatternResult?

    /**
     * The pattern string for the `protocol`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/protocol)
     */
    val protocol: String

    /**
     * The pattern string for the `username`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/username)
     */
    val username: String

    /**
     * The pattern string for the `password`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/password)
     */
    val password: String

    /**
     * The pattern string for the `hostname`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hostname)
     */
    val hostname: String

    /**
     * The pattern string for the `port`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/port)
     */
    val port: String

    /**
     * The pattern string for the `pathname`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/pathname)
     */
    val pathname: String

    /**
     * The pattern string for the `search`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/search)
     */
    val search: String

    /**
     * The pattern string for the `hash`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hash)
     */
    val hash: String

    /**
     * Whether or not any of the specified groups use regexp groups.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLPattern/hasRegExpGroups)
     */
    val hasRegExpGroups: Boolean
}
