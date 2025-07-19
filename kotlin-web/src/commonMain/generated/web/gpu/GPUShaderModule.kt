// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule)
 */
open external class GPUShaderModule
private constructor() :
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule/getCompilationInfo)
     */
    @JsName("getCompilationInfo")
    fun getCompilationInfoAsync(): Promise<GPUCompilationInfo>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule/getCompilationInfo)
 */
suspend inline fun GPUShaderModule.getCompilationInfo(): GPUCompilationInfo {
    return getCompilationInfoAsync().await()
}
