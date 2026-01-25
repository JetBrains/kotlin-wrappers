// Automatically generated - do not modify!

package web.xr

import web.html.HTMLVideoElement
import kotlin.js.definedExternally

open external class XRMediaBinding(
    sesion: XRSession,
) {
    fun createQuadLayer(
        video: HTMLVideoElement,
        init: XRMediaQuadLayerInit = definedExternally,
    ): XRQuadLayer

    fun createCylinderLayer(
        video: HTMLVideoElement,
        init: XRMediaCylinderLayerInit = definedExternally,
    ): XRCylinderLayer

    fun createEquirectLayer(
        video: HTMLVideoElement,
        init: XRMediaEquirectLayerInit = definedExternally,
    ): XREquirectLayer
}
