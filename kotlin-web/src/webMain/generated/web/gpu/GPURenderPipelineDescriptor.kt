// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#descriptor)
 */
@JsPlainObject
external interface GPURenderPipelineDescriptor :
    GPUPipelineDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#depthStencil)
     */
    var depthStencil: GPUDepthStencilState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#fragment)
     */
    var fragment: GPUFragmentState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#multisample)
     */
    var multisample: GPUMultisampleState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#primitive)
     */
    var primitive: GPUPrimitiveState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline#vertex)
     */
    var vertex: GPUVertexState
}
