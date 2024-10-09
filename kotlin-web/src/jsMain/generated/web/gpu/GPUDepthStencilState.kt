// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUDepthStencilState {
    val format: GPUTextureFormat
    val depthWriteEnabled: Boolean
    val depthCompare: GPUCompareFunction
    val stencilFront: GPUStencilFaceState?
    val stencilBack: GPUStencilFaceState?
    val stencilReadMask: GPUStencilValue?
    val stencilWriteMask: GPUStencilValue?
    val depthBias: GPUDepthBias?
    val depthBiasSlopeScale: Float?
    val depthBiasClamp: Float?
}
