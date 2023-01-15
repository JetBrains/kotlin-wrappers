// Automatically generated - do not modify!

@file:JsModule("node:querystring")

package node.querystring

/**
 * The `querystring.stringify()` method produces a URL query string from a
 * given `obj` by iterating through the object's "own properties".
 *
 * It serializes the following types of values passed in `obj`:[string](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
 * [number](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
 * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
 * [boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) |
 * [string\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#String_type) |
 * [number\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Number_type) |
 * [bigint\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) |
 * [boolean\[\]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Boolean_type) The numeric values must be finite. Any other input values will be coerced to
 * empty strings.
 *
 * ```js
 * querystring.stringify({ foo: 'bar', baz: ['qux', 'quux'], corge: '' });
 * // Returns 'foo=bar&#x26;baz=qux&#x26;baz=quux&#x26;corge='
 *
 * querystring.stringify({ foo: 'bar', baz: 'qux' }, ';', ':');
 * // Returns 'foo:bar;baz:qux'
 * ```
 *
 * By default, characters requiring percent-encoding within the query string will
 * be encoded as UTF-8\. If an alternative encoding is required, then an alternative`encodeURIComponent` option will need to be specified:
 *
 * ```js
 * // Assuming gbkEncodeURIComponent function already exists,
 *
 * querystring.stringify({ w: '中文', foo: 'bar' }, null, null,
 *                       { encodeURIComponent: gbkEncodeURIComponent });
 * ```
 * @since v0.1.25
 * @param obj The object to serialize into a URL query string
 * @param [sep='&'] The substring used to delimit key and value pairs in the query string.
 * @param [eq='='] . The substring used to delimit keys and values in the query string.
 */
external fun stringify(
    obj: ParsedUrlQueryInput = definedExternally,
    sep: String = definedExternally,
    eq: String = definedExternally,
    options: StringifyOptions = definedExternally,
): String
