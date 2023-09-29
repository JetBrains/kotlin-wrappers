@file:JsModule("node:crypto")

package node.crypto


external fun pseudoRandomBytes(size: Number): node.buffer.Buffer

external fun pseudoRandomBytes(
    size: Number,
    callback: (err: Throwable /* JsError */?, buf: node.buffer.Buffer) -> Unit,
): Unit
