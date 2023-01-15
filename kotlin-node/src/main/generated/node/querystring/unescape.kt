// Automatically generated - do not modify!

@file:JsModule("node:querystring")

package node.querystring

/**
 * The `querystring.unescape()` method performs decoding of URL percent-encoded
 * characters on the given `str`.
 *
 * The `querystring.unescape()` method is used by `querystring.parse()` and is
 * generally not expected to be used directly. It is exported primarily to allow
 * application code to provide a replacement decoding implementation if
 * necessary by assigning `querystring.unescape` to an alternative function.
 *
 * By default, the `querystring.unescape()` method will attempt to use the
 * JavaScript built-in `decodeURIComponent()` method to decode. If that fails,
 * a safer equivalent that does not throw on malformed URLs will be used.
 * @since v0.1.25
 */
external fun unescape(
    str: String,
): String
