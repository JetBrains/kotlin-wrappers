// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * The **`GPURenderBundleEncoder`** interface of the WebGPU API is used to pre-record bundles of commands.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder)
 */
open external class GPURenderBundleEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase,
    GPURenderCommandsMixin {
    /**
     * The **`finish()`** method of the GPURenderBundleEncoder interface completes recording of the current render bundle command sequence, returning a GPURenderBundle object that can be passed into a GPURenderPassEncoder.executeBundles() call to execute those commands in a specific render pass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/finish)
     */
    fun finish(descriptor: GPURenderBundleDescriptor = definedExternally): GPURenderBundle
}
