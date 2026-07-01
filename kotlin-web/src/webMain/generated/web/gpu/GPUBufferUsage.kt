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
        val MAP_READ: GPUBufferUsage
        val MAP_WRITE: GPUBufferUsage
        val COPY_SRC: GPUBufferUsage
        val COPY_DST: GPUBufferUsage
        val INDEX: GPUBufferUsage
        val VERTEX: GPUBufferUsage
        val UNIFORM: GPUBufferUsage
        val STORAGE: GPUBufferUsage
        val INDIRECT: GPUBufferUsage
        val QUERY_RESOLVE: GPUBufferUsage
    }
}
