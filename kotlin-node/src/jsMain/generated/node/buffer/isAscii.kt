@file:JsModule("node:buffer")

package node.buffer

import js.buffer.ArrayBuffer

external fun isAscii(input: Buffer): Boolean

external fun isAscii(input: ArrayBuffer): Boolean

external fun isAscii(input: js.typedarrays.TypedArray<*, *>): Boolean
