// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule)
 */
external class GPUShaderModule
private constructor() :
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUShaderModule/getCompilationInfo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getCompilationInfo(): GPUCompilationInfo

    @JsName("getCompilationInfo")
    fun getCompilationInfoAsync(): Promise<GPUCompilationInfo>
}
