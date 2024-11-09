// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array

external class GPUComputePassEncoder
private constructor() :
    GPUObjectBase,
    GPUProgrammablePassEncoder {
    override var label: String
    override fun setBindGroup(
        index: Int,
        bindGroup: GPUBindGroup,
        dynamicOffsets: ReadonlyArray<Double>,
    )

    override fun setBindGroup(
        index: Int,
        bindGroup: GPUBindGroup,
        dynamicOffsetsData: Uint32Array,
        dynamicOffsetsDataStart: Int,
        dynamicOffsetsDataLength: Int,
    )

    override fun pushDebugGroup(groupLabel: String)
    override fun popDebugGroup()
    override fun insertDebugMarker(markerLabel: String)
    fun setPipeline(pipeline: GPUComputePipeline)
    fun dispatchWorkgroups(
        x: Int,
        y: Int = definedExternally,
        z: Int = definedExternally,
    )

    fun dispatchWorkgroupsIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    fun end()
}
