// Automatically generated - do not modify!

package web.gpu

import js.collections.ReadonlySet
import kotlin.js.JsString

/**
 * The **`GPUSupportedFeatures`** interface of the WebGPU API is a Set-like object that describes additional functionality supported by a GPUAdapter.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUSupportedFeatures)
 */
sealed /* final */
external class GPUSupportedFeatures
private constructor() :
    ReadonlySet<JsString> {
    override fun forEach(action: (item: JsString) -> Unit)
}
