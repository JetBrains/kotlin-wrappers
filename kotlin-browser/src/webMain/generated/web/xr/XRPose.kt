// Automatically generated - do not modify!

package web.xr

import web.geometry.DOMPointReadOnly

/**
 * Describes a position and orientation in space relative to an XRSpace.
 *
 * ref: https://immersive-web.github.io/webxr/#xrpose-interface
 */
open external class XRPose
private constructor() {
    open val transform: XRRigidTransform
    open val linearVelocity: DOMPointReadOnly?
    open val angularVelocity: DOMPointReadOnly?
    open val emulatedPosition: Boolean
}
