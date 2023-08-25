// Automatically generated - do not modify!

package node.stream

sealed external interface DuplexOptions : ReadableOptions, WritableOptions {
    var allowHalfOpen: Boolean?
    var readableObjectMode: Boolean?
    var writableObjectMode: Boolean?
    var readableHighWaterMark: Number?
    var writableHighWaterMark: Number?
    var writableCorked: Number?

    /* this: Duplex */
    override var construct: ((callback: (error: Error?) -> Unit) -> Unit)?

    /* this: Duplex */
    override var read: ((size: Number) -> Unit)?

    /* this: Duplex */
    override var write: ((
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Error?) -> Unit,
    ) -> Unit)?

    // HIDDEN METHOD START
    /*
    writev?(
        this: Duplex,
        chunks: Array<{
            chunk: any;
            encoding: BufferEncoding;
        }>,
        callback: (error?: Error | null) => void
    ): void
    */
    // HIDDEN METHOD END

    /* this: Duplex */
    override var final: ((callback: (error: Error?) -> Unit) -> Unit)?

    /* this: Duplex */
    override var destroy: ((
        error: Error?,
        callback: (error: Error?) -> Unit,
    ) -> Unit)?
}
