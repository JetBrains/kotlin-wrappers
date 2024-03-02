// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.typedarrays.Uint32Array

sealed external interface GPUProgrammablePassEncoder {
    fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsets: ReadonlyArray<Double> = definedExternally,
    )

    fun setBindGroup(
        index: Number,
        bindGroup: GPUBindGroup,
        dynamicOffsetsData: Uint32Array,
        dynamicOffsetsDataStart: Number,
        dynamicOffsetsDataLength: Number,
    )

    fun pushDebugGroup(groupLabel: String)
    fun popDebugGroup()
    fun insertDebugMarker(markerLabel: String)
}
