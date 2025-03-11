// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter)
 */
external class GPUAdapter
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/features)
     */
    val features: GPUSupportedFeatures

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/info)
     */
    val info: GPUAdapterInfo

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/isFallbackAdapter)
     */
    val isFallbackAdapter: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestDevice(descriptor: GPUDeviceDescriptor = definedExternally): GPUDevice

    @JsName("requestDevice")
    fun requestDeviceAsync(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>
}
