// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array
import web.geometry.DOMPointReadOnly
import kotlin.js.definedExternally

open external class XRRay(
    transformOrOrigin: XRRigidTransform = definedExternally,
    direction: DOMPointReadOnly = definedExternally,
) {
    constructor(
        transformOrOrigin: DOMPointReadOnly,
        direction: DOMPointReadOnly = definedExternally,
    )

    val origin: DOMPointReadOnly
    val direction: DOMPointReadOnly
    val matrix: Float32Array<*>
}
