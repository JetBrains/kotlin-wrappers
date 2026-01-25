// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array
import web.geometry.DOMPointReadOnly
import kotlin.js.definedExternally

/**
 * A transform described by a position and orientation. When interpreting an
 * XRRigidTransform the orientation is always applied prior to the position.
 *
 * ref: https://immersive-web.github.io/webxr/#xrrigidtransform-interface
 */
open external class XRRigidTransform(
    position: DOMPointReadOnly = definedExternally,
    direction: DOMPointReadOnly = definedExternally,
) {
    val position: DOMPointReadOnly
    val orientation: DOMPointReadOnly
    val matrix: Float32Array<*>
    val inverse: XRRigidTransform
}
