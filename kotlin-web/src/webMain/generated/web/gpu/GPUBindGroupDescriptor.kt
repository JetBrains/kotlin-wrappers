// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroup#descriptor)
 */
@JsPlainObject
external interface GPUBindGroupDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroup#entries)
     */
    var entries: ReadonlyArray<GPUBindGroupEntry>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroup#layout)
     */
    var layout: GPUBindGroupLayout
}
