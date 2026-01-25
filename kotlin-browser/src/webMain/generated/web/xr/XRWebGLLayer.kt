// Automatically generated - do not modify!

package web.xr

import web.gl.WebGL2RenderingContext
import web.gl.WebGLFramebuffer
import web.gl.WebGLRenderingContext
import kotlin.js.definedExternally

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

    val antialias: Boolean
    val ignoreDepthValues: Boolean
    var fixedFoveation: Float?
    val framebuffer: WebGLFramebuffer
    val framebufferWidth: Int
    val framebufferHeight: Int
    fun getViewport(view: XRView): XRViewport?
}
