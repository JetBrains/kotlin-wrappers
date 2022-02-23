// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A renderable collection of billboards.  Billboards are viewport-aligned
 * images positioned in the 3D scene.
 *
 * Billboards are added and removed from the collection using [BillboardCollection.add]
 * and [BillboardCollection.remove].  Billboards in a collection automatically share textures
 * for images with the same identifier.
 * ```
 * // Create a billboard collection with two billboards
 * const billboards = scene.primitives.add(new BillboardCollection());
 * billboards.add({
 *   position : new Cartesian3(1.0, 2.0, 3.0),
 *   image : 'url/to/image'
 * });
 * billboards.add({
 *   position : new Cartesian3(4.0, 5.0, 6.0),
 *   image : 'url/to/another/image'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html">Online Documentation</a>
 */
external class BillboardCollection(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [modelMatrix] The 4x4 transformation matrix that transforms each billboard from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [debugShowBoundingVolume] For debugging only. Determines if this primitive's commands' bounding spheres are shown.
     *   Default value - `false`
     * @property [scene] Must be passed in for billboards that use the height reference property or will be depth tested against the globe.
     * @property [blendOption] The billboard blending option. The default
     *   is used for rendering both opaque and translucent billboards. However, if either all of the billboards are completely opaque or all are completely translucent,
     *   setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve performance by up to 2x.
     *   Default value - [BlendOption.OPAQUE_AND_TRANSLUCENT]
     * @property [show] Determines if the billboards in the collection will be shown.
     *   Default value - `true`
     */
    interface ConstructorOptions {
        var modelMatrix: Matrix4?
        var debugShowBoundingVolume: Boolean?
        var scene: Scene?
        var blendOption: BlendOption?
        var show: Boolean?
    }

    /**
     * Determines if billboards in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The 4x4 transformation matrix that transforms each billboard in this collection from model to world coordinates.
     * When this is the identity matrix, the billboards are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * ```
     * const center = Cartesian3.fromDegrees(-75.59777, 40.03883);
     * billboards.modelMatrix = Transforms.eastNorthUpToFixedFrame(center);
     * billboards.add({
     *   image : 'url/to/image',
     *   position : new Cartesian3(0.0, 0.0, 0.0) // center
     * });
     * billboards.add({
     *   image : 'url/to/image',
     *   position : new Cartesian3(1000000.0, 0.0, 0.0) // east
     * });
     * billboards.add({
     *   image : 'url/to/image',
     *   position : new Cartesian3(0.0, 1000000.0, 0.0) // north
     * });
     * billboards.add({
     *   image : 'url/to/image',
     *   position : new Cartesian3(0.0, 0.0, 1000000.0) // up
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the texture atlas for this BillboardCollection as a fullscreen quad.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#debugShowTextureAtlas">Online Documentation</a>
     */
    var debugShowTextureAtlas: Boolean

    /**
     * The billboard blending option. The default is used for rendering both opaque and translucent billboards.
     * However, if either all of the billboards are completely opaque or all are completely translucent,
     * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
     * performance by up to 2x.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#blendOption">Online Documentation</a>
     */
    var blendOption: BlendOption

    /**
     * Returns the number of billboards in this collection.  This is commonly used with
     * [BillboardCollection.get] to iterate over all the billboards
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Creates and adds a billboard with the specified initial properties to the collection.
     * The added billboard is returned so it can be modified or removed from the collection later.
     * ```
     * // Example 1:  Add a billboard, specifying all the default values.
     * const b = billboards.add({
     *   show : true,
     *   position : Cartesian3.ZERO,
     *   pixelOffset : Cartesian2.ZERO,
     *   eyeOffset : Cartesian3.ZERO,
     *   heightReference : HeightReference.NONE,
     *   horizontalOrigin : HorizontalOrigin.CENTER,
     *   verticalOrigin : VerticalOrigin.CENTER,
     *   scale : 1.0,
     *   image : 'url/to/image',
     *   imageSubRegion : undefined,
     *   color : Color.WHITE,
     *   id : undefined,
     *   rotation : 0.0,
     *   alignedAxis : Cartesian3.ZERO,
     *   width : undefined,
     *   height : undefined,
     *   scaleByDistance : undefined,
     *   translucencyByDistance : undefined,
     *   pixelOffsetScaleByDistance : undefined,
     *   sizeInMeters : false,
     *   distanceDisplayCondition : undefined
     * });
     * ```
     * ```
     * // Example 2:  Specify only the billboard's cartographic position.
     * const b = billboards.add({
     *   position : Cartesian3.fromDegrees(longitude, latitude, height)
     * });
     * ```
     * @param [options] A template describing the billboard's properties as shown in Example 1.
     * @return The billboard that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#add">Online Documentation</a>
     */
    fun add(options: Any? = definedExternally): Billboard

    /**
     * Removes a billboard from the collection.
     * ```
     * const b = billboards.add(...);
     * billboards.remove(b);  // Returns true
     * ```
     * @param [billboard] The billboard to remove.
     * @return `true` if the billboard was removed; `false` if the billboard was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#remove">Online Documentation</a>
     */
    fun remove(billboard: Billboard): Boolean

    /**
     * Removes all billboards from the collection.
     * ```
     * billboards.add(...);
     * billboards.add(...);
     * billboards.removeAll();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Check whether this collection contains a given billboard.
     * @param [billboard] The billboard to check for.
     * @return true if this collection contains the billboard, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#contains">Online Documentation</a>
     */
    fun contains(billboard: Billboard? = definedExternally): Boolean

    /**
     * Returns the billboard in the collection at the specified index.  Indices are zero-based
     * and increase as billboards are added.  Removing a billboard shifts all billboards after
     * it to the left, changing their indices.  This function is commonly used with
     * [BillboardCollection.length] to iterate over all the billboards
     * in the collection.
     * ```
     * // Toggle the show property of every billboard in the collection
     * const len = billboards.length;
     * for (let i = 0; i < len; ++i) {
     *   const b = billboards.get(i);
     *   b.show = !b.show;
     * }
     * ```
     * @param [index] The zero-based index of the billboard.
     * @return The billboard at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): Billboard

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#isDestroyed">Online Documentation</a>
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
     * billboards = billboards && billboards.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun BillboardCollection(
    block: BillboardCollection.ConstructorOptions.() -> Unit,
): BillboardCollection {
    val options: BillboardCollection.ConstructorOptions = js("({})")
    block(options)
    return BillboardCollection(options)
}
