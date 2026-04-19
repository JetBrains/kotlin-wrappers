// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v0.5.8
 */
external class Gzip :
    node.stream.Transform,
    Zlib {
    constructor (options: ZlibOptions = definedExternally)

    override val bytesWritten: Double
    override var shell: Any? // boolean | string | undefined

    override fun close(callback: () -> Unit)

    override fun flush(
        kind: Number,
        callback: () -> Unit,
    )

    override fun flush(callback: () -> Unit)
}
