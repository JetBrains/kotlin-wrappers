// Generated by Karakum - do not modify it manually!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v0.6.0
 */
external fun inflateRaw(
    buf: InputType,
    callback: CompressCallback,
)

external fun inflateRaw(
    buf: InputType,
    options: ZlibOptions,
    callback: CompressCallback,
)
