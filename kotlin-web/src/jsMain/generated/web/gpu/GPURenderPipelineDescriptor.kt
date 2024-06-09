// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface GPURenderPipelineDescriptor :
    GPUPipelineDescriptorBase {
    var vertex: GPUVertexState
    var primitive: GPUPrimitiveState?
    var depthStencil: GPUDepthStencilState?
    var multisample: GPUMultisampleState?
    var fragment: GPUFragmentState?
}
