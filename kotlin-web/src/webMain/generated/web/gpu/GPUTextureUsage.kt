// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.numbers.Bitmask

sealed /* enum */
external interface GPUTextureUsage :
    Bitmask<GPUTextureUsage> {
    companion object {
        val COPY_SRC: GPUTextureUsage
        val COPY_DST: GPUTextureUsage
        val TEXTURE_BINDING: GPUTextureUsage
        val STORAGE_BINDING: GPUTextureUsage
        val RENDER_ATTACHMENT: GPUTextureUsage
        val TRANSIENT_ATTACHMENT: GPUTextureUsage
    }
}
