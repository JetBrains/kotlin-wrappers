@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer

external fun pseudoRandomBytes(size: Number): Buffer

external fun pseudoRandomBytes(size: Number, callback: (err: Error?, buf: Buffer) -> Unit): Unit
