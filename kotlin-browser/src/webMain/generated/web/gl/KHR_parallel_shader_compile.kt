// Automatically generated - do not modify!

package web.gl

/**
 * The **`KHR_parallel_shader_compile`** extension is part of the WebGL API and enables a non-blocking poll operation, so that compile/link status availability (COMPLETION_STATUS_KHR) can be queried without potentially incurring stalls. In other words you can check the status of your shaders compiling without blocking the runtime.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KHR_parallel_shader_compile)
 */
external interface KHR_parallel_shader_compile {
    val COMPLETION_STATUS_KHR: GLenum
}
