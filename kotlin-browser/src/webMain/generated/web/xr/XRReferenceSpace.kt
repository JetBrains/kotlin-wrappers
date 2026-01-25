// Automatically generated - do not modify!

package web.xr

import web.events.EventHandler
import web.events.EventInstance

/**
 * One of several common XRSpaces that applications can use to establish a spatial relationship
 * with the user's physical environment.
 *
 * ref: https://immersive-web.github.io/webxr/#xrreferencespace-interface
 */
open external class XRReferenceSpace
private constructor() :
    XRSpace {
    fun getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace
    var onreset: EventHandler<XRReferenceSpaceEvent, *, *>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XRReferenceSpace/reset_event)
 */
inline val <C : XRReferenceSpace> C.resetEvent: EventInstance<XRReferenceSpaceEvent, C, C>
    get() = EventInstance(this, "reset")
