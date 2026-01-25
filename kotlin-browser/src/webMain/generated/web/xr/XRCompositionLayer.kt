// Automatically generated - do not modify!

package web.xr

import web.events.EventHandler

open external class XRCompositionLayer
private constructor() :
    XRLayer {
    val layout: XRLayerLayout
    var blendTextureSourceAlpha: Boolean
    var chromaticAberrationCorrection: Boolean?
    val mipLevels: Int
    var quality: XRLayerQuality
    val needsRedraw: Boolean
    fun destroy()
    var space: XRSpace
    var onredraw: EventHandler<XRLayerEvent, *, *>
}
