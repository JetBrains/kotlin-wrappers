// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`GPUShaderModule`** interface of the WebGPU API represents an internal shader module object, a container for WGSL shader code that can be submitted to the GPU for execution by a pipeline.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule)
 */
open external class GPUShaderModule
private constructor() :
    GPUObjectBase {
    /**
     * The **`getCompilationInfo()`** method of the GPUShaderModule interface returns a Promise that fulfills with a GPUCompilationInfo object containing messages generated during the GPUShaderModule's compilation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule/getCompilationInfo)
     */
    @JsName("getCompilationInfo")
    fun getCompilationInfoAsync(): Promise<GPUCompilationInfo>
}

/**
 * The **`getCompilationInfo()`** method of the GPUShaderModule interface returns a Promise that fulfills with a GPUCompilationInfo object containing messages generated during the GPUShaderModule's compilation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule/getCompilationInfo)
 */
suspend inline fun GPUShaderModule.getCompilationInfo(): GPUCompilationInfo {
    return getCompilationInfoAsync().await()
}
