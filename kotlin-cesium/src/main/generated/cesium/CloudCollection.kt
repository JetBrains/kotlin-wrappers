// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A renderable collection of clouds in the 3D scene.
 *
 * Clouds are added and removed from the collection using [CloudCollection.add]
 * and [CloudCollection.remove].
 * ```
 * // Create a cloud collection with two cumulus clouds
 * const clouds = scene.primitives.add(new CloudCollection());
 * clouds.add({
 *   position : new Cartesian3(1.0, 2.0, 3.0),
 *   maximumSize: new Cartesian3(20.0, 12.0, 8.0)
 * });
 * clouds.add({
 *   position : new Cartesian3(4.0, 5.0, 6.0),
 *   maximumSize: new Cartesian3(15.0, 9.0, 9.0),
 *   slice: 0.5
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html">Online Documentation</a>
 */
external class CloudCollection {
    /**
     * Controls the amount of detail captured in the precomputed noise texture
     * used to render the cumulus clouds. In order for the texture to be tileable,
     * this must be a power of two. For best results, set this to be a power of two
     * between `8.0` and `32.0` (inclusive).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#noiseDetail">Online Documentation</a>
     */
    var noiseDetail: Double

    /**
     * Applies a translation to noise texture coordinates to generate different data.
     * This can be modified if the default noise does not generate good-looking clouds.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#noiseOffset">Online Documentation</a>
     */
    var noiseOffset: Cartesian3

    /**
     * Determines if billboards in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Renders the billboards with one opaque color for the sake of debugging.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#debugBillboards">Online Documentation</a>
     */
    var debugBillboards: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the clouds as opaque, monochrome ellipsoids for the sake of debugging.
     * If `debugBillboards` is also true, then the ellipsoids will draw on top of the billboards.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#debugEllipsoids">Online Documentation</a>
     */
    var debugEllipsoids: Boolean

    /**
     * Returns the number of clouds in this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Creates and adds a cloud with the specified initial properties to the collection.
     * The added cloud is returned so it can be modified or removed from the collection later.
     * ```
     * // Example 1:  Add a cumulus cloud, specifying all the default values.
     * const c = clouds.add({
     *   show : true,
     *   position : Cartesian3.ZERO,
     *   scale : new Cartesian2(20.0, 12.0),
     *   maximumSize: new Cartesian3(20.0, 12.0, 12.0),
     *   slice: -1.0,
     *   cloudType : CloudType.CUMULUS
     * });
     * ```
     * ```
     * // Example 2:  Specify only the cloud's cartographic position.
     * const c = clouds.add({
     *   position : Cartesian3.fromDegrees(longitude, latitude, height)
     * });
     * ```
     * @param [options] A template describing the cloud's properties as shown in Example 1.
     * @return The cloud that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#add">Online Documentation</a>
     */
    fun add(options: Any? = definedExternally): CumulusCloud

    /**
     * Removes a cloud from the collection.
     * ```
     * const c = clouds.add(...);
     * clouds.remove(c);  // Returns true
     * ```
     * @param [cloud] The cloud to remove.
     * @return `true` if the cloud was removed; `false` if the cloud was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#remove">Online Documentation</a>
     */
    fun remove(cloud: CumulusCloud): Boolean

    /**
     * Removes all clouds from the collection.
     * ```
     * clouds.add(...);
     * clouds.add(...);
     * clouds.removeAll();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Check whether this collection contains a given cloud.
     * @param [cloud] The cloud to check for.
     * @return true if this collection contains the cloud, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#contains">Online Documentation</a>
     */
    fun contains(cloud: CumulusCloud? = definedExternally): Boolean

    /**
     * Returns the cloud in the collection at the specified index. Indices are zero-based
     * and increase as clouds are added. Removing a cloud shifts all clouds after
     * it to the left, changing their indices. This function is commonly used with
     * [CloudCollection.length] to iterate over all the clouds in the collection.
     * ```
     * // Toggle the show property of every cloud in the collection
     * const len = clouds.length;
     * for (let i = 0; i < len; ++i) {
     *   const c = clouds.get(i);
     *   c.show = !c.show;
     * }
     * ```
     * @param [index] The zero-based index of the cloud.
     * @return The cloud at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#get">Online Documentation</a>
     */
    operator fun get(index: Int): CumulusCloud

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#isDestroyed">Online Documentation</a>
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
     * clouds = clouds && clouds.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CloudCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun CloudCollection(
    block: CloudCollection.() -> Unit,
): CloudCollection =
    CloudCollection().apply(block)
