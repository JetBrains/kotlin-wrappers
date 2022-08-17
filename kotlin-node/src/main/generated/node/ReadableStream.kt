// Automatically generated - do not modify!

package node

external interface ReadableStream : node.events.IEventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): Any /* string | Buffer */
    fun setEncoding(encoding: node.buffer.BufferEncoding): ReadableStream
    fun pause(): ReadableStream
    fun resume(): ReadableStream
    fun isPaused(): Boolean
    fun <T : WritableStream> pipe(
        destination: T,
        options: Any /* { end?: boolean | undefined; } */ = definedExternally,
    ): T

    fun unpipe(destination: WritableStream = definedExternally): ReadableStream
    fun unshift(
        chunk: Any, /* string | Uint8Array */
        encoding: node.buffer.BufferEncoding = definedExternally,
    )

    fun wrap(stream: ReadableStream): ReadableStream
    /* [Symbol.asyncIterator](): AsyncIterableIterator<string | Buffer> */
}
