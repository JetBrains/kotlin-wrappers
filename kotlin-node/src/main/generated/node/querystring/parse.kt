// Automatically generated - do not modify!

@file:JsModule("node:querystring")

package node.querystring

/**
 * The `querystring.parse()` method parses a URL query string (`str`) into a
 * collection of key and value pairs.
 *
 * For example, the query string `'foo=bar&#x26;abc=xyz&#x26;abc=123'` is parsed into:
 *
 * ```js
 * {
 *   foo: 'bar',
 *   abc: ['xyz', '123']
 * }
 * ```
 *
 * The object returned by the `querystring.parse()` method _does not_prototypically inherit from the JavaScript `Object`. This means that typical`Object` methods such as `obj.toString()`,
 * `obj.hasOwnProperty()`, and others
 * are not defined and _will not work_.
 *
 * By default, percent-encoded characters within the query string will be assumed
 * to use UTF-8 encoding. If an alternative character encoding is used, then an
 * alternative `decodeURIComponent` option will need to be specified:
 *
 * ```js
 * // Assuming gbkDecodeURIComponent function already exists...
 *
 * querystring.parse('w=%D6%D0%CE%C4&#x26;foo=bar', null, null,
 *                   { decodeURIComponent: gbkDecodeURIComponent });
 * ```
 * @since v0.1.25
 * @param str The URL query string to parse
 * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
 * @param [eq='='] . The substring used to delimit keys and values in the query string.
 */
external fun parse(
    str: String,
    sep: String = definedExternally,
    eq: String = definedExternally,
    options: ParseOptions = definedExternally,
): ParsedUrlQuery
