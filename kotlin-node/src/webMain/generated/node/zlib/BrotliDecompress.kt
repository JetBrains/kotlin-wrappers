// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v10.16.0
 */
external class BrotliDecompress :
    node.stream.Transform,
    Zlib {
    constructor (options: BrotliOptions = definedExternally)

    override val bytesWritten: Double
    override var shell: Any? // boolean | string | undefined

    override fun close(callback: () -> Unit)

    override fun flush(
        kind: Number,
        callback: () -> Unit,
    )

    override fun flush(callback: () -> Unit)
}
