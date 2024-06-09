// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface GPUVertexBufferLayout {
    var arrayStride: GPUSize64
    var stepMode: GPUVertexStepMode?
    var attributes: ReadonlyArray<GPUVertexAttribute>
}
