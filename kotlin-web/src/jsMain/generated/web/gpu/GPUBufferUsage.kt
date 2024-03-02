// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

external interface GPUBufferUsage
    : GPUConstant {
    companion object {
        val MAP_READ: GPUBufferUsage            // 0x0001
        val MAP_WRITE: GPUBufferUsage           // 0x0002
        val COPY_SRC: GPUBufferUsage            // 0x0004
        val COPY_DST: GPUBufferUsage            // 0x0008
        val INDEX: GPUBufferUsage               // 0x0010
        val VERTEX: GPUBufferUsage              // 0x0020
        val UNIFORM: GPUBufferUsage             // 0x0040
        val STORAGE: GPUBufferUsage             // 0x0080
        val INDIRECT: GPUBufferUsage            // 0x0100
        val QUERY_RESOLVE: GPUBufferUsage       // 0x0200
    }
}
