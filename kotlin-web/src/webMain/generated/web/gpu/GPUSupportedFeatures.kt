// Automatically generated - do not modify!

package web.gpu

import js.collections.ReadonlySet

/**
 * The **`GPUSupportedFeatures`** interface of the WebGPU API is a Set-like object that describes additional functionality supported by a GPUAdapter.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUSupportedFeatures)
 */
open external class GPUSupportedFeatures
private constructor() :
    ReadonlySet.Mixin<JsString> {
    override fun forEach(action: (item: JsString) -> Unit)
}
