// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A collection of primitives.  This is most often used with [Scene.primitives],
 * but `PrimitiveCollection` is also a primitive itself so collections can
 * be added to collections forming a hierarchy.
 * ```
 * const billboards = new BillboardCollection();
 * const labels = new LabelCollection();
 *
 * const collection = new PrimitiveCollection();
 * collection.add(billboards);
 *
 * scene.primitives.add(collection);  // Add collection
 * scene.primitives.add(labels);      // Add regular primitive
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html">Online Documentation</a>
 */
external class PrimitiveCollection {
    /**
     * Determines if primitives in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Determines if primitives in the collection are destroyed when they are removed by
     * [PrimitiveCollection.destroy] or  [PrimitiveCollection.remove] or implicitly
     * by [PrimitiveCollection.removeAll].
     * ```
     * // Example 1. Primitives are destroyed by default.
     * const primitives = new PrimitiveCollection();
     * const labels = primitives.add(new LabelCollection());
     * primitives = primitives.destroy();
     * const b = labels.isDestroyed(); // true
     * ```
     * ```
     * // Example 2. Do not destroy primitives in a collection.
     * const primitives = new PrimitiveCollection();
     * primitives.destroyPrimitives = false;
     * const labels = primitives.add(new LabelCollection());
     * primitives = primitives.destroy();
     * const b = labels.isDestroyed(); // false
     * labels = labels.destroy();    // explicitly destroy
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#destroyPrimitives">Online Documentation</a>
     */
    var destroyPrimitives: Boolean

    /**
     * Gets the number of primitives in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Adds a primitive to the collection.
     * ```
     * const billboards = scene.primitives.add(new BillboardCollection());
     * ```
     * @param [primitive] The primitive to add.
     * @param [index] The index to add the layer at.  If omitted, the primitive will be added at the bottom of all existing primitives.
     * @return The primitive added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#add">Online Documentation</a>
     */
    fun add(
        primitive: Any,
        index: Int? = definedExternally,
    ): Any

    /**
     * Removes a primitive from the collection.
     * ```
     * const billboards = scene.primitives.add(new BillboardCollection());
     * scene.primitives.remove(billboards);  // Returns true
     * ```
     * @param [primitive] The primitive to remove.
     * @return `true` if the primitive was removed; `false` if the primitive is `undefined` or was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#remove">Online Documentation</a>
     */
    fun remove(primitive: Any? = definedExternally): Boolean

    /**
     * Removes all primitives in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Determines if this collection contains a primitive.
     * @param [primitive] The primitive to check for.
     * @return `true` if the primitive is in the collection; `false` if the primitive is `undefined` or was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#contains">Online Documentation</a>
     */
    fun contains(primitive: Any? = definedExternally): Boolean

    /**
     * Raises a primitive "up one" in the collection.  If all primitives in the collection are drawn
     * on the globe surface, this visually moves the primitive up one.
     * @param [primitive] The primitive to raise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#raise">Online Documentation</a>
     */
    fun raise(primitive: Any? = definedExternally)

    /**
     * Raises a primitive to the "top" of the collection.  If all primitives in the collection are drawn
     * on the globe surface, this visually moves the primitive to the top.
     * @param [primitive] The primitive to raise the top.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#raiseToTop">Online Documentation</a>
     */
    fun raiseToTop(primitive: Any? = definedExternally)

    /**
     * Lowers a primitive "down one" in the collection.  If all primitives in the collection are drawn
     * on the globe surface, this visually moves the primitive down one.
     * @param [primitive] The primitive to lower.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#lower">Online Documentation</a>
     */
    fun lower(primitive: Any? = definedExternally)

    /**
     * Lowers a primitive to the "bottom" of the collection.  If all primitives in the collection are drawn
     * on the globe surface, this visually moves the primitive to the bottom.
     * @param [primitive] The primitive to lower to the bottom.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#lowerToBottom">Online Documentation</a>
     */
    fun lowerToBottom(primitive: Any? = definedExternally)

    /**
     * Returns the primitive in the collection at the specified index.
     * ```
     * // Toggle the show property of every primitive in the collection.
     * const primitives = scene.primitives;
     * const length = primitives.length;
     * for (let i = 0; i < length; ++i) {
     *   const p = primitives.get(i);
     *   p.show = !p.show;
     * }
     * ```
     * @param [index] The zero-based index of the primitive to return.
     * @return The primitive at the `index`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#get">Online Documentation</a>
     */
    operator fun get(index: Int): Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by each primitive in this collection.  Explicitly destroying this
     * collection allows for deterministic release of WebGL resources, instead of relying on the garbage
     * collector to destroy this collection.
     *
     * Since destroying a collection destroys all the contained primitives, only destroy a collection
     * when you are sure no other code is still using any of the contained primitives.
     *
     * Once this collection is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * primitives = primitives && primitives.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PrimitiveCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PrimitiveCollection(
    block: PrimitiveCollection.() -> Unit,
): PrimitiveCollection =
    PrimitiveCollection().apply(block)
