// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v22.15.0
 * @experimental
 */
external fun zstdCompress(
    buf: InputType,
    callback: CompressCallback,
)

external fun zstdCompress(
    buf: InputType,
    options: ZstdOptions,
    callback: CompressCallback,
)
