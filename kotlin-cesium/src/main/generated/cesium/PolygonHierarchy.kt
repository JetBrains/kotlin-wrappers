// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * An hierarchy of linear rings which define a polygon and its holes.
 * The holes themselves may also have holes which nest inner polygons.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonHierarchy.html">Online Documentation</a>
 *
 * @constructor
 * @property [positions] A linear ring defining the outer boundary of the polygon or hole.
 * @property [holes] An array of polygon hierarchies defining holes in the polygon.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolygonHierarchy.html">Online Documentation</a>
 */
external class PolygonHierarchy(
    var positions: Array<out Cartesian3> = definedExternally,
    var holes: Array<out PolygonHierarchy> = definedExternally,
)
