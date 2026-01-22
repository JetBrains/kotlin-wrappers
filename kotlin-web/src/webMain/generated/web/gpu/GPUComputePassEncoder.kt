// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * The **`GPUComputePassEncoder`** interface of the WebGPU API encodes commands related to controlling the compute shader stage, as issued by a GPUComputePipeline. It forms part of the overall encoding activity of a GPUCommandEncoder.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder)
 */
open external class GPUComputePassEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase {
    /**
     * The **`dispatchWorkgroups()`** method of the GPUComputePassEncoder interface dispatches a specific grid of workgroups to perform the work being done by the current GPUComputePipeline (i.e., set via GPUComputePassEncoder.setPipeline()).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/dispatchWorkgroups)
     */
    fun dispatchWorkgroups(
        workgroupCountX: GPUSize32,
        workgroupCountY: GPUSize32 = definedExternally,
        workgroupCountZ: GPUSize32 = definedExternally,
    )

    /**
     * The **`dispatchWorkgroupsIndirect()`** method of the GPUComputePassEncoder interface dispatches a grid of workgroups, defined by the parameters of a GPUBuffer, to perform the work being done by the current GPUComputePipeline (i.e., set via GPUComputePassEncoder.setPipeline()).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/dispatchWorkgroupsIndirect)
     */
    fun dispatchWorkgroupsIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    /**
     * The **`end()`** method of the GPUComputePassEncoder interface completes recording of the current compute pass command sequence.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/end)
     */
    fun end()

    /**
     * The **`setPipeline()`** method of the GPUComputePassEncoder interface sets the GPUComputePipeline to use for this compute pass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/setPipeline)
     */
    fun setPipeline(pipeline: GPUComputePipeline)
}
