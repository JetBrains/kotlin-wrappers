// Automatically generated - do not modify!

@file:JsModule("node:v8")

package node.v8

import node.buffer.NonSharedBuffer

/**
 * Uses a `DefaultSerializer` to serialize `value` into a buffer.
 *
 * `ERR_BUFFER_TOO_LARGE` will be thrown when trying to
 * serialize a huge object which requires buffer
 * larger than `buffer.constants.MAX_LENGTH`.
 * @since v8.0.0
 */
external fun serialize(value: Any?): NonSharedBuffer
