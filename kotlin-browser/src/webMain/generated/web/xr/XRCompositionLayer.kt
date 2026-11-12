// Automatically generated - do not modify!

package web.xr

import web.events.EventHandler

open external class XRCompositionLayer
private constructor() :
    XRLayer {
    open val layout: XRLayerLayout
    open var blendTextureSourceAlpha: Boolean
    open var chromaticAberrationCorrection: Boolean?
    open val mipLevels: Int
    open var quality: XRLayerQuality
    open val needsRedraw: Boolean
    open fun destroy()
    open var space: XRSpace
    open var onredraw: EventHandler<XRLayerEvent, *, *>
}
