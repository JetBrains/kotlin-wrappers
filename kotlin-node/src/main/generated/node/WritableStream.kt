// Automatically generated - do not modify!

package node

sealed external interface WritableStream : node.events.IEventEmitter {
    var writable: Boolean
    fun write(
        buffer: Any, /* Uint8Array | string */
        cb: (err: Error?) -> Unit = definedExternally,
    ): Boolean

    fun write(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: (err: Error?) -> Unit = definedExternally,
    ): Boolean

    fun end(cb: () -> Unit = definedExternally): WritableStream
    fun end(
        data: Any, /* string | Uint8Array */
        cb: () -> Unit = definedExternally,
    ): WritableStream

    fun end(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: () -> Unit = definedExternally,
    ): WritableStream
}
