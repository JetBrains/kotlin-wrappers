// Automatically generated - do not modify!

@file:JsModule("node:url")
@file:JsNonModule

package node.url

import node.http.ClientRequestArgs

/**
 * This utility function converts a URL object into an ordinary options object as
 * expected by the `http.request()` and `https.request()` APIs.
 *
 * ```js
 * import { urlToHttpOptions } from 'url';
 * const myURL = new URL('https://a:b@測試?abc#foo');
 *
 * console.log(urlToHttpOptions(myURL));
 * ---
 * {
 *   protocol: 'https:',
 *   hostname: 'xn--g6w251d',
 *   hash: '#foo',
 *   search: '?abc',
 *   pathname: '/',
 *   path: '/?abc',
 *   href: 'https://a:b@xn--g6w251d/?abc#foo',
 *   auth: 'a:b'
 * }
 *
 * ```
 * @since v15.7.0, v14.18.0
 * @param url The `WHATWG URL` object to convert to an options object.
 * @return Options object
 */
external fun urlToHttpOptions(
    url: URL,
): ClientRequestArgs
