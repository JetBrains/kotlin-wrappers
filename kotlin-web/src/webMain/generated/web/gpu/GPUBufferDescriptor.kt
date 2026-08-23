// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer#descriptor)
 */
@JsPlainObject
external interface GPUBufferDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer#mappedatcreation)
     */
    var mappedAtCreation: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer#size)
     */
    var size: GPUSize64

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer#usage)
     */
    var usage: GPUBufferUsage
}
