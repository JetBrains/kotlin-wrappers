// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

/**
 * Performs the low-level validations on the provided name that are done when res.setHeader(name, value) is called.
 * Passing illegal value as name will result in a TypeError being thrown, identified by code: 'ERR_INVALID_HTTP_TOKEN'.
 * @param name Header name
 * @since v14.3.0
 */
external fun validateHeaderName(
    name: String,
)
