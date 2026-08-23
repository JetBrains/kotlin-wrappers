// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createPipelineLayout#descriptor)
 */
@JsPlainObject
external interface GPUPipelineLayoutDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createPipelineLayout#bindgrouplayouts)
     */
    var bindGroupLayouts: ReadonlyArray<GPUBindGroupLayout?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createPipelineLayout#immediatesize)
     */
    var immediateSize: GPUSize32?
}
