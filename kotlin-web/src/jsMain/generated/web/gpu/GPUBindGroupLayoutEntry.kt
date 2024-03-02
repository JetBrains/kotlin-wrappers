// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPUBindGroupLayoutEntry {
    var binding: GPUIndex32
    var visibility: GPUShaderStage
    var buffer: GPUBufferBindingLayout?
    var sampler: GPUSamplerBindingLayout?
    var texture: GPUTextureBindingLayout?
    var storageTexture: GPUStorageTextureBindingLayout?
}
