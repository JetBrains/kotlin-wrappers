// Automatically generated - do not modify!

package web.gpu

sealed external interface GPUCanvasContext {
    fun configure(configuration: GPUCanvasConfiguration)
    fun unconfigure()
    fun getCurrentTexture(): GPUTexture
}
