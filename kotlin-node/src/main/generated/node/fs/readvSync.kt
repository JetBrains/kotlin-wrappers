// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

import kotlinx.js.ArrayBufferView
import kotlinx.js.ReadonlyArray

/**
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link readv}.
 * @since v13.13.0, v12.17.0
 * @return The number of bytes read.
 */
external fun readvSync(
    fd: Number,
    buffers: ReadonlyArray<ArrayBufferView>,
    position: Number = definedExternally,
): Number
