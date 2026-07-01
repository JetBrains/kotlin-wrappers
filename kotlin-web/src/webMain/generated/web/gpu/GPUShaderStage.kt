// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.numbers.Bitmask

sealed /* enum */
external interface GPUShaderStage :
    Bitmask<GPUShaderStage> {
    companion object {
        /**
         * Value - `0x1`
         */
        val VERTEX: GPUShaderStage

        /**
         * Value - `0x2`
         */
        val FRAGMENT: GPUShaderStage

        /**
         * Value - `0x4`
         */
        val COMPUTE: GPUShaderStage
    }
}
