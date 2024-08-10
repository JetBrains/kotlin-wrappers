// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream")

package node.stream

/**
 * Transform streams are `Duplex` streams where the output is in some way
 * related to the input. Like all `Duplex` streams, `Transform` streams
 * implement both the `Readable` and `Writable` interfaces.
 *
 * Examples of `Transform` streams include:
 *
 * * `zlib streams`
 * * `crypto streams`
 * @since v0.9.4
 */
open external class Transform : Duplex {
    constructor (opts: TransformOptions = definedExternally)

    fun _transform(chunk: Any?, encoding: node.buffer.BufferEncoding, callback: TransformCallback): Unit
    fun _flush(callback: TransformCallback): Unit
}
