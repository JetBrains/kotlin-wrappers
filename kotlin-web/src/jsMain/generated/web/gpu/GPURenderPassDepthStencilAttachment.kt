// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPURenderPassDepthStencilAttachment {
    var view: GPUTextureView
    var depthClearValue: Float?
    var depthLoadOp: GPULoadOp?
    var depthStoreOp: GPUStoreOp?
    var depthReadOnly: Boolean?
    var stencilClearValue: Number?
    var stencilLoadOp: GPULoadOp?
    var stencilStoreOp: GPUStoreOp?
    var stencilReadOnly: Boolean?
}
