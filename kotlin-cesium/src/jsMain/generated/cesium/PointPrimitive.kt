// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * <div class="notice">
 * A point is created and its initial properties are set by calling [PointPrimitiveCollection.add]. Do not call the constructor directly.
 * </div>
 * A graphical point positioned in the 3D scene, that is created
 * and rendered using a [PointPrimitiveCollection].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html">Online Documentation</a>
 */
sealed external class PointPrimitive {
    /**
     * Determines if this point will be shown.  Use this to hide or show a point, instead
     * of removing it and re-adding it to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the Cartesian position of this point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * Gets or sets near and far scaling properties of a point based on the point's distance from the camera.
     * A point's scale will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the point's scale remains clamped to the nearest bound.  This scale
     * multiplies the pixelSize and outlineWidth to affect the total size of the point.  If undefined,
     * scaleByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a pointPrimitive's scaleByDistance to scale to 15 when the
     * // camera is 1500 meters from the pointPrimitive and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * p.scaleByDistance = new NearFarScalar(1.5e2, 15, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable scaling by distance
     * p.scaleByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#scaleByDistance">Online Documentation</a>
     */
    var scaleByDistance: NearFarScalar

    /**
     * Gets or sets near and far translucency properties of a point based on the point's distance from the camera.
     * A point's translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the point's translucency remains clamped to the nearest bound.  If undefined,
     * translucencyByDistance will be disabled.
     * ```
     * // Example 1.
     * // Set a point's translucency to 1.0 when the
     * // camera is 1500 meters from the point and disappear as
     * // the camera distance approaches 8.0e6 meters.
     * p.translucencyByDistance = new NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
     * ```
     * ```
     * // Example 2.
     * // disable translucency by distance
     * p.translucencyByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#translucencyByDistance">Online Documentation</a>
     */
    var translucencyByDistance: NearFarScalar

    /**
     * Gets or sets the inner size of the point in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#pixelSize">Online Documentation</a>
     */
    var pixelSize: Double

    /**
     * Gets or sets the inner color of the point.
     * The red, green, blue, and alpha values are indicated by `value`'s `red`, `green`,
     * `blue`, and `alpha` properties as shown in Example 1.  These components range from `0.0`
     * (no intensity) to `1.0` (full intensity).
     * ```
     * // Example 1. Assign yellow.
     * p.color = Color.YELLOW;
     * ```
     * ```
     * // Example 2. Make a pointPrimitive 50% translucent.
     * p.color = new Color(1.0, 1.0, 1.0, 0.5);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Gets or sets the outline color of the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#outlineColor">Online Documentation</a>
     */
    var outlineColor: Color

    /**
     * Gets or sets the outline width in pixels.  This width adds to pixelSize,
     * increasing the total size of the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#outlineWidth">Online Documentation</a>
     */
    var outlineWidth: Double

    /**
     * Gets or sets the condition specifying at what distance from the camera that this point will be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#distanceDisplayCondition">Online Documentation</a>
     */
    var distanceDisplayCondition: DistanceDisplayCondition

    /**
     * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
     * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#disableDepthTestDistance">Online Documentation</a>
     */
    var disableDepthTestDistance: Double

    /**
     * Gets or sets the user-defined value returned when the point is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Computes the screen-space position of the point's origin.
     * The screen space origin is the top, left corner of the canvas; `x` increases from
     * left to right, and `y` increases from top to bottom.
     * ```
     * console.log(p.computeScreenSpacePosition(scene).toString());
     * ```
     * @param [scene] The scene.
     * @param [result] The object onto which to store the result.
     * @return The screen-space position of the point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitive.html#computeScreenSpacePosition">Online Documentation</a>
     */
    fun computeScreenSpacePosition(
        scene: Scene,
        result: Cartesian2? = definedExternally,
    ): Cartesian2
}
