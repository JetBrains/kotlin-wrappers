// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

import node.buffer.NonSharedBuffer

/**
 * Decompress a chunk of data with `Gunzip`.
 * @since v0.11.12
 */
external fun gunzipSync(
    buf: InputType,
    options: ZlibOptions = definedExternally,
): NonSharedBuffer
