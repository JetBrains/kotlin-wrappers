// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPURenderPassLayout :
    GPUObjectDescriptorBase {
    val colorFormats: ReadonlyArray<GPUTextureFormat?>
    val depthStencilFormat: GPUTextureFormat?
    val sampleCount: GPUSize32?
}
