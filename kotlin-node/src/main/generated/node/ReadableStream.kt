// Automatically generated - do not modify!

package node

sealed external interface ReadableStream : node.events.IEventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): Any /* string | Buffer */
    fun setEncoding(encoding: node.buffer.BufferEncoding): node.stream.ReadableStream
    fun pause(): node.stream.ReadableStream
    fun resume(): node.stream.ReadableStream
    fun isPaused(): Boolean

    // HIDDEN METHOD START
    /*
    pipe<T extends WritableStream>(destination: T, options?: { end?: boolean | undefined; }): T
    */
    // HIDDEN METHOD END

    fun unpipe(destination: WritableStream = definedExternally): node.stream.ReadableStream
    fun unshift(
        chunk: Any, /* string | Uint8Array */
        encoding: node.buffer.BufferEncoding = definedExternally,
    )

    fun wrap(oldStream: node.stream.ReadableStream): node.stream.ReadableStream
    /* [Symbol.asyncIterator](): AsyncIterableIterator<string | Buffer> */
}
