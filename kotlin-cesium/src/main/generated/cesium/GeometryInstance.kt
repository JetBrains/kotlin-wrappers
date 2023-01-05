// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * Geometry instancing allows one [Geometry] object to be positions in several
 * different locations and colored uniquely.  For example, one [BoxGeometry] can
 * be instanced several times, each with a different `modelMatrix` to change
 * its position, rotation, and scale.
 * ```
 * // Create geometry for a box, and two instances that refer to it.
 * // One instance positions the box on the bottom and colored aqua.
 * // The other instance positions the box on the top and color white.
 * const geometry = BoxGeometry.fromDimensions({
 *   vertexFormat : VertexFormat.POSITION_AND_NORMAL,
 *   dimensions : new Cartesian3(1000000.0, 1000000.0, 500000.0)
 * });
 * const instanceBottom = new GeometryInstance({
 *   geometry : geometry,
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(-75.59777, 40.03883)), new Cartesian3(0.0, 0.0, 1000000.0), new Matrix4()),
 *   attributes : {
 *     color : ColorGeometryInstanceAttribute.fromColor(Color.AQUA)
 *   },
 *   id : 'bottom'
 * });
 * const instanceTop = new GeometryInstance({
 *   geometry : geometry,
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(-75.59777, 40.03883)), new Cartesian3(0.0, 0.0, 3000000.0), new Matrix4()),
 *   attributes : {
 *     color : ColorGeometryInstanceAttribute.fromColor(Color.AQUA)
 *   },
 *   id : 'top'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstance.html">Online Documentation</a>
 */
external class GeometryInstance(options: ConstructorOptions) {
    /**
     * @property [geometry] The geometry to instance.
     * @property [modelMatrix] The model matrix that transforms to transform the geometry from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [id] A user-defined object to return when the instance is picked with [Scene.pick] or get/set per-instance attributes with [Primitive.getGeometryInstanceAttributes].
     * @property [attributes] Per-instance attributes like a show or color attribute shown in the example below.
     */
    interface ConstructorOptions {
        var geometry: dynamic
        var modelMatrix: Matrix4?
        var id: Any?
        var attributes: Any?
    }

    /**
     * The geometry being instanced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstance.html#geometry">Online Documentation</a>
     */
    var geometry: Geometry

    /**
     * The 4x4 transformation matrix that transforms the geometry from model to world coordinates.
     * When this is the identity matrix, the geometry is drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstance.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * User-defined object returned when the instance is picked or used to get/set per-instance attributes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstance.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Per-instance attributes like [ColorGeometryInstanceAttribute] or [ShowGeometryInstanceAttribute].
     * [Geometry] attributes varying per vertex; these attributes are constant for the entire instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryInstance.html#attributes">Online Documentation</a>
     */
    var attributes: Any
}

inline fun GeometryInstance(
    block: GeometryInstance.ConstructorOptions.() -> Unit,
): GeometryInstance =
    GeometryInstance(options = jso(block))
