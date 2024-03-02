// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray

sealed external interface GPURenderPassDescriptor :
    GPUObjectDescriptorBase {
    var colorAttachments: ReadonlyArray<GPURenderPassColorAttachment?>
    var depthStencilAttachment: GPURenderPassDepthStencilAttachment?
    var occlusionQuerySet: GPUQuerySet?
    var timestampWrites: GPURenderPassTimestampWrites?
}
