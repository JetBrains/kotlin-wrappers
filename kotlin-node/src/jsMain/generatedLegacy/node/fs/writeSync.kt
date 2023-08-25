// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import js.buffer.ArrayBufferView

/**
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link write}.
 * @since v0.1.21
 * @return The number of bytes written.
 */
external fun writeSync(
    fd: Number,
    buffer: ArrayBufferView,
    offset: Number? = definedExternally,
    length: Number? = definedExternally,
    position: Number? = definedExternally,
): Number


/**
 * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
 * @param fd A file descriptor.
 * @param string A string to write.
 * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
 * @param encoding The expected string encoding.
 */
external fun writeSync(
    fd: Number,
    string: String,
    position: Number? = definedExternally,
    encoding: node.buffer.BufferEncoding? = definedExternally,
): Number
