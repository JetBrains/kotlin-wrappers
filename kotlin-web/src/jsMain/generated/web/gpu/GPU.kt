// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise

sealed external class GPU {
    fun requestAdapter(options: GPURequestAdapterOptions = definedExternally): Promise<GPUAdapter?>
    fun getPreferredCanvasFormat(): GPUTextureFormat
}
