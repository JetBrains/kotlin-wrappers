// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder)
 */
external class GPUComputePassEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/dispatchWorkgroups)
     */
    fun dispatchWorkgroups(
        workgroupCountX: GPUSize32,
        workgroupCountY: GPUSize32 = definedExternally,
        workgroupCountZ: GPUSize32 = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/dispatchWorkgroupsIndirect)
     */
    fun dispatchWorkgroupsIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/end)
     */
    fun end()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUComputePassEncoder/setPipeline)
     */
    fun setPipeline(pipeline: GPUComputePipeline)
}
