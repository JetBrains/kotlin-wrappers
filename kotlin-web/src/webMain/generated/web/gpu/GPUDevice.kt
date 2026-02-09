// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`GPUDevice`** interface of the WebGPU API represents a logical GPU device. This is the main interface through which the majority of WebGPU functionality is accessed.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice)
 */
open external class GPUDevice
private constructor() :
    EventTarget,
    GPUObjectBase {
    /**
     * The **`adapterInfo`** read-only property of the GPUDevice interface returns a GPUAdapterInfo object containing identifying information about the device's originating adapter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/adapterInfo)
     */
    val adapterInfo: GPUAdapterInfo

    /**
     * The **`features`** read-only property of the GPUDevice interface returns a GPUSupportedFeatures object that describes additional functionality supported by the device. Only features requested during the creation of the device (i.e., when GPUAdapter.requestDevice() is called) are included.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/features)
     */
    val features: GPUSupportedFeatures

    /**
     * The **`limits`** read-only property of the GPUDevice interface returns a GPUSupportedLimits object that describes the limits supported by the device. All limit values will be included, and the limits requested during the creation of the device (i.e., when GPUAdapter.requestDevice() is called) will be reflected in those values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * The **`lost`** read-only property of the GPUDevice interface contains a Promise that remains pending throughout the device's lifetime and resolves with a GPUDeviceLostInfo object when the device is lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/lost)
     */
    val lost: Promise<GPUDeviceLostInfo>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/uncapturederror_event)
     */
    var onuncapturederror: EventHandler<GPUUncapturedErrorEvent, GPUDevice, GPUDevice>?

    /**
     * The **`queue`** read-only property of the GPUDevice interface returns the primary GPUQueue for the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/queue)
     */
    val queue: GPUQueue
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/uncapturederror_event)
 */
inline val <C : GPUDevice> C.uncapturedErrorEvent: EventInstance<GPUUncapturedErrorEvent, C, C>
    get() = EventInstance(this, "uncapturederror")
