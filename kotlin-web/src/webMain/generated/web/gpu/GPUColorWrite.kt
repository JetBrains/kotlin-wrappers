// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.numbers.Bitmask

sealed /* enum */
external interface GPUColorWrite :
    Bitmask<GPUColorWrite> {
    companion object {
        /**
         * Value - `0x1`
         */
        val RED: GPUColorWrite

        /**
         * Value - `0x2`
         */
        val GREEN: GPUColorWrite

        /**
         * Value - `0x4`
         */
        val BLUE: GPUColorWrite

        /**
         * Value - `0x8`
         */
        val ALPHA: GPUColorWrite

        /**
         * Value - `0xF`
         */
        val ALL: GPUColorWrite
    }
}
