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
        /**
         * Value - `0x01`
         */
        val COPY_SRC: GPUTextureUsage

        /**
         * Value - `0x02`
         */
        val COPY_DST: GPUTextureUsage

        /**
         * Value - `0x04`
         */
        val TEXTURE_BINDING: GPUTextureUsage

        /**
         * Value - `0x08`
         */
        val STORAGE_BINDING: GPUTextureUsage

        /**
         * Value - `0x10`
         */
        val RENDER_ATTACHMENT: GPUTextureUsage

        /**
         * Value - `0x20`
         */
        val TRANSIENT_ATTACHMENT: GPUTextureUsage
    }
}
