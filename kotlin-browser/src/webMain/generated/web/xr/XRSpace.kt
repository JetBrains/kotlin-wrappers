// Automatically generated - do not modify!

package web.xr

import web.events.EventTarget

/**
 * Represents a virtual coordinate system with an origin that corresponds to a physical location.
 * Spatial data that is requested from the API or given to the API is always expressed in relation
 * to a specific XRSpace at the time of a specific XRFrame. Numeric values such as pose positions
 * are coordinates in that space relative to its origin. The interface is intentionally opaque.
 *
 * ref: https://immersive-web.github.io/webxr/#xrspace-interface
 */
open external class XRSpace
private constructor() :
    EventTarget
