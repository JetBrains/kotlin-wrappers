// Automatically generated - do not modify!

package web.xr

import web.errors.DOMExceptionType.InvalidStateError
import web.errors.JsThrows
import web.gl.WebGL2RenderingContext
import web.gl.WebGLFramebuffer
import web.gl.WebGLRenderingContext

/**
 * A layer which provides a WebGL framebuffer to render into, enabling hardware accelerated
 * rendering of 3D graphics to be presented on the XR device. *
 * ref: https://immersive-web.github.io/webxr/#xrwebgllayer-interface
 */
open external class XRWebGLLayer(
    session: XRSession,
    context: WebGLRenderingContext,
    layerInit: XRWebGLLayerInit = definedExternally,
) : XRLayer {
    constructor(
        session: XRSession,
        context: WebGL2RenderingContext,
        layerInit: XRWebGLLayerInit = definedExternally,
    )

    open val antialias: Boolean
    open val ignoreDepthValues: Boolean
    open var fixedFoveation: Float?
    open val framebuffer: WebGLFramebuffer
    open val framebufferWidth: Int
    open val framebufferHeight: Int

    @JsThrows(InvalidStateError::class)
    open fun getViewport(view: XRView): XRViewport?
}
