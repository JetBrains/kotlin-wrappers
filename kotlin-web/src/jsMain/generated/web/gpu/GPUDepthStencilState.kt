// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPUDepthStencilState {
    var format: GPUTextureFormat
    var depthWriteEnabled: Boolean
    var depthCompare: GPUCompareFunction
    var stencilFront: GPUStencilFaceState?
    var stencilBack: GPUStencilFaceState?
    var stencilReadMask: Number?
    var stencilWriteMask: Number?
    var depthBias: Number?
    var depthBiasSlopeScale: Float?
    var depthBiasClamp: Float?
}
