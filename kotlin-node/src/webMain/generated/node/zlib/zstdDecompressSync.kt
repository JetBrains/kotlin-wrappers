// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

import node.buffer.NonSharedBuffer

/**
 * Decompress a chunk of data with `ZstdDecompress`.
 * @since v22.15.0
 * @experimental
 */
external fun zstdDecompressSync(
    buf: InputType,
    options: ZstdOptions = definedExternally,
): NonSharedBuffer
