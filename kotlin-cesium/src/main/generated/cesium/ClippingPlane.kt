// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A Plane in Hessian Normal form to be used with [ClippingPlaneCollection].
 * Compatible with mathematics functions in [Plane]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlane.html">Online Documentation</a>
 *
 * @constructor
 * @property [normal] The plane's normal (normalized).
 * @property [distance] The shortest distance from the origin to the plane.  The sign of
 *   `distance` determines which side of the plane the origin
 *   is on.  If `distance` is positive, the origin is in the half-space
 *   in the direction of the normal; if negative, the origin is in the half-space
 *   opposite to the normal; if zero, the plane passes through the origin.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlane.html">Online Documentation</a>
 */
external class ClippingPlane(
    var normal: Cartesian3,
    var distance: Double,
) {


    companion object {
        /**
         * Create a ClippingPlane from a Plane object.
         * @param [plane] The plane containing parameters to copy
         * @param [result] The object on which to store the result
         * @return The ClippingPlane generated from the plane's parameters.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlane.html#.fromPlane">Online Documentation</a>
         */
        fun fromPlane(
            plane: Plane,
            result: ClippingPlane? = definedExternally,
        ): ClippingPlane

        /**
         * Clones the ClippingPlane without setting its ownership.
         * @param [clippingPlane] The ClippingPlane to be cloned
         * @param [result] The object on which to store the cloned parameters.
         * @return a clone of the input ClippingPlane
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlane.html#.clone">Online Documentation</a>
         */
        fun clone(
            clippingPlane: ClippingPlane,
            result: ClippingPlane? = definedExternally,
        ): ClippingPlane
    }
}
