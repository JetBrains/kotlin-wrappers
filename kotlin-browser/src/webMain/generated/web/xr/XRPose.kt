// Automatically generated - do not modify!

package web.xr

import web.geometry.DOMPointReadOnly

/**
 * Describes a position and orientation in space relative to an XRSpace.
 *
 * ref: https://immersive-web.github.io/webxr/#xrpose-interface
 */
external interface XRPose {
    val transform: XRRigidTransform
    val linearVelocity: DOMPointReadOnly?
    val angularVelocity: DOMPointReadOnly?
    val emulatedPosition: Boolean
}
