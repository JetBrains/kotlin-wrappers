// Generated by Karakum - do not modify it manually!

package node.vm

import js.buffer.ArrayBufferLike
import node.buffer.Buffer

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface CompileFunctionResult : js.function.JsFunction<Nothing, Any?> {
    var cachedData: Buffer<ArrayBufferLike>?
    var cachedDataProduced: Boolean?
    var cachedDataRejected: Boolean?
}
