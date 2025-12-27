// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

import node.buffer.NonSharedBuffer

/**
 * Compress a chunk of data with `Gzip`.
 * @since v0.11.12
 */
external fun gzipSync(
    buf: InputType,
    options: ZlibOptions = definedExternally,
): NonSharedBuffer
