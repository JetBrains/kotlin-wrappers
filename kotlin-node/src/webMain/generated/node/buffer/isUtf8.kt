// Automatically generated - do not modify!

@file:JsModule("node:buffer")

package node.buffer

/**
 * This function returns `true` if `input` contains only valid UTF-8-encoded data,
 * including the case in which `input` is empty.
 *
 * Throws if the `input` is a detached array buffer.
 * @since v19.4.0, v18.14.0
 * @param input The input to validate.
 */
external fun isUtf8(input: js.buffer.ArrayBuffer): Boolean

/**
 * This function returns `true` if `input` contains only valid UTF-8-encoded data,
 * including the case in which `input` is empty.
 *
 * Throws if the `input` is a detached array buffer.
 * @since v19.4.0, v18.14.0
 * @param input The input to validate.
 */
external fun isUtf8(input: js.typedarrays.TypedArray<*, *, *, *>): Boolean
