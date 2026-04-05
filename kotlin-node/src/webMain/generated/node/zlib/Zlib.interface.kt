// Automatically generated - do not modify!

package node.zlib

external interface Zlib {
    val bytesWritten: Double
    var shell: Any? // boolean | string | undefined

    fun close(callback: () -> Unit = definedExternally)

    fun flush(
        kind: Number = definedExternally,
        callback: () -> Unit = definedExternally,
    )

    fun flush(callback: () -> Unit = definedExternally)
}
