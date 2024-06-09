// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface GPUDepthStencilState {
    var format: GPUTextureFormat
    var depthWriteEnabled: Boolean
    var depthCompare: GPUCompareFunction
    var stencilFront: GPUStencilFaceState?
    var stencilBack: GPUStencilFaceState?
    var stencilReadMask: GPUStencilValue?
    var stencilWriteMask: GPUStencilValue?
    var depthBias: GPUDepthBias?
    var depthBiasSlopeScale: Float?
    var depthBiasClamp: Float?
}
