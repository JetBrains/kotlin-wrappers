// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPURenderPassLayout :
    GPUObjectDescriptorBase {
    var colorFormats: ReadonlyArray<GPUTextureFormat?>
    var depthStencilFormat: GPUTextureFormat?
    var sampleCount: GPUSize32?
}
