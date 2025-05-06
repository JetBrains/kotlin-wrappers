// Automatically generated - do not modify!

package web.gpu

import js.serializable.Serializable
import web.errors.DOMException

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError)
 */
open external class GPUPipelineError(
    message: String,
    options: GPUPipelineErrorInit,
) : DOMException,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError/reason)
     */
    val reason: GPUPipelineErrorReason
}
