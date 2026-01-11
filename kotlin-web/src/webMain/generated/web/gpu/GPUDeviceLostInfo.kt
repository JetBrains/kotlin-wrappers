// Automatically generated - do not modify!

package web.gpu

/**
 * The **`GPUDeviceLostInfo`** interface of the WebGPU API represents the object returned when the GPUDevice.lost Promise resolves. This provides information as to why a device has been lost.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo)
 */
open external class GPUDeviceLostInfo
private constructor() {
    /**
     * The **`message`** read-only property of the GPUDeviceLostInfo interface provides a human-readable message that explains why the device was lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo/message)
     */
    val message: String

    /**
     * The **`reason`** read-only property of the GPUDeviceLostInfo interface defines the reason the device was lost in a machine-readable way.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo/reason)
     */
    val reason: GPUDeviceLostReason
}
