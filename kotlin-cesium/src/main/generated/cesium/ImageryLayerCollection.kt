// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * An ordered collection of imagery layers.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html">Online Documentation</a>
 */
external class ImageryLayerCollection {
    /**
     * An event that is raised when a layer is added to the collection.  Event handlers are passed the layer that
     * was added and the index at which it was added.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#layerAdded">Online Documentation</a>
     */
    var layerAdded: DefaultEvent

    /**
     * An event that is raised when a layer is removed from the collection.  Event handlers are passed the layer that
     * was removed and the index from which it was removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#layerRemoved">Online Documentation</a>
     */
    var layerRemoved: DefaultEvent

    /**
     * An event that is raised when a layer changes position in the collection.  Event handlers are passed the layer that
     * was moved, its new index after the move, and its old index prior to the move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#layerMoved">Online Documentation</a>
     */
    var layerMoved: DefaultEvent

    /**
     * An event that is raised when a layer is shown or hidden by setting the
     * [ImageryLayer.show] property.  Event handlers are passed a reference to this layer,
     * the index of the layer in the collection, and a flag that is true if the layer is now
     * shown or false if it is now hidden.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#layerShownOrHidden">Online Documentation</a>
     */
    var layerShownOrHidden: DefaultEvent

    /**
     * Gets the number of layers in this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Adds a layer to the collection.
     * @param [layer] the layer to add.
     * @param [index] the index to add the layer at.  If omitted, the layer will
     *   be added on top of all existing layers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#add">Online Documentation</a>
     */
    fun add(
        layer: ImageryLayer,
        index: Int? = definedExternally,
    )

    /**
     * Creates a new layer using the given ImageryProvider and adds it to the collection.
     * @param [imageryProvider] the imagery provider to create a new layer for.
     * @param [index] the index to add the layer at.  If omitted, the layer will
     *   added on top of all existing layers.
     * @return The newly created layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#addImageryProvider">Online Documentation</a>
     */
    fun addImageryProvider(
        imageryProvider: ImageryProvider,
        index: Int? = definedExternally,
    ): ImageryLayer

    /**
     * Removes a layer from this collection, if present.
     * @param [layer] The layer to remove.
     * @param [destroy] whether to destroy the layers in addition to removing them.
     *   Default value - `true`
     * @return true if the layer was in the collection and was removed,
     *   false if the layer was not in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#remove">Online Documentation</a>
     */
    fun remove(
        layer: ImageryLayer,
        destroy: Boolean? = definedExternally,
    ): Boolean

    /**
     * Removes all layers from this collection.
     * @param [destroy] whether to destroy the layers in addition to removing them.
     *   Default value - `true`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll(destroy: Boolean? = definedExternally)

    /**
     * Checks to see if the collection contains a given layer.
     * @param [layer] the layer to check for.
     * @return true if the collection contains the layer, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#contains">Online Documentation</a>
     */
    fun contains(layer: ImageryLayer): Boolean

    /**
     * Determines the index of a given layer in the collection.
     * @param [layer] The layer to find the index of.
     * @return The index of the layer in the collection, or -1 if the layer does not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#indexOf">Online Documentation</a>
     */
    fun indexOf(layer: ImageryLayer): Int

    /**
     * Gets a layer by index from the collection.
     * @param [index] the index to retrieve.
     * @return The imagery layer at the given index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): ImageryLayer

    /**
     * Raises a layer up one position in the collection.
     * @param [layer] the layer to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#raise">Online Documentation</a>
     */
    fun raise(layer: ImageryLayer)

    /**
     * Lowers a layer down one position in the collection.
     * @param [layer] the layer to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#lower">Online Documentation</a>
     */
    fun lower(layer: ImageryLayer)

    /**
     * Raises a layer to the top of the collection.
     * @param [layer] the layer to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#raiseToTop">Online Documentation</a>
     */
    fun raiseToTop(layer: ImageryLayer)

    /**
     * Lowers a layer to the bottom of the collection.
     * @param [layer] the layer to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#lowerToBottom">Online Documentation</a>
     */
    fun lowerToBottom(layer: ImageryLayer)

    /**
     * Determines the imagery layers that are intersected by a pick ray. To compute a pick ray from a
     * location on the screen, use [Camera.getPickRay].
     * @param [ray] The ray to test for intersection.
     * @param [scene] The scene.
     * @return An array that includes all of
     *   the layers that are intersected by a given pick ray. Undefined if
     *   no layers are selected.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#pickImageryLayers">Online Documentation</a>
     */
    fun pickImageryLayers(
        ray: Ray,
        scene: Scene,
    ): ReadonlyArray<ImageryLayer>?

    /**
     * Asynchronously determines the imagery layer features that are intersected by a pick ray.  The intersected imagery
     * layer features are found by invoking [ImageryProvider.pickFeatures] for each imagery layer tile intersected
     * by the pick ray.  To compute a pick ray from a location on the screen, use [Camera.getPickRay].
     * ```
     * const pickRay = viewer.camera.getPickRay(windowPosition);
     * const featuresPromise = viewer.imageryLayers.pickImageryLayerFeatures(pickRay, viewer.scene);
     * if (!Cesium.defined(featuresPromise)) {
     *     console.log('No features picked.');
     * } else {
     *     Promise.resolve(featuresPromise).then(function(features) {
     *         // This function is called asynchronously when the list if picked features is available.
     *         console.log(`Number of features: ${features.length}`);
     *         if (features.length > 0) {
     *             console.log(`First feature name: ${features[0].name}`);
     *         }
     *     });
     * }
     * ```
     * @param [ray] The ray to test for intersection.
     * @param [scene] The scene.
     * @return A promise that resolves to an array of features intersected by the pick ray.
     *   If it can be quickly determined that no features are intersected (for example,
     *   because no active imagery providers support [ImageryProvider.pickFeatures]
     *   or because the pick ray does not intersect the surface), this function will
     *   return undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#pickImageryLayerFeatures">Online Documentation</a>
     */
    fun pickImageryLayerFeatures(
        ray: Ray,
        scene: Scene,
    ): kotlin.js.Promise<ReadonlyArray<ImageryLayerFeatureInfo>>?

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return true if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by all layers in this collection.  Explicitly destroying this
     * object allows for deterministic release of WebGL resources, instead of relying on the garbage
     * collector.
     *
     * Once this object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * layerCollection = layerCollection && layerCollection.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayerCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
