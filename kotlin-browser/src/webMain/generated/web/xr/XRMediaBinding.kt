// Automatically generated - do not modify!

package web.xr

import web.html.HTMLVideoElement

open external class XRMediaBinding(
    sesion: XRSession,
) {
    open fun createQuadLayer(
        video: HTMLVideoElement,
        init: XRMediaQuadLayerInit = definedExternally,
    ): XRQuadLayer

    open fun createCylinderLayer(
        video: HTMLVideoElement,
        init: XRMediaCylinderLayerInit = definedExternally,
    ): XRCylinderLayer

    open fun createEquirectLayer(
        video: HTMLVideoElement,
        init: XRMediaEquirectLayerInit = definedExternally,
    ): XREquirectLayer
}
