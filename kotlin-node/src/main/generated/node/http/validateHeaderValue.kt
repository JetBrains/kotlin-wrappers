// Automatically generated - do not modify!

@file:JsModule("node:http")

package node.http

/**
 * Performs the low-level validations on the provided value that are done when `res.setHeader(name, value)` is called.
 * Passing illegal value as value will result in a TypeError being thrown.
 * - Undefined value error is identified by `code: 'ERR_HTTP_INVALID_HEADER_VALUE'`.
 * - Invalid value character error is identified by `code: 'ERR_INVALID_CHAR'`.
 * @param name Header name
 * @param value Header value
 * @since v14.3.0
 */
external fun validateHeaderValue(
    name: String,
    value: String,
)
