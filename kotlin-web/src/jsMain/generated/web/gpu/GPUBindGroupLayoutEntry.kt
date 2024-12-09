// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
external interface GPUBindGroupLayoutEntry {
    val binding: GPUIndex32
    val buffer: GPUBufferBindingLayout?
    val externalTexture: GPUExternalTextureBindingLayout?
    val sampler: GPUSamplerBindingLayout?
    val storageTexture: GPUStorageTextureBindingLayout?
    val texture: GPUTextureBindingLayout?
    val visibility: GPUShaderStageFlags
}
