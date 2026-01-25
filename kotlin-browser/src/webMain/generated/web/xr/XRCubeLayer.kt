// Automatically generated - do not modify!

package web.xr

import web.events.EventInstance
import web.geometry.DOMPointReadOnly

open external class XRCubeLayer
private constructor() :
    XRCompositionLayer {
    var orientation: DOMPointReadOnly
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XRCubeLayer/redraw_event)
 */
inline val <C : XRCubeLayer> C.redrawEvent: EventInstance<XRLayerEvent, C, C>
    get() = EventInstance(this, "redraw")
