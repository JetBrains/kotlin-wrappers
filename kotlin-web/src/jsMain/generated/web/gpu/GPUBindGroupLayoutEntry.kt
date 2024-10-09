// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUBindGroupLayoutEntry {
    val binding: GPUIndex32
    val visibility: GPUShaderStage
    val buffer: GPUBufferBindingLayout?
    val sampler: GPUSamplerBindingLayout?
    val texture: GPUTextureBindingLayout?
    val storageTexture: GPUStorageTextureBindingLayout?
}
