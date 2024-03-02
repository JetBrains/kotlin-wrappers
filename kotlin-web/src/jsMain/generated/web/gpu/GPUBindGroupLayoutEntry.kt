// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPUBindGroupLayoutEntry {
    var binding: Number
    var visibility: GPUShaderStageFlags
    var buffer: GPUBufferBindingLayout?
    var sampler: GPUSamplerBindingLayout?
    var texture: GPUTextureBindingLayout?
    var storageTexture: GPUStorageTextureBindingLayout?
}
