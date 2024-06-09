// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface GPURenderPassColorAttachment {
    var view: GPUTextureView
    var resolveTarget: GPUTextureView?
    var clearValue: GPUColor?
    var loadOp: GPULoadOp
    var storeOp: GPUStoreOp
}
