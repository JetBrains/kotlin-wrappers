// Generated by Karakum - do not modify it manually!

@file:JsModule("null-writable")

package nullwritable

// unhandled import: Writable from "node:stream"
import node.buffer.BufferEncoding
import node.stream.Writable

external class NullWritable : Writable {
    override fun _write(
        _chunk: Any?,
        _encoding: BufferEncoding,
        callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
    )

    override val _writev: (
        (
            _chunks: Array<node.stream.WritableWritevChunksItem>,
            callback: (error: js.errors.JsError? /* use undefined for default */) -> Unit,
        ) -> Unit
    )?
}
