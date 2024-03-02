// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray

sealed external interface GPURenderPassLayout :
    GPUObjectDescriptorBase {
    var colorFormats: ReadonlyArray<GPUTextureFormat?>
    var depthStencilFormat: GPUTextureFormat?
    var sampleCount: Number?
}
