package node.stream

import js.array.ReadonlyArray
import js.errors.JsError
import node.buffer.BufferEncoding

/**
 * [Original](https://github.com/dex4er/js-null-writable)
 */
class NullWritable :
    Writable {
    override fun _write(
        chunk: Any?,
        encoding: BufferEncoding,
        callback: (error: JsError?) -> Unit,
    ) {
        callback(undefined)
    }

    override val _writev: (
        chunks: ReadonlyArray<WritableWritevChunksItem>,
        callback: (error: JsError?) -> Unit,
    ) -> Unit = { _, callback ->
        callback(undefined)
    }
}
