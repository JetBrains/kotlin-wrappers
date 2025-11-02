// Automatically generated - do not modify!

package web.gpu

import js.serialization.Serializable
import web.errors.DOMException

/**
 * The **`GPUPipelineError`** interface of the WebGPU API describes a pipeline failure. This is the value received when a Promise returned by a GPUDevice.createComputePipelineAsync() or GPUDevice.createRenderPipelineAsync() call rejects.
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
     * The **`reason`** read-only property of the GPUPipelineError interface defines the reason the pipeline creation failed in a machine-readable way.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUPipelineError/reason)
     */
    val reason: GPUPipelineErrorReason
}
