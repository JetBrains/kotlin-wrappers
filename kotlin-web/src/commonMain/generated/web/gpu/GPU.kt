// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU)
 */
external class GPU
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/wgslLanguageFeatures)
     */
    val wgslLanguageFeatures: WGSLLanguageFeatures

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/getPreferredCanvasFormat)
     */
    fun getPreferredCanvasFormat(): GPUTextureFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
     */
    @JsName("requestAdapter")
    fun requestAdapterAsync(options: GPURequestAdapterOptions = definedExternally): Promise<GPUAdapter?>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
 */
suspend inline fun GPU.requestAdapter(options: GPURequestAdapterOptions): GPUAdapter? {
    return awaitPromiseLike(requestAdapterAsync(options = options))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPU/requestAdapter)
 */
suspend inline fun GPU.requestAdapter(): GPUAdapter? {
    return awaitPromiseLike(requestAdapterAsync())
}
