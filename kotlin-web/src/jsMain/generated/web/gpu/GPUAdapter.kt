// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync

sealed external class GPUAdapter {
    val features: GPUSupportedFeatures
    val limits: GPUSupportedLimits
    val isFallbackAdapter: Boolean

    @JsAsync
    suspend fun requestDevice(descriptor: GPUDeviceDescriptor = definedExternally): GPUDevice

    @JsName("requestDevice")
    fun requestDeviceAsync(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>

    @JsAsync
    suspend fun requestAdapterInfo(): GPUAdapterInfo

    @JsName("requestAdapterInfo")
    fun requestAdapterInfoAsync(): Promise<GPUAdapterInfo>
}
