// Automatically generated - do not modify!

@file:JsModule("node:url")
@file:JsNonModule

package node.url

/**
 * The `url.parse()` method takes a URL string, parses it, and returns a URL
 * object.
 *
 * A `TypeError` is thrown if `urlString` is not a string.
 *
 * A `URIError` is thrown if the `auth` property is present but cannot be decoded.
 *
 * Use of the legacy `url.parse()` method is discouraged. Users should
 * use the WHATWG `URL` API. Because the `url.parse()` method uses a
 * lenient, non-standard algorithm for parsing URL strings, security
 * issues can be introduced. Specifically, issues with [host name spoofing](https://hackerone.com/reports/678487) and
 * incorrect handling of usernames and passwords have been identified.
 *
 * Deprecation of this API has been shelved for now primarily due to the the
 * inability of the [WHATWG API to parse relative URLs](https://github.com/nodejs/node/issues/12682#issuecomment-1154492373).
 * [Discussions are ongoing](https://github.com/whatwg/url/issues/531) for the  best way to resolve this.
 *
 * @since v0.1.25
 * @param urlString The URL string to parse.
 * @param [parseQueryString=false] If `true`, the `query` property will always be set to an object returned by the {@link querystring} module's `parse()` method. If `false`, the `query` property
 * on the returned URL object will be an unparsed, undecoded string.
 * @param [slashesDenoteHost=false] If `true`, the first token after the literal string `//` and preceding the next `/` will be interpreted as the `host`. For instance, given `//foo/bar`, the
 * result would be `{host: 'foo', pathname: '/bar'}` rather than `{pathname: '//foo/bar'}`.
 */
external fun parse(
    urlString: String,
): Url /* UrlWithStringQuery */


/**
 * The `url.parse()` method takes a URL string, parses it, and returns a URL
 * object.
 *
 * A `TypeError` is thrown if `urlString` is not a string.
 *
 * A `URIError` is thrown if the `auth` property is present but cannot be decoded.
 *
 * Use of the legacy `url.parse()` method is discouraged. Users should
 * use the WHATWG `URL` API. Because the `url.parse()` method uses a
 * lenient, non-standard algorithm for parsing URL strings, security
 * issues can be introduced. Specifically, issues with [host name spoofing](https://hackerone.com/reports/678487) and
 * incorrect handling of usernames and passwords have been identified.
 *
 * Deprecation of this API has been shelved for now primarily due to the the
 * inability of the [WHATWG API to parse relative URLs](https://github.com/nodejs/node/issues/12682#issuecomment-1154492373).
 * [Discussions are ongoing](https://github.com/whatwg/url/issues/531) for the  best way to resolve this.
 *
 * @since v0.1.25
 * @param urlString The URL string to parse.
 * @param [parseQueryString=false] If `true`, the `query` property will always be set to an object returned by the {@link querystring} module's `parse()` method. If `false`, the `query` property
 * on the returned URL object will be an unparsed, undecoded string.
 * @param [slashesDenoteHost=false] If `true`, the first token after the literal string `//` and preceding the next `/` will be interpreted as the `host`. For instance, given `//foo/bar`, the
 * result would be `{host: 'foo', pathname: '/bar'}` rather than `{pathname: '//foo/bar'}`.
 */
external fun parse(
    urlString: String,
    parseQueryString: Boolean,
    slashesDenoteHost: Boolean = definedExternally,
): Url
