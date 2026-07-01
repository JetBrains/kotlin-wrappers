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
        val VERTEX: GPUShaderStage
        val FRAGMENT: GPUShaderStage
        val COMPUTE: GPUShaderStage
    }
}
