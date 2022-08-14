// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Specifies a set of clipping planes. Clipping planes selectively disable rendering in a region on the
 * outside of the specified list of [ClippingPlane] objects for a single gltf model, 3D Tileset, or the globe.
 *
 * In general the clipping planes' coordinates are relative to the object they're attached to, so a plane with distance set to 0 will clip
 * through the center of the object.
 *
 * For 3D Tiles, the root tile's transform is used to position the clipping planes. If a transform is not defined, the root tile's [Cesium3DTile.boundingSphere] is used instead.
 * ```
 * // This clipping plane's distance is positive, which means its normal
 * // is facing the origin. This will clip everything that is behind
 * // the plane, which is anything with y coordinate < -5.
 * const clippingPlanes = new ClippingPlaneCollection({
 *     planes : [
 *         new ClippingPlane(new Cartesian3(0.0, 1.0, 0.0), 5.0)
 *     ],
 * });
 * // Create an entity and attach the ClippingPlaneCollection to the model.
 * const entity = viewer.entities.add({
 *     position : Cartesian3.fromDegrees(-123.0744619, 44.0503706, 10000),
 *     model : {
 *         uri : 'model.gltf',
 *         minimumPixelSize : 128,
 *         maximumScale : 20000,
 *         clippingPlanes : clippingPlanes
 *     }
 * });
 * viewer.zoomTo(entity);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html">Online Documentation</a>
 */
external class ClippingPlaneCollection(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [planes] An array of [ClippingPlane] objects used to selectively disable rendering on the outside of each plane.
     *   Default value - `[]`
     * @property [enabled] Determines whether the clipping planes are active.
     *   Default value - `true`
     * @property [modelMatrix] The 4x4 transformation matrix specifying an additional transform relative to the clipping planes original coordinate system.
     *   Default value - [Matrix4.IDENTITY]
     * @property [unionClippingRegions] If true, a region will be clipped if it is on the outside of any plane in the collection. Otherwise, a region will only be clipped if it is on the outside of every plane.
     *   Default value - `false`
     * @property [edgeColor] The color applied to highlight the edge along which an object is clipped.
     *   Default value - [Color.WHITE]
     * @property [edgeWidth] The width, in pixels, of the highlight applied to the edge along which an object is clipped.
     *   Default value - `0.0`
     */
    interface ConstructorOptions {
        var planes: ReadonlyArray<ClippingPlane>?
        var enabled: Boolean?
        var modelMatrix: Matrix4?
        var unionClippingRegions: Boolean?
        var edgeColor: Color?
        var edgeWidth: Double?
    }

    /**
     * The 4x4 transformation matrix specifying an additional transform relative to the clipping planes
     * original coordinate system.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * The color applied to highlight the edge along which an object is clipped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#edgeColor">Online Documentation</a>
     */
    var edgeColor: Color

    /**
     * The width, in pixels, of the highlight applied to the edge along which an object is clipped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#edgeWidth">Online Documentation</a>
     */
    var edgeWidth: Double

    /**
     * An event triggered when a new clipping plane is added to the collection.  Event handlers
     * are passed the new plane and the index at which it was added.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#planeAdded">Online Documentation</a>
     */
    var planeAdded: DefaultEvent

    /**
     * An event triggered when a new clipping plane is removed from the collection.  Event handlers
     * are passed the new plane and the index from which it was removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#planeRemoved">Online Documentation</a>
     */
    var planeRemoved: DefaultEvent

    /**
     * Returns the number of planes in this collection.  This is commonly used with
     * [ClippingPlaneCollection.get] to iterate over all the planes
     * in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * If true, a region will be clipped if it is on the outside of any plane in the
     * collection. Otherwise, a region will only be clipped if it is on the
     * outside of every plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#unionClippingRegions">Online Documentation</a>
     */
    var unionClippingRegions: Boolean

    /**
     * If true, clipping will be enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * Adds the specified [ClippingPlane] to the collection to be used to selectively disable rendering
     * on the outside of each plane. Use [ClippingPlaneCollection.unionClippingRegions] to modify
     * how modify the clipping behavior of multiple planes.
     * @param [plane] The ClippingPlane to add to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#add">Online Documentation</a>
     */
    fun add(plane: ClippingPlane)

    /**
     * Returns the plane in the collection at the specified index.  Indices are zero-based
     * and increase as planes are added.  Removing a plane shifts all planes after
     * it to the left, changing their indices.  This function is commonly used with
     * [ClippingPlaneCollection.length] to iterate over all the planes
     * in the collection.
     * @param [index] The zero-based index of the plane.
     * @return The ClippingPlane at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): ClippingPlane

    /**
     * Checks whether this collection contains a ClippingPlane equal to the given ClippingPlane.
     * @param [clippingPlane] The ClippingPlane to check for.
     * @return true if this collection contains the ClippingPlane, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#contains">Online Documentation</a>
     */
    fun contains(clippingPlane: ClippingPlane? = definedExternally): Boolean

    /**
     * Removes the first occurrence of the given ClippingPlane from the collection.
     * @return `true` if the plane was removed; `false` if the plane was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#remove">Online Documentation</a>
     */
    fun remove(clippingPlane: ClippingPlane): Boolean

    /**
     * Removes all planes from the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * build the resources for clipping planes.
     *
     * Do not call this function directly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#isDestroyed">Online Documentation</a>
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
     * clippingPlanes = clippingPlanes && clippingPlanes.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ClippingPlaneCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun ClippingPlaneCollection(
    block: ClippingPlaneCollection.ConstructorOptions.() -> Unit,
): ClippingPlaneCollection {
    val options: ClippingPlaneCollection.ConstructorOptions = js("({})")
    block(options)
    return ClippingPlaneCollection(options)
}
