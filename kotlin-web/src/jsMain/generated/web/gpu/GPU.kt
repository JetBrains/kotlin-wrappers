// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync

sealed external class GPU {
    @JsAsync
    suspend fun requestAdapter(options: GPURequestAdapterOptions = definedExternally): GPUAdapter?

    @JsName("requestAdapter")
    fun requestAdapterAsync(options: GPURequestAdapterOptions = definedExternally): Promise<GPUAdapter?>
    fun getPreferredCanvasFormat(): GPUTextureFormat
}
