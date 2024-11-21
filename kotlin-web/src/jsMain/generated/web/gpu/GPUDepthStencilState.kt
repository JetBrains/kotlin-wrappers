// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUDepthStencilState {
    val depthBias: GPUDepthBias?
    val depthBiasClamp: Float?
    val depthBiasSlopeScale: Float?
    val depthCompare: GPUCompareFunction?
    val depthWriteEnabled: Boolean?
    val format: GPUTextureFormat
    val stencilBack: GPUStencilFaceState?
    val stencilFront: GPUStencilFaceState?
    val stencilReadMask: GPUStencilValue?
    val stencilWriteMask: GPUStencilValue?
}
