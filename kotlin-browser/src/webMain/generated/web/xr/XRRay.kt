// Automatically generated - do not modify!

package web.xr

import js.typedarrays.Float32Array
import web.geometry.DOMPointReadOnly

open external class XRRay(
    transformOrOrigin: XRRigidTransform = definedExternally,
    direction: DOMPointReadOnly = definedExternally,
) {
    constructor(
        transformOrOrigin: DOMPointReadOnly,
        direction: DOMPointReadOnly = definedExternally,
    )

    open val origin: DOMPointReadOnly
    open val direction: DOMPointReadOnly
    open val matrix: Float32Array<*>
}
