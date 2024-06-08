// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Specifies a set of clipping polygons. Clipping polygons selectively disable rendering in a region
 * inside or outside the specified list of [ClippingPolygon] objects for a single glTF model, 3D Tileset, or the globe.
 *
 * Clipping Polygons are only supported in WebGL 2 contexts.
 * ```
 * const positions = Cartesian3.fromRadiansArray([
 *     -1.3194369277314022,
 *     0.6988062530900625,
 *     -1.31941,
 *     0.69879,
 *     -1.3193955980204217,
 *     0.6988091578771254,
 *     -1.3193931220959367,
 *     0.698743632490865,
 *     -1.3194358224045408,
 *     0.6987471965556998,
 * ]);
 *
 * const polygon = new ClippingPolygon({
 *     positions: positions
 * });
 *
 * const polygons = new ClippingPolygonCollection({
 *    polygons: [ polygon ]
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html">Online Documentation</a>
 */
external class ClippingPolygonCollection(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [polygons] An array of [ClippingPolygon] objects used to selectively disable rendering on the inside of each polygon.
     *   Default value - `[]`
     * @property [enabled] Determines whether the clipping polygons are active.
     *   Default value - `true`
     * @property [inverse] If true, a region will be clipped if it is outside of every polygon in the collection. Otherwise, a region will only be clipped if it is on the inside of any polygon.
     *   Default value - `false`
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var polygons: ReadonlyArray<ClippingPolygon>?
        var enabled: Boolean?
        var inverse: Boolean?
    }

    /**
     * An event triggered when a new clipping polygon is added to the collection.  Event handlers
     * are passed the new polygon and the index at which it was added.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#polygonAdded">Online Documentation</a>
     */
    var polygonAdded: DefaultEvent

    /**
     * An event triggered when a new clipping polygon is removed from the collection.  Event handlers
     * are passed the new polygon and the index from which it was removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#polygonRemoved">Online Documentation</a>
     */
    var polygonRemoved: DefaultEvent

    /**
     * Returns the number of polygons in this collection.  This is commonly used with
     * [ClippingPolygonCollection.get] to iterate over all the polygons
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Adds the specified [ClippingPolygon] to the collection to be used to selectively disable rendering
     * on the inside of each polygon. Use [ClippingPolygonCollection.unionClippingRegions] to modify
     * how modify the clipping behavior of multiple polygons.
     * ```
     * const polygons = new ClippingPolygonCollection();
     *
     * const positions = Cartesian3.fromRadiansArray([
     *     -1.3194369277314022,
     *     0.6988062530900625,
     *     -1.31941,
     *     0.69879,
     *     -1.3193955980204217,
     *     0.6988091578771254,
     *     -1.3193931220959367,
     *     0.698743632490865,
     *     -1.3194358224045408,
     *     0.6987471965556998,
     * ]);
     *
     * polygons.add(new ClippingPolygon({
     *     positions: positions
     * }));
     * ```
     * @param [polygon] The ClippingPolygon to add to the collection.
     * @return The added ClippingPolygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#add">Online Documentation</a>
     */
    fun add(polygon: ClippingPolygon): ClippingPolygon

    /**
     * Returns the clipping polygon in the collection at the specified index.  Indices are zero-based
     * and increase as polygons are added.  Removing a polygon polygon all polygons after
     * it to the left, changing their indices.  This function is commonly used with
     * [ClippingPolygonCollection.length] to iterate over all the polygons
     * in the collection.
     * @param [index] The zero-based index of the polygon.
     * @return The ClippingPolygon at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#get">Online Documentation</a>
     */
    operator fun get(index: Int): ClippingPolygon

    /**
     * Checks whether this collection contains a ClippingPolygon equal to the given ClippingPolygon.
     * @param [polygon] The ClippingPolygon to check for.
     * @return true if this collection contains the ClippingPolygon, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#contains">Online Documentation</a>
     */
    fun contains(polygon: ClippingPolygon): Boolean

    /**
     * Removes the first occurrence of the given ClippingPolygon from the collection.
     * @return `true` if the polygon was removed; `false` if the polygon was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#remove">Online Documentation</a>
     */
    fun remove(polygon: ClippingPolygon): Boolean

    /**
     * Removes all polygons from the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#isDestroyed">Online Documentation</a>
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
     * clippingPolygons = clippingPolygons && clippingPolygons.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Function for checking if the context will allow clipping polygons, which require floating point textures.
         * @param [scene] The scene that will contain clipped objects and clipping textures.
         * @return `true` if the context supports clipping polygons.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPolygonCollection.html#.isSupported">Online Documentation</a>
         */
        fun isSupported(scene: Any /* Scene | any */): Boolean
    }
}
