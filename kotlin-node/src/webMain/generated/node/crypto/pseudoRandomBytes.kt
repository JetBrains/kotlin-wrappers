// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.buffer.NonSharedBuffer

external fun pseudoRandomBytes(size: Number): NonSharedBuffer

external fun pseudoRandomBytes(
    size: Number,
    callback: (err: js.errors.JsError?, buf: NonSharedBuffer) -> Unit,
)
