// Automatically generated - do not modify!

package node

external interface WritableStream : node.events.IEventEmitter {
    var writable: Boolean
    fun write(
        chunk: Any, /* Uint8Array | string */
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    fun write(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: (error: Error?) -> Unit = definedExternally,
    ): Boolean

    fun end(callback: () -> Unit = definedExternally): WritableStream
    fun end(
        chunk: Any, /* string | Uint8Array */
        callback: () -> Unit = definedExternally,
    ): WritableStream

    fun end(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        callback: () -> Unit = definedExternally,
    ): WritableStream
}
