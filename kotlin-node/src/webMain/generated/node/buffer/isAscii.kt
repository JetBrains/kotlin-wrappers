// Automatically generated - do not modify!

@file:JsModule("node:buffer")

package node.buffer

/**
 * This function returns `true` if `input` contains only valid ASCII-encoded data,
 * including the case in which `input` is empty.
 *
 * Throws if the `input` is a detached array buffer.
 * @since v19.6.0, v18.15.0
 * @param input The input to validate.
 */
external fun isAscii(input: js.buffer.ArrayBuffer): Boolean

/**
 * This function returns `true` if `input` contains only valid ASCII-encoded data,
 * including the case in which `input` is empty.
 *
 * Throws if the `input` is a detached array buffer.
 * @since v19.6.0, v18.15.0
 * @param input The input to validate.
 */
external fun isAscii(input: js.typedarrays.TypedArray<*, *, *, *>): Boolean
