// Automatically generated - do not modify!

@file:JsModule("node:querystring")

package node.querystring

/**
 * The `querystring.escape()` method performs URL percent-encoding on the given`str` in a manner that is optimized for the specific requirements of URL
 * query strings.
 *
 * The `querystring.escape()` method is used by `querystring.stringify()` and is
 * generally not expected to be used directly. It is exported primarily to allow
 * application code to provide a replacement percent-encoding implementation if
 * necessary by assigning `querystring.escape` to an alternative function.
 * @since v0.1.25
 */
external fun escape(
    str: String,
): String
