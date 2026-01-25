// Automatically generated - do not modify!

package web.xr

import web.events.EventInstance

open external class XRQuadLayer
private constructor() :
    XRCompositionLayer {
    var transform: XRRigidTransform
    var width: Float
    var height: Float
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XRQuadLayer/redraw_event)
 */
inline val <C : XRQuadLayer> C.redrawEvent: EventInstance<XRLayerEvent, C, C>
    get() = EventInstance(this, "redraw")
