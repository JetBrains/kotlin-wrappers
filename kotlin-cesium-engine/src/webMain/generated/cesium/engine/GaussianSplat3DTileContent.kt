// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * Represents the contents of a glTF or glb using the [ KHR_gaussian_splatting](https://github.com/CesiumGS/glTF/tree/draft-splat-spz/extensions/2.0/Khronos/KHR_gaussian_splatting ) and [ KHR_gaussian_splatting_compression_spz_2](https://github.com/CesiumGS/glTF/tree/draft-splat-spz/extensions/2.0/Khronos/KHR_gaussian_splatting_compression_spz_2 ) extensions.
 *
 * Implements the [Cesium3DTileContent] interface.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html">Online Documentation</a>
 */
external class GaussianSplat3DTileContent() {
    /**
     * Gets the number of features in the tile. Currently this is always zero.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#featuresLength">Online Documentation</a>
     */
    val featuresLength: Int

    /**
     * Equal to the number of Gaussian splats in the tile. Each splat is represented by a median point and a set of attributes, so we can
     * treat this as the number of points in the tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#pointsLength">Online Documentation</a>
     */
    val pointsLength: Int

    /**
     * Gets the number of triangles in the tile. Currently this is always zero because Gaussian splats are not represented as triangles in the tile content.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#trianglesLength">Online Documentation</a>
     */
    val trianglesLength: Int

    /**
     * The number of bytes used by the geometry attributes of this content.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#geometryByteLength">Online Documentation</a>
     */
    val geometryByteLength: Int

    /**
     * The number of bytes used by the textures of this content.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#texturesByteLength">Online Documentation</a>
     */
    val texturesByteLength: Int

    /**
     * Gets the amount of memory used by the batch table textures and any binary
     * metadata properties not accounted for in geometryByteLength or
     * texturesByteLength
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#batchTableByteLength">Online Documentation</a>
     */
    val batchTableByteLength: Int

    /**
     * Gets the array of [Cesium3DTileContent] objects for contents that contain other contents, such as composite tiles. The inner contents may in turn have inner contents, such as a composite tile that contains a composite tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#innerContents">Online Documentation</a>
     */
    val innerContents: ReadonlyArray<JsAny>

    /**
     * Returns true when the tile's content is ready to render; otherwise false
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Returns true when the tile's content is transformed to world coordinates; otherwise false
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#transformed">Online Documentation</a>
     */
    val transformed: Boolean

    /**
     * The tileset that this content belongs to.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset

    /**
     * The tile that this content belongs to.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#tile">Online Documentation</a>
     */
    val tile: Cesium3DTile

    /**
     * The resource that this content was loaded from.
     * <p>
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#url">Online Documentation</a>
     */
    val url: Resource

    /**
     * Returns whether the feature has this property.
     * @param [batchId] The batchId for the feature.
     * @param [name] The case-sensitive name of the property.
     * @return `true` if the feature has this property; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#getFeature">Online Documentation</a>
     */
    fun getFeature(batchId: Int): Cesium3DTileFeature

    companion object {
        /**
         * Performs checks to ensure that the provided tileset has the Gaussian Splatting extensions.
         * @param [tileset] The tileset to check for the extensions.
         * @return Returns `true` if the necessary extensions are included in the tileset.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GaussianSplat3DTileContent.html#.tilesetRequiresGaussianSplattingExt">Online Documentation</a>
         */
        fun tilesetRequiresGaussianSplattingExt(tileset: Cesium3DTileset): Boolean
    }
}
