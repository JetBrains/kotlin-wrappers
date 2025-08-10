// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.JsExternalInheritorsOnly
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface GPURenderCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/draw)
     */
    fun draw(
        vertexCount: GPUSize32,
        instanceCount: GPUSize32 = definedExternally,
        firstVertex: GPUSize32 = definedExternally,
        firstInstance: GPUSize32 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/drawIndexed)
     */
    fun drawIndexed(
        indexCount: GPUSize32,
        instanceCount: GPUSize32 = definedExternally,
        firstIndex: GPUSize32 = definedExternally,
        baseVertex: GPUSignedOffset32 = definedExternally,
        firstInstance: GPUSize32 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/drawIndexedIndirect)
     */
    fun drawIndexedIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/drawIndirect)
     */
    fun drawIndirect(
        indirectBuffer: GPUBuffer,
        indirectOffset: GPUSize64,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/setIndexBuffer)
     */
    fun setIndexBuffer(
        buffer: GPUBuffer,
        indexFormat: GPUIndexFormat,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/setPipeline)
     */
    fun setPipeline(pipeline: GPURenderPipeline): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPURenderBundleEncoder/setVertexBuffer)
     */
    fun setVertexBuffer(
        slot: GPUIndex32,
        buffer: GPUBuffer?,
        offset: GPUSize64 = definedExternally,
        size: GPUSize64 = definedExternally,
    ): Unit = definedExternally
}
