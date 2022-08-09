// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

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
