// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.promise.Promise

sealed external class GPUAdapter {
    val features: GPUSupportedFeatures
    val limits: GPUSupportedLimits
    val isFallbackAdapter: Boolean
    fun requestDevice(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>
    fun requestAdapterInfo(unmaskHints: ReadonlyArray<String> = definedExternally): Promise<GPUAdapterInfo>
}
