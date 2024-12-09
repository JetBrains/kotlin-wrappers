// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface GPURenderPassDescriptor :
    GPUObjectDescriptorBase {
    val colorAttachments: ReadonlyArray<GPURenderPassColorAttachment?>
    val depthStencilAttachment: GPURenderPassDepthStencilAttachment?
    val maxDrawCount: GPUSize64?
    val occlusionQuerySet: GPUQuerySet?
    val timestampWrites: GPURenderPassTimestampWrites?
}
