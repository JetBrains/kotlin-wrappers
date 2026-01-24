// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray
import web.geometry.DOMPointReadOnly

/**
 * Extends XRReferenceSpace to include boundsGeometry, indicating the pre-configured boundaries
 * of the user's space.
 *
 * ref: https://immersive-web.github.io/webxr/#xrboundedreferencespace-interface
 */
open external class XRBoundedReferenceSpace
private constructor() :
    XRReferenceSpace {
    val boundsGeometry: ReadonlyArray<DOMPointReadOnly>
}
