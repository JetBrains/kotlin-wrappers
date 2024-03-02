// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array

sealed external class GPUComputePassEncoder :
    GPUObjectBase,
    GPUProgrammablePassEncoder {
    override var label: String
    override fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsets: ReadonlyArray<Double>,
    )

    override fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsetsData: Uint32Array,
        dynamicOffsetsDataStart: Number,
        dynamicOffsetsDataLength: Number,
    )

    override fun pushDebugGroup(groupLabel: String)
    override fun popDebugGroup()
    override fun insertDebugMarker(markerLabel: String)
    fun setPipeline(pipeline: GPUComputePipeline)
    fun dispatchWorkgroups(
        x: Number,
        y: Number = definedExternally,
        z: Number = definedExternally,
    )

    fun dispatchWorkgroupsIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    )

    fun end()
}
