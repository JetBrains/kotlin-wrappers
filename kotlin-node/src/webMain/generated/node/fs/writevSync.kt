// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import js.array.ReadonlyArray

/**
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link writev}.
 * @since v12.9.0
 * @param [position='null']
 * @return The number of bytes written.
 */
external fun writevSync(
    fd: Number,
    buffers: ReadonlyArray<js.buffer.ArrayBufferView<*>>,
    position: Number = definedExternally,
): Double
