// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A renderable polyline. Create this by calling [PolylineCollection.add]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html">Online Documentation</a>
 *
 * @constructor
 * @param [polylineCollection] The renderable polyline collection.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html">Online Documentation</a>
 */
external class Polyline(
    options: ConstructorOptions,
    polylineCollection: PolylineCollection,
) {
    /**
     * @property [show] `true` if this polyline will be shown; otherwise, `false`.
     *   Default value - `true`
     * @property [width] The width of the polyline in pixels.
     *   Default value - `1.0`
     * @property [loop] Whether a line segment will be added between the last and first line positions to make this line a loop.
     *   Default value - `false`
     * @property [material] The material.
     *   Default value - [Material.ColorType]
     * @property [positions] The positions.
     * @property [id] The user-defined object to be returned when this polyline is picked.
     * @property [distanceDisplayCondition] The condition specifying at what distance from the camera that this polyline will be displayed.
     */
    interface ConstructorOptions {
        var show: Boolean?
        var width: Double?
        var loop: Boolean?
        var material: Material?
        var positions: Array<out Cartesian3>?
        var id: Any?
        var distanceDisplayCondition: DistanceDisplayCondition?
    }

    /**
     * Determines if this polyline will be shown.  Use this to hide or show a polyline, instead
     * of removing it and re-adding it to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the positions of the polyline.
     * ```
     * polyline.positions = Cartesian3.fromDegreesArray([
     *     0.0, 0.0,
     *     10.0, 0.0,
     *     0.0, 20.0
     * ]);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#positions">Online Documentation</a>
     */
    var positions: Array<out Cartesian3>

    /**
     * Gets or sets the surface appearance of the polyline.  This can be one of several built-in [Material] objects or a custom material, scripted with
     * [Fabric](https://github.com/CesiumGS/cesium/wiki/Fabric).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#material">Online Documentation</a>
     */
    var material: Material

    /**
     * Gets or sets the width of the polyline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#width">Online Documentation</a>
     */
    var width: Double

    /**
     * Gets or sets whether a line segment will be added between the first and last polyline positions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#loop">Online Documentation</a>
     */
    var loop: Boolean

    /**
     * Gets or sets the user-defined value returned when the polyline is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Gets or sets the condition specifying at what distance from the camera that this polyline will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition
}
