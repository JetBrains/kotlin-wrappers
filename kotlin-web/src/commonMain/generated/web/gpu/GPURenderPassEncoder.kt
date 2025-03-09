// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder)
 */
external class GPURenderPassEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase,
    GPURenderCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/beginOcclusionQuery)
     */
    fun beginOcclusionQuery(queryIndex: GPUSize32)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/end)
     */
    fun end()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/endOcclusionQuery)
     */
    fun endOcclusionQuery()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/executeBundles)
     */
    fun executeBundles(bundles: ReadonlyArray<GPURenderBundle>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setBlendConstant)
     */
    fun setBlendConstant(color: GPUColor)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setScissorRect)
     */
    fun setScissorRect(
        x: GPUIntegerCoordinate,
        y: GPUIntegerCoordinate,
        width: GPUIntegerCoordinate,
        height: GPUIntegerCoordinate,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setStencilReference)
     */
    fun setStencilReference(reference: GPUStencilValue)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setViewport)
     */
    fun setViewport(
        x: GPUIntegerCoordinate,
        y: GPUIntegerCoordinate,
        width: GPUIntegerCoordinate,
        height: GPUIntegerCoordinate,
        minDepth: Float,
        maxDepth: Float,
    )
}
