// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createShaderModule#descriptor)
 */
@JsPlainObject
external interface GPUShaderModuleDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createShaderModule#code)
     */
    var code: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createShaderModule#compilationhints)
     */
    var compilationHints: ReadonlyArray<GPUShaderModuleCompilationHint>?
}
