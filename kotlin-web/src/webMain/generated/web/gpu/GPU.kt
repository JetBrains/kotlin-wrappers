// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`GPU`** interface of the WebGPU API is the starting point for using WebGPU. It can be used to return a GPUAdapter from which you can request devices, configure features and limits, and more.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU)
 */
open external class GPU
private constructor() {
    /**
     * The **`wgslLanguageFeatures`** read-only property of the GPU interface returns a WGSLLanguageFeatures object that reports the WGSL language extensions supported by the WebGPU implementation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/wgslLanguageFeatures)
     */
    val wgslLanguageFeatures: WGSLLanguageFeatures

    /**
     * The **`getPreferredCanvasFormat()`** method of the GPU interface returns the optimal canvas texture format for displaying 8-bit depth, standard dynamic range content on the current system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/getPreferredCanvasFormat)
     */
    fun getPreferredCanvasFormat(): GPUTextureFormat

    /**
     * The **`requestAdapter()`** method of the GPU interface returns a Promise that fulfills with a GPUAdapter object instance. From this you can request a GPUDevice, adapter info, features, and limits.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
     */
    @JsName("requestAdapter")
    fun requestAdapterAsync(options: GPURequestAdapterOptions = definedExternally): Promise<GPUAdapter?>
}

/**
 * The **`requestAdapter()`** method of the GPU interface returns a Promise that fulfills with a GPUAdapter object instance. From this you can request a GPUDevice, adapter info, features, and limits.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
 */
suspend inline fun GPU.requestAdapter(): GPUAdapter? {
    return requestAdapterAsync().await()
}

/**
 * The **`requestAdapter()`** method of the GPU interface returns a Promise that fulfills with a GPUAdapter object instance. From this you can request a GPUDevice, adapter info, features, and limits.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
 */
suspend inline fun GPU.requestAdapter(options: GPURequestAdapterOptions): GPUAdapter? {
    return requestAdapterAsync(
        options = options,
    ).await()
}
