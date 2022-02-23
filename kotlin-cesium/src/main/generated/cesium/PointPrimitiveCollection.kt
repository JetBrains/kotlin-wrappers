// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A renderable collection of points.
 *
 * Points are added and removed from the collection using [PointPrimitiveCollection.add]
 * and [PointPrimitiveCollection.remove].
 * ```
 * // Create a pointPrimitive collection with two points
 * const points = scene.primitives.add(new PointPrimitiveCollection());
 * points.add({
 *   position : new Cartesian3(1.0, 2.0, 3.0),
 *   color : Color.YELLOW
 * });
 * points.add({
 *   position : new Cartesian3(4.0, 5.0, 6.0),
 *   color : Color.CYAN
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html">Online Documentation</a>
 */
external class PointPrimitiveCollection {
    /**
     * Determines if primitives in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The 4x4 transformation matrix that transforms each point in this collection from model to world coordinates.
     * When this is the identity matrix, the pointPrimitives are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * ```
     * const center = Cartesian3.fromDegrees(-75.59777, 40.03883);
     * pointPrimitives.modelMatrix = Transforms.eastNorthUpToFixedFrame(center);
     * pointPrimitives.add({
     *   color : Color.ORANGE,
     *   position : new Cartesian3(0.0, 0.0, 0.0) // center
     * });
     * pointPrimitives.add({
     *   color : Color.YELLOW,
     *   position : new Cartesian3(1000000.0, 0.0, 0.0) // east
     * });
     * pointPrimitives.add({
     *   color : Color.GREEN,
     *   position : new Cartesian3(0.0, 1000000.0, 0.0) // north
     * });
     * pointPrimitives.add({
     *   color : Color.CYAN,
     *   position : new Cartesian3(0.0, 0.0, 1000000.0) // up
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * The point blending option. The default is used for rendering both opaque and translucent points.
     * However, if either all of the points are completely opaque or all are completely translucent,
     * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
     * performance by up to 2x.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#blendOption">Online Documentation</a>
     */
    var blendOption: BlendOption

    /**
     * Returns the number of points in this collection.  This is commonly used with
     * [PointPrimitiveCollection.get] to iterate over all the points
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Creates and adds a point with the specified initial properties to the collection.
     * The added point is returned so it can be modified or removed from the collection later.
     * ```
     * // Example 1:  Add a point, specifying all the default values.
     * const p = pointPrimitives.add({
     *   show : true,
     *   position : Cartesian3.ZERO,
     *   pixelSize : 10.0,
     *   color : Color.WHITE,
     *   outlineColor : Color.TRANSPARENT,
     *   outlineWidth : 0.0,
     *   id : undefined
     * });
     * ```
     * ```
     * // Example 2:  Specify only the point's cartographic position.
     * const p = pointPrimitives.add({
     *   position : Cartesian3.fromDegrees(longitude, latitude, height)
     * });
     * ```
     * @param [options] A template describing the point's properties as shown in Example 1.
     * @return The point that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#add">Online Documentation</a>
     */
    fun add(options: Any? = definedExternally): PointPrimitive

    /**
     * Removes a point from the collection.
     * ```
     * const p = pointPrimitives.add(...);
     * pointPrimitives.remove(p);  // Returns true
     * ```
     * @param [pointPrimitive] The point to remove.
     * @return `true` if the point was removed; `false` if the point was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#remove">Online Documentation</a>
     */
    fun remove(pointPrimitive: PointPrimitive): Boolean

    /**
     * Removes all points from the collection.
     * ```
     * pointPrimitives.add(...);
     * pointPrimitives.add(...);
     * pointPrimitives.removeAll();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Check whether this collection contains a given point.
     * @param [pointPrimitive] The point to check for.
     * @return true if this collection contains the point, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#contains">Online Documentation</a>
     */
    fun contains(pointPrimitive: PointPrimitive? = definedExternally): Boolean

    /**
     * Returns the point in the collection at the specified index.  Indices are zero-based
     * and increase as points are added.  Removing a point shifts all points after
     * it to the left, changing their indices.  This function is commonly used with
     * [PointPrimitiveCollection.length] to iterate over all the points
     * in the collection.
     * ```
     * // Toggle the show property of every point in the collection
     * const len = pointPrimitives.length;
     * for (let i = 0; i < len; ++i) {
     *   const p = pointPrimitives.get(i);
     *   p.show = !p.show;
     * }
     * ```
     * @param [index] The zero-based index of the point.
     * @return The point at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): PointPrimitive

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * pointPrimitives = pointPrimitives && pointPrimitives.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PointPrimitiveCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PointPrimitiveCollection(
    block: PointPrimitiveCollection.() -> Unit,
): PointPrimitiveCollection =
    PointPrimitiveCollection().apply(block)
