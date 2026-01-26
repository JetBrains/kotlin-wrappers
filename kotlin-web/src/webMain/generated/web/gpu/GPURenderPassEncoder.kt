// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray

/**
 * The **`GPURenderPassEncoder`** interface of the WebGPU API encodes commands related to controlling the vertex and fragment shader stages, as issued by a GPURenderPipeline. It forms part of the overall encoding activity of a GPUCommandEncoder.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder)
 */
open external class GPURenderPassEncoder
private constructor() :
    GPUBindingCommandsMixin,
    GPUDebugCommandsMixin,
    GPUObjectBase,
    GPURenderCommandsMixin {
    /**
     * The **`beginOcclusionQuery()`** method of the GPURenderPassEncoder interface begins an occlusion query at the specified index of the relevant GPUQuerySet (provided as the value of the occlusionQuerySet descriptor property when invoking GPUCommandEncoder.beginRenderPass() to run the render pass).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/beginOcclusionQuery)
     */
    fun beginOcclusionQuery(queryIndex: GPUSize32)

    /**
     * The **`end()`** method of the GPURenderPassEncoder interface completes recording of the current render pass command sequence.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/end)
     */
    fun end()

    /**
     * The **`endOcclusionQuery()`** method of the GPURenderPassEncoder interface ends an active occlusion query previously started with beginOcclusionQuery().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/endOcclusionQuery)
     */
    fun endOcclusionQuery()

    /**
     * The **`executeBundles()`** method of the GPURenderPassEncoder interface executes commands previously recorded into the referenced GPURenderBundles, as part of this render pass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/executeBundles)
     */
    fun executeBundles(bundles: ReadonlyArray<GPURenderBundle>)

    /**
     * The **`setBlendConstant()`** method of the GPURenderPassEncoder interface sets the constant blend color and alpha values used with "constant" and "one-minus-constant" blend factors (as set in the descriptor of the GPUDevice.createRenderPipeline() method, in the blend property).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setBlendConstant)
     */
    fun setBlendConstant(color: GPUColor)

    /**
     * The **`setScissorRect()`** method of the GPURenderPassEncoder interface sets the scissor rectangle used during the rasterization stage. After transformation into viewport coordinates any fragments that fall outside the scissor rectangle will be discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setScissorRect)
     */
    fun setScissorRect(
        x: GPUIntegerCoordinate,
        y: GPUIntegerCoordinate,
        width: GPUIntegerCoordinate,
        height: GPUIntegerCoordinate,
    )

    /**
     * The **`setStencilReference()`** method of the GPURenderPassEncoder interface sets the stencil reference value using during stencil tests with the "replace" stencil operation (as set in the descriptor of the GPUDevice.createRenderPipeline() method, in the properties defining the various stencil operations).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderPassEncoder/setStencilReference)
     */
    fun setStencilReference(reference: GPUStencilValue)

    /**
     * The **`setViewport()`** method of the GPURenderPassEncoder interface sets the viewport used during the rasterization stage to linearly map from normalized device coordinates to viewport coordinates.
     *
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
