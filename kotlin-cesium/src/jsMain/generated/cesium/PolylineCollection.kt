// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A renderable collection of polylines.
 *
 * Polylines are added and removed from the collection using [PolylineCollection.add]
 * and [PolylineCollection.remove].
 * ```
 * // Create a polyline collection with two polylines
 * const polylines = new PolylineCollection();
 * polylines.add({
 *   positions : Cartesian3.fromDegreesArray([
 *     -75.10, 39.57,
 *     -77.02, 38.53,
 *     -80.50, 35.14,
 *     -80.12, 25.46]),
 *   width : 2
 * });
 *
 * polylines.add({
 *   positions : Cartesian3.fromDegreesArray([
 *     -73.10, 37.57,
 *     -75.02, 36.53,
 *     -78.50, 33.14,
 *     -78.12, 23.46]),
 *   width : 4
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html">Online Documentation</a>
 */
external class PolylineCollection {
    /**
     * Determines if polylines in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The 4x4 transformation matrix that transforms each polyline in this collection from model to world coordinates.
     * When this is the identity matrix, the polylines are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * Returns the number of polylines in this collection.  This is commonly used with
     * [PolylineCollection.get] to iterate over all the polylines
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Creates and adds a polyline with the specified initial properties to the collection.
     * The added polyline is returned so it can be modified or removed from the collection later.
     * ```
     * // Example 1:  Add a polyline, specifying all the default values.
     * const p = polylines.add({
     *   show : true,
     *   positions : ellipsoid.cartographicArrayToCartesianArray([
     *            Cartographic.fromDegrees(-75.10, 39.57),
     *            Cartographic.fromDegrees(-77.02, 38.53)]),
     *   width : 1
     * });
     * ```
     * @param [options] A template describing the polyline's properties as shown in Example 1.
     * @return The polyline that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#add">Online Documentation</a>
     */
    fun add(options: Any? = definedExternally): Polyline

    /**
     * Removes a polyline from the collection.
     * ```
     * const p = polylines.add(...);
     * polylines.remove(p);  // Returns true
     * ```
     * @param [polyline] The polyline to remove.
     * @return `true` if the polyline was removed; `false` if the polyline was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#remove">Online Documentation</a>
     */
    fun remove(polyline: Polyline): Boolean

    /**
     * Removes all polylines from the collection.
     * ```
     * polylines.add(...);
     * polylines.add(...);
     * polylines.removeAll();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Determines if this collection contains the specified polyline.
     * @param [polyline] The polyline to check for.
     * @return true if this collection contains the polyline, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#contains">Online Documentation</a>
     */
    fun contains(polyline: Polyline): Boolean

    /**
     * Returns the polyline in the collection at the specified index.  Indices are zero-based
     * and increase as polylines are added.  Removing a polyline shifts all polylines after
     * it to the left, changing their indices.  This function is commonly used with
     * [PolylineCollection.length] to iterate over all the polylines
     * in the collection.
     * ```
     * // Toggle the show property of every polyline in the collection
     * const len = polylines.length;
     * for (let i = 0; i < len; ++i) {
     *   const p = polylines.get(i);
     *   p.show = !p.show;
     * }
     * ```
     * @param [index] The zero-based index of the polyline.
     * @return The polyline at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#get">Online Documentation</a>
     */
    operator fun get(index: Int): Polyline

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#isDestroyed">Online Documentation</a>
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
     * polylines = polylines && polylines.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PolylineCollection(
    block: PolylineCollection.() -> Unit,
): PolylineCollection =
    PolylineCollection().apply(block)
