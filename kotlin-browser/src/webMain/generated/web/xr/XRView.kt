// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array

/**
 * Describes a single view into an XR scene for a given frame.
 *
 * ref: https://immersive-web.github.io/webxr/#xrview-interface
 */
open external class XRView
private constructor() {
    open val eye: XREye
    open val projectionMatrix: Float32Array<*>
    open val transform: XRRigidTransform
    open val recommendedViewportScale: Double?
    open fun requestViewportScale(scale: Double)
}
