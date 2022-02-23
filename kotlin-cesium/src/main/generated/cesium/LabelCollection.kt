// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A renderable collection of labels.  Labels are viewport-aligned text positioned in the 3D scene.
 * Each label can have a different font, color, scale, etc.
 *
 * Labels are added and removed from the collection using [LabelCollection.add]
 * and [LabelCollection.remove].
 * ```
 * // Create a label collection with two labels
 * const labels = scene.primitives.add(new LabelCollection());
 * labels.add({
 *   position : new Cartesian3(1.0, 2.0, 3.0),
 *   text : 'A label'
 * });
 * labels.add({
 *   position : new Cartesian3(4.0, 5.0, 6.0),
 *   text : 'Another label'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html">Online Documentation</a>
 */
external class LabelCollection(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [modelMatrix] The 4x4 transformation matrix that transforms each label from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [debugShowBoundingVolume] For debugging only. Determines if this primitive's commands' bounding spheres are shown.
     *   Default value - `false`
     * @property [scene] Must be passed in for labels that use the height reference property or will be depth tested against the globe.
     * @property [blendOption] The label blending option. The default
     *   is used for rendering both opaque and translucent labels. However, if either all of the labels are completely opaque or all are completely translucent,
     *   setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve performance by up to 2x.
     *   Default value - [BlendOption.OPAQUE_AND_TRANSLUCENT]
     * @property [show] Determines if the labels in the collection will be shown.
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
     * Determines if labels in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The 4x4 transformation matrix that transforms each label in this collection from model to world coordinates.
     * When this is the identity matrix, the labels are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
     * Local reference frames can be used by providing a different transformation matrix, like that returned
     * by [Transforms.eastNorthUpToFixedFrame].
     * ```
     * const center = Cartesian3.fromDegrees(-75.59777, 40.03883);
     * labels.modelMatrix = Transforms.eastNorthUpToFixedFrame(center);
     * labels.add({
     *   position : new Cartesian3(0.0, 0.0, 0.0),
     *   text     : 'Center'
     * });
     * labels.add({
     *   position : new Cartesian3(1000000.0, 0.0, 0.0),
     *   text     : 'East'
     * });
     * labels.add({
     *   position : new Cartesian3(0.0, 1000000.0, 0.0),
     *   text     : 'North'
     * });
     * labels.add({
     *   position : new Cartesian3(0.0, 0.0, 1000000.0),
     *   text     : 'Up'
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * This property is for debugging only; it is not for production use nor is it optimized.
     *
     * Draws the bounding sphere for each draw command in the primitive.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#debugShowBoundingVolume">Online Documentation</a>
     */
    var debugShowBoundingVolume: Boolean

    /**
     * The label blending option. The default is used for rendering both opaque and translucent labels.
     * However, if either all of the labels are completely opaque or all are completely translucent,
     * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
     * performance by up to 2x.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#blendOption">Online Documentation</a>
     */
    var blendOption: BlendOption

    /**
     * Returns the number of labels in this collection.  This is commonly used with
     * [LabelCollection.get] to iterate over all the labels
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Creates and adds a label with the specified initial properties to the collection.
     * The added label is returned so it can be modified or removed from the collection later.
     * ```
     * // Example 1:  Add a label, specifying all the default values.
     * const l = labels.add({
     *   show : true,
     *   position : Cartesian3.ZERO,
     *   text : '',
     *   font : '30px sans-serif',
     *   fillColor : Color.WHITE,
     *   outlineColor : Color.BLACK,
     *   outlineWidth : 1.0,
     *   showBackground : false,
     *   backgroundColor : new Color(0.165, 0.165, 0.165, 0.8),
     *   backgroundPadding : new Cartesian2(7, 5),
     *   style : LabelStyle.FILL,
     *   pixelOffset : Cartesian2.ZERO,
     *   eyeOffset : Cartesian3.ZERO,
     *   horizontalOrigin : HorizontalOrigin.LEFT,
     *   verticalOrigin : VerticalOrigin.BASELINE,
     *   scale : 1.0,
     *   translucencyByDistance : undefined,
     *   pixelOffsetScaleByDistance : undefined,
     *   heightReference : HeightReference.NONE,
     *   distanceDisplayCondition : undefined
     * });
     * ```
     * ```
     * // Example 2:  Specify only the label's cartographic position,
     * // text, and font.
     * const l = labels.add({
     *   position : Cartesian3.fromRadians(longitude, latitude, height),
     *   text : 'Hello World',
     *   font : '24px Helvetica',
     * });
     * ```
     * @param [options] A template describing the label's properties as shown in Example 1.
     * @return The label that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#add">Online Documentation</a>
     */
    fun add(options: Any? = definedExternally): Label

    /**
     * Removes a label from the collection.  Once removed, a label is no longer usable.
     * ```
     * const l = labels.add(...);
     * labels.remove(l);  // Returns true
     * ```
     * @param [label] The label to remove.
     * @return `true` if the label was removed; `false` if the label was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#remove">Online Documentation</a>
     */
    fun remove(label: Label): Boolean

    /**
     * Removes all labels from the collection.
     * ```
     * labels.add(...);
     * labels.add(...);
     * labels.removeAll();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Check whether this collection contains a given label.
     * @param [label] The label to check for.
     * @return true if this collection contains the label, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#contains">Online Documentation</a>
     */
    fun contains(label: Label): Boolean

    /**
     * Returns the label in the collection at the specified index.  Indices are zero-based
     * and increase as labels are added.  Removing a label shifts all labels after
     * it to the left, changing their indices.  This function is commonly used with
     * [LabelCollection.length] to iterate over all the labels
     * in the collection.
     * ```
     * // Toggle the show property of every label in the collection
     * const len = labels.length;
     * for (let i = 0; i < len; ++i) {
     *   const l = billboards.get(i);
     *   l.show = !l.show;
     * }
     * ```
     * @param [index] The zero-based index of the billboard.
     * @return The label at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): Label

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#isDestroyed">Online Documentation</a>
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
     * labels = labels && labels.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LabelCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun LabelCollection(
    block: LabelCollection.ConstructorOptions.() -> Unit,
): LabelCollection {
    val options: LabelCollection.ConstructorOptions = js("({})")
    block(options)
    return LabelCollection(options)
}
