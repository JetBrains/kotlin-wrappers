// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * The content of a tile in a [Cesium3DTileset].
 *
 * Derived classes of this interface provide access to individual features in the tile.
 * Access derived objects through [Cesium3DTile.content].
 *
 * This type describes an interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html">Online Documentation</a>
 */
abstract external class Cesium3DTileContent {
    /**
     * Gets the number of features in the tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#featuresLength">Online Documentation</a>
     */
    abstract val featuresLength: Int

    /**
     * Gets the number of points in the tile.
     *
     * Only applicable for tiles with Point Cloud content. This is different than [Cesium3DTileContent.featuresLength] which
     * equals the number of groups of points as distinguished by the `BATCH_ID` feature table semantic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#pointsLength">Online Documentation</a>
     */
    abstract val pointsLength: Int

    /**
     * Gets the number of triangles in the tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#trianglesLength">Online Documentation</a>
     */
    abstract val trianglesLength: Int

    /**
     * Gets the tile's geometry memory in bytes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#geometryByteLength">Online Documentation</a>
     */
    abstract val geometryByteLength: Int

    /**
     * Gets the tile's texture memory in bytes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#texturesByteLength">Online Documentation</a>
     */
    abstract val texturesByteLength: Int

    /**
     * Gets the amount of memory used by the batch table textures and any binary
     * metadata properties not accounted for in geometryByteLength or
     * texturesByteLength
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#batchTableByteLength">Online Documentation</a>
     */
    abstract val batchTableByteLength: Int

    /**
     * Gets the array of [Cesium3DTileContent] objects for contents that contain other contents, such as composite tiles. The inner contents may in turn have inner contents, such as a composite tile that contains a composite tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#innerContents">Online Documentation</a>
     */
    abstract val innerContents: ReadonlyArray<Any>

    /**
     * Gets the promise that will be resolved when the tile's content is ready to render.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#readyPromise">Online Documentation</a>
     */
    abstract val readyPromise: kotlin.js.Promise<Cesium3DTileContent>

    /**
     * Gets the tileset for this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#tileset">Online Documentation</a>
     */
    abstract val tileset: Cesium3DTileset

    /**
     * Gets the tile containing this content.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#tile">Online Documentation</a>
     */
    abstract val tile: Cesium3DTile

    /**
     * Gets the url of the tile's content.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#url">Online Documentation</a>
     */
    abstract val url: String

    /**
     * Returns whether the feature has this property.
     * @param [batchId] The batchId for the feature.
     * @param [name] The case-sensitive name of the property.
     * @return `true` if the feature has this property; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#hasProperty">Online Documentation</a>
     */
    abstract fun hasProperty(
        batchId: Int,
        name: String,
    ): Boolean

    /**
     * Returns the [Cesium3DTileFeature] object for the feature with the
     * given `batchId`.  This object is used to get and modify the
     * feature's properties.
     *
     * Features in a tile are ordered by `batchId`, an index used to retrieve their metadata from the batch table.
     * @param [batchId] The batchId for the feature.
     * @return The corresponding [Cesium3DTileFeature] object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileContent.html#getFeature">Online Documentation</a>
     */
    abstract fun getFeature(batchId: Int): Cesium3DTileFeature
}
