// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#descriptor)
 */
@JsPlainObject
external interface GPURenderPassDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#colorattachments)
     */
    var colorAttachments: ReadonlyArray<GPURenderPassColorAttachment?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#depthstencilattachment)
     */
    var depthStencilAttachment: GPURenderPassDepthStencilAttachment?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#maxdrawcount)
     */
    var maxDrawCount: GPUSize64?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#occlusionqueryset)
     */
    var occlusionQuerySet: GPUQuerySet?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/beginRenderPass#timestampwrites)
     */
    var timestampWrites: GPURenderPassTimestampWrites?
}
