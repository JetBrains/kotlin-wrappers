@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer

external fun pseudoRandomBytes(size: Double): Buffer

external fun pseudoRandomBytes(size: Double, callback: (err: Error?, buf: Buffer) -> Unit): Unit
