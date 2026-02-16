// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`GPUAdapter`** interface of the WebGPU API represents a GPU adapter. From this you can request a GPUDevice, adapter info, features, and limits.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter)
 */
open external class GPUAdapter
private constructor() {
    /**
     * The **`features`** read-only property of the GPUAdapter interface returns a GPUSupportedFeatures object that describes additional functionality supported by the adapter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/features)
     */
    val features: GPUSupportedFeatures

    /**
     * The **`info`** read-only property of the GPUAdapter interface returns a GPUAdapterInfo object containing identifying information about the adapter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/info)
     */
    val info: GPUAdapterInfo

    /**
     * The **`limits`** read-only property of the GPUAdapter interface returns a GPUSupportedLimits object that describes the limits supported by the adapter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * The **`requestDevice()`** method of the GPUAdapter interface returns a Promise that fulfills with a GPUDevice object, which is the primary interface for communicating with the GPU.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
     */
    @JsName("requestDevice")
    fun requestDeviceAsync(descriptor: GPUDeviceDescriptor = definedExternally): Promise<GPUDevice>
}

/**
 * The **`requestDevice()`** method of the GPUAdapter interface returns a Promise that fulfills with a GPUDevice object, which is the primary interface for communicating with the GPU.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
 */
suspend inline fun GPUAdapter.requestDevice(): GPUDevice {
    return requestDeviceAsync().await()
}

/**
 * The **`requestDevice()`** method of the GPUAdapter interface returns a Promise that fulfills with a GPUDevice object, which is the primary interface for communicating with the GPU.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice)
 */
suspend inline fun GPUAdapter.requestDevice(descriptor: GPUDeviceDescriptor): GPUDevice {
    return requestDeviceAsync(
        descriptor = descriptor,
    ).await()
}
