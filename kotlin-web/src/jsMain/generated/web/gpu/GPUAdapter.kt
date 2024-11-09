// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync

external class GPUAdapter
private constructor() {
    val features: GPUSupportedFeatures
    val limits: GPUSupportedLimits
    val info: GPUAdapterInfo
    val isFallbackAdapter: Boolean

    @JsAsync
    suspend fun requestDevice(descriptor: GPUDeviceDescriptor = definedExternally): GPUDevice

    @JsName("requestDevice")
    fun requestDeviceAsync(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>
}
