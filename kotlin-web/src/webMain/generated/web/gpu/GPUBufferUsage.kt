// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.numbers.Bitmask

sealed /* enum */
external interface GPUBufferUsage :
    Bitmask<GPUBufferUsage> {
    companion object {
        /**
         * Value - `0x0001`
         */
        val MAP_READ: GPUBufferUsage

        /**
         * Value - `0x0002`
         */
        val MAP_WRITE: GPUBufferUsage

        /**
         * Value - `0x0004`
         */
        val COPY_SRC: GPUBufferUsage

        /**
         * Value - `0x0008`
         */
        val COPY_DST: GPUBufferUsage

        /**
         * Value - `0x0010`
         */
        val INDEX: GPUBufferUsage

        /**
         * Value - `0x0020`
         */
        val VERTEX: GPUBufferUsage

        /**
         * Value - `0x0040`
         */
        val UNIFORM: GPUBufferUsage

        /**
         * Value - `0x0080`
         */
        val STORAGE: GPUBufferUsage

        /**
         * Value - `0x0100`
         */
        val INDIRECT: GPUBufferUsage

        /**
         * Value - `0x0200`
         */
        val QUERY_RESOLVE: GPUBufferUsage
    }
}
