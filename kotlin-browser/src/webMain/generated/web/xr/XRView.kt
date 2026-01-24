// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array

/**
 * Describes a single view into an XR scene for a given frame.
 *
 * ref: https://immersive-web.github.io/webxr/#xrview-interface
 */
external interface XRView {
    val eye: XREye
    val projectionMatrix: Float32Array<*>
    val transform: XRRigidTransform
    val recommendedViewportScale: Double?
    fun requestViewportScale(scale: Double)
}
