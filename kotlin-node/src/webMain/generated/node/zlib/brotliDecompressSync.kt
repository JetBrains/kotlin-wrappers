// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

import node.buffer.NonSharedBuffer

/**
 * Decompress a chunk of data with `BrotliDecompress`.
 * @since v11.7.0, v10.16.0
 */
external fun brotliDecompressSync(
    buf: InputType,
    options: BrotliOptions = definedExternally,
): NonSharedBuffer
