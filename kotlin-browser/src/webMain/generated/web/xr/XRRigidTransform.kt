// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array
import web.geometry.DOMPointReadOnly

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
    open val position: DOMPointReadOnly
    open val orientation: DOMPointReadOnly
    open val matrix: Float32Array<*>
    open val inverse: XRRigidTransform
}
