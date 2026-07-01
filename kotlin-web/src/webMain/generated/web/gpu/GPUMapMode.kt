// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.numbers.Bitmask

sealed /* enum */
external interface GPUMapMode :
    Bitmask<GPUMapMode> {
    companion object {
        /**
         * Value - `0x0001`
         */
        val READ: GPUMapMode

        /**
         * Value - `0x0002`
         */
        val WRITE: GPUMapMode
    }
}
