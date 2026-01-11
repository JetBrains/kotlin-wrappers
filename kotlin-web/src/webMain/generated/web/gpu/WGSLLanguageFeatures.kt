// Automatically generated - do not modify!

package web.gpu

import js.collections.ReadonlySet
import kotlin.js.JsString

/**
 * The **`WGSLLanguageFeatures`** interface of the WebGPU API is a setlike object that reports the WGSL language extensions supported by the WebGPU implementation.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WGSLLanguageFeatures)
 */
sealed /* final */
external class WGSLLanguageFeatures
private constructor() :
    ReadonlySet<JsString> {
    override fun forEach(action: (item: JsString) -> Unit)
}
