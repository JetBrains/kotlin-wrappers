// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError/reason)
 */
@JsUnion
sealed /* union */
external interface GPUPipelineErrorReason

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError/reason#internal)
 */
inline val GPUPipelineErrorReason.Companion.internal: GPUPipelineErrorReason
    get() = unsafeCast("internal")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError/reason#validation)
 */
inline val GPUPipelineErrorReason.Companion.validation: GPUPipelineErrorReason
    get() = unsafeCast("validation")
