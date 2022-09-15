// Automatically generated - do not modify!

package node

external interface ReadableStream : node.events.IEventEmitter {
    var readable: Boolean
    fun read(size: Number = definedExternally): Any /* string | Buffer */
    fun setEncoding(encoding: node.buffer.BufferEncoding) /* : this */
    fun pause() /* : this */
    fun resume() /* : this */
    fun isPaused(): Boolean
    fun <T : WritableStream> pipe(
        destination: T,
        options: PipeOptions = definedExternally,
    ): T

    fun unpipe(destination: WritableStream = definedExternally) /* : this */
    fun unshift(
        chunk: Any, /* string | Uint8Array */
        encoding: node.buffer.BufferEncoding = definedExternally,
    )

    fun wrap(stream: ReadableStream) /* : this */
    /* [Symbol.asyncIterator](): AsyncIterableIterator<string | Buffer> */
}
