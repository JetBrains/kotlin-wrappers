// Automatically generated - do not modify!

package node.stream

sealed external interface TransformOptions : DuplexOptions {
    /* this: Transform */
    override var construct: ((callback: (error: Error?) -> Unit) -> Unit)?

    /* this: Transform */
    override var read: ((size: Number) -> Unit)?

    /* this: Transform */
    override var write: ((
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
        callback: (error: Error?) -> Unit,
    ) -> Unit)?

    // HIDDEN METHOD START
    /*
    writev?(
        this: Transform,
        chunks: Array<{
            chunk: any;
            encoding: BufferEncoding;
        }>,
        callback: (error?: Error | null) => void
    ): void
    */
    // HIDDEN METHOD END

    /* this: Transform */
    override var final: ((callback: (error: Error?) -> Unit) -> Unit)?

    /* this: Transform */
    override var destroy: ((
        error: Error?,
        callback: (error: Error?) -> Unit,
    ) -> Unit)?

    /* this: Transform */
    var transform: ((
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
        callback: TransformCallback,
    ) -> Unit)?

    /* this: Transform */
    var flush: ((callback: TransformCallback) -> Unit)?
}
