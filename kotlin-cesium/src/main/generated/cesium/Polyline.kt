// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray

/**
 * <div class="notice">
 * Create this by calling [PolylineCollection.add]. Do not call the constructor directly.
 * </div>
 *
 * A renderable polyline.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Polyline.html">Online Documentation</a>
 */
sealed external class Polyline {
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
    var positions: ReadonlyArray<Cartesian3>

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
