// Automatically generated - do not modify!

package node

import node.events.EventEmitter

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface ReadableStream : EventEmitter {
    var readable: Boolean

    fun read(size: Number = definedExternally): Any // string | Buffer

    fun setEncoding(encoding: node.buffer.BufferEncoding) // this

    fun pause() // this

    fun resume() // this

    fun isPaused(): Boolean

    fun <T : WritableStream> pipe(
        destination: T,
        options: ReadableStreamPipeOptions = definedExternally,
    ): T

    fun unpipe(destination: WritableStream = definedExternally) // this

    fun unshift(
        chunk: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
    )

    fun unshift(
        chunk: js.typedarrays.Uint8Array<*>,
        encoding: node.buffer.BufferEncoding = definedExternally,
    )

    fun wrap(stream: ReadableStream) // this
}
