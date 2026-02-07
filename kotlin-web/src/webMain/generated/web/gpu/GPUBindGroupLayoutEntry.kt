// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUBindGroupLayoutEntry {
    var binding: GPUIndex32
    var buffer: GPUBufferBindingLayout?
    var externalTexture: GPUExternalTextureBindingLayout?
    var sampler: GPUSamplerBindingLayout?
    var storageTexture: GPUStorageTextureBindingLayout?
    var texture: GPUTextureBindingLayout?
    var visibility: GPUShaderStageFlags
}
