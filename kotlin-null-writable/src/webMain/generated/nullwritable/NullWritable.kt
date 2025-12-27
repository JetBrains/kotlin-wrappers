// Automatically generated - do not modify!

@file:JsModule("null-writable")

package nullwritable

// unhandled import: Writable from "node:stream"
import node.buffer.BufferEncoding
import node.stream.Writable

external class NullWritable : Writable {
    override fun _write(
        chunk: Any?,
        encoding: BufferEncoding,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    )

    override val _writev: (
        (
            chunks: Array<node.stream.WritableWritevChunksItem>,
            callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
        ) -> Unit
    )?
}
