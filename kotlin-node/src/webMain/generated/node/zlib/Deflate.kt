// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v0.5.8
 */
external class Deflate :
    node.stream.Transform,
    Zlib,
    ZlibReset,
    ZlibParams {
    constructor (options: ZlibOptions = definedExternally)

    override val bytesWritten: Double
    override var shell: Any? // boolean | string | undefined

    override fun close(callback: () -> Unit)

    override fun flush(
        kind: Number,
        callback: () -> Unit,
    )

    override fun flush(callback: () -> Unit)

    override fun reset()

    override fun params(
        level: Number,
        strategy: Number,
        callback: () -> Unit,
    )
}
