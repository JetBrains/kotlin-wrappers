// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsNonModule

package node.stream

open external class Transform : Duplex {
    constructor(opts: TransformOptions = definedExternally)

    fun _transform(
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
        callback: TransformCallback,
    )

    fun _flush(callback: TransformCallback)
}
