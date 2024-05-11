// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
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
    suspend fun requestAdapterInfo(unmaskHints: ReadonlyArray<String> = definedExternally): GPUAdapterInfo

    @JsName("requestAdapterInfo")
    fun requestAdapterInfoAsync(unmaskHints: ReadonlyArray<String> = definedExternally): Promise<GPUAdapterInfo>
}
