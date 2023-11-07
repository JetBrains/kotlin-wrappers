// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Represents a point in stereographic coordinates, which can be obtained by projecting a cartesian coordinate from one pole onto a tangent plane at the other pole.
 * The stereographic projection faithfully represents the relative directions of all great circles passing through its center point.
 * To faithfully represents angles everywhere, this is a conformal projection, which means points are projected onto an arbrary sphere.
 * @param [position] The steroegraphic coordinates.
 * @param [tangentPlane] The tangent plane onto which the point was projected.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Stereographic">Online Documentation</a>
 */
external fun Stereographic(
    position: Cartesian2? = definedExternally,
    tangentPlane: EllipseGeometry? = definedExternally,
)
