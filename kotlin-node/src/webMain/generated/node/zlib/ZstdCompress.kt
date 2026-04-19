// Automatically generated - do not modify!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v22.15.0
 * @experimental
 */
external class ZstdCompress :
    node.stream.Transform,
    Zlib {
    constructor (options: ZstdOptions = definedExternally)

    override val bytesWritten: Double
    override var shell: Any? // boolean | string | undefined

    override fun close(callback: () -> Unit)

    override fun flush(
        kind: Number,
        callback: () -> Unit,
    )

    override fun flush(callback: () -> Unit)
}
