// Automatically generated - do not modify!

package web.xr

import web.gl.WebGLRenderingContext
import kotlin.js.definedExternally

open external class XRWebGLBinding(
    session: XRSession,
    context: WebGLRenderingContext,
) {
    val nativeProjectionScaleFactor: Double
    fun createProjectionLayer(init: XRProjectionLayerInit = definedExternally): XRProjectionLayer
    fun createQuadLayer(init: XRQuadLayerInit = definedExternally): XRQuadLayer
    fun createCylinderLayer(init: XRCylinderLayerInit = definedExternally): XRCylinderLayer
    fun createEquirectLayer(init: XREquirectLayerInit = definedExternally): XREquirectLayer
    fun createCubeLayer(init: XRCubeLayerInit = definedExternally): XRCubeLayer
    fun getSubImage(
        layer: XRCompositionLayer,
        frame: XRFrame,
        eye: XREye = definedExternally,
    ): XRWebGLSubImage

    fun getViewSubImage(
        layer: XRProjectionLayer,
        view: XRView,
    ): XRWebGLSubImage

    fun getDepthInformation(view: XRView): XRWebGLDepthInformation?
}
