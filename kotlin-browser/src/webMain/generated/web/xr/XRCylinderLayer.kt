// Automatically generated - do not modify!

package web.xr

import web.events.EventInstance

open external class XRCylinderLayer
private constructor() :
    XRCompositionLayer {
    open var transform: XRRigidTransform
    open var radius: Float
    open var centralAngle: Float
    open var aspectRatio: Float
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XRCylinderLayer/redraw_event)
 */
inline val <C : XRCylinderLayer> C.redrawEvent: EventInstance<XRLayerEvent, C, C>
    get() = EventInstance(this, "redraw")
