// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPURenderPassDescriptor :
    GPUObjectDescriptorBase {
    val colorAttachments: ReadonlyArray<GPURenderPassColorAttachment?>
    val depthStencilAttachment: GPURenderPassDepthStencilAttachment?
    val occlusionQuerySet: GPUQuerySet?
    val timestampWrites: GPURenderPassTimestampWrites?
}
