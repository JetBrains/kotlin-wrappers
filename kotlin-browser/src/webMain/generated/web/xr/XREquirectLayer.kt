// Automatically generated - do not modify!

package web.xr

import web.events.EventInstance

open external class XREquirectLayer
private constructor() :
    XRCompositionLayer {
    open var transform: XRRigidTransform
    open var radius: Float
    open var centralHorizontalAngle: Float
    open var upperVerticalAngle: Float
    open var lowerVerticalAngle: Float
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XREquirectLayer/redraw_event)
 */
inline val <C : XREquirectLayer> C.redrawEvent: EventInstance<XRLayerEvent, C, C>
    get() = EventInstance(this, "redraw")
