// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

import kotlinx.js.ArrayBufferView
import kotlinx.js.ReadonlyArray

/**
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link writev}.
 * @since v12.9.0
 * @return The number of bytes written.
 */
external fun writevSync(
    fd: Number,
    buffers: ReadonlyArray<ArrayBufferView>,
    position: Number = definedExternally,
): Number
