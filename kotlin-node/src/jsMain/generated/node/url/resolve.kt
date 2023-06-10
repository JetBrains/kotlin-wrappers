// Automatically generated - do not modify!

@file:JsModule("node:url")

package node.url

/**
 * The `url.resolve()` method resolves a target URL relative to a base URL in a
 * manner similar to that of a web browser resolving an anchor tag.
 *
 * ```js
 * const url = require('url');
 * url.resolve('/one/two/three', 'four');         // '/one/two/four'
 * url.resolve('http://example.com/', '/one');    // 'http://example.com/one'
 * url.resolve('http://example.com/one', '/two'); // 'http://example.com/two'
 * ```
 *
 * To achieve the same result using the WHATWG URL API:
 *
 * ```js
 * function resolve(from, to) {
 *   const resolvedUrl = new URL(to, new URL(from, 'resolve://'));
 *   if (resolvedUrl.protocol === 'resolve:') {
 *     // `from` is a relative URL.
 *     const { pathname, search, hash } = resolvedUrl;
 *     return pathname + search + hash;
 *   }
 *   return resolvedUrl.toString();
 * }
 *
 * resolve('/one/two/three', 'four');         // '/one/two/four'
 * resolve('http://example.com/', '/one');    // 'http://example.com/one'
 * resolve('http://example.com/one', '/two'); // 'http://example.com/two'
 * ```
 * @since v0.1.25
 * @legacy Use the WHATWG URL API instead.
 * @param from The base URL to use if `to` is a relative URL.
 * @param to The target URL to resolve.
 */
external fun resolve(
    from: String,
    to: String,
): String
