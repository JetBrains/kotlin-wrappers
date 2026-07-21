// Automatically generated - do not modify!

package web.gpu

import js.collections.ReadonlySet

/**
 * The **`WGSLLanguageFeatures`** interface of the WebGPU API is a setlike object that reports the WGSL language extensions supported by the WebGPU implementation.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WGSLLanguageFeatures)
 */
open external class WGSLLanguageFeatures
private constructor() :
    ReadonlySet.Mixin<JsString> {
    override fun forEach(action: (item: JsString) -> Unit)
}
