// Automatically generated - do not modify!

package node.querystring

@kotlinx.js.JsPlainObject
external interface ParseOptions {
    /**
     * Specifies the maximum number of keys to parse. Specify `0` to remove key counting limitations.
     * @default 1000
     */
    var maxKeys: Double?

    /**
     * The function to use when decoding percent-encoded characters in the query string.
     * @default `querystring.unescape()`
     */
    var decodeURIComponent: ((str: String) -> String)?
}
