// Automatically generated - do not modify!

package web.xr

import web.errors.DOMExceptionType.InvalidStateError
import web.errors.DOMExceptionType.NotSupportedError
import web.errors.JsThrows
import web.gl.WebGLRenderingContext

open external class XRWebGLBinding(
    session: XRSession,
    context: WebGLRenderingContext,
) {
    open val nativeProjectionScaleFactor: Double
    open fun createProjectionLayer(init: XRProjectionLayerInit = definedExternally): XRProjectionLayer
    open fun createQuadLayer(init: XRQuadLayerInit = definedExternally): XRQuadLayer
    open fun createCylinderLayer(init: XRCylinderLayerInit = definedExternally): XRCylinderLayer
    open fun createEquirectLayer(init: XREquirectLayerInit = definedExternally): XREquirectLayer
    open fun createCubeLayer(init: XRCubeLayerInit = definedExternally): XRCubeLayer
    open fun getSubImage(
        layer: XRCompositionLayer,
        frame: XRFrame,
        eye: XREye = definedExternally,
    ): XRWebGLSubImage

    open fun getViewSubImage(
        layer: XRProjectionLayer,
        view: XRView,
    ): XRWebGLSubImage

    @JsThrows(InvalidStateError::class)
    @JsThrows(NotSupportedError::class)
    open fun getDepthInformation(view: XRView): XRWebGLDepthInformation?
}
