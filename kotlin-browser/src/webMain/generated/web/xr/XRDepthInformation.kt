// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array

external interface XRDepthInformation {
    val width: Int
    val height: Int
    val normDepthBufferFromNormView: XRRigidTransform
    val rawValueToMeters: Float
    val transform: XRRigidTransform?
    val projectionMatrix: Float32Array<*>?
}
