// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A feature of a [Cesium3DTileset].
 *
 * Provides access to a feature's properties stored in the tile's batch table, as well
 * as the ability to show/hide a feature and change its highlight color via
 * [Cesium3DTileFeature.show] and [Cesium3DTileFeature.color], respectively.
 *
 * Modifications to a `Cesium3DTileFeature` object have the lifetime of the tile's
 * content.  If the tile's content is unloaded, e.g., due to it going out of view and needing
 * to free space in the cache for visible tiles, listen to the [Cesium3DTileset.tileUnload] event to save any
 * modifications. Also listen to the [Cesium3DTileset.tileVisible] event to reapply any modifications.
 *
 * Do not construct this directly.  Access it through [Cesium3DTileContent.getFeature]
 * or picking using [Scene.pick].
 * ```
 * // On mouse over, display all the properties for a feature in the console log.
 * handler.setInputAction(function(movement) {
 *     const feature = scene.pick(movement.endPosition);
 *     if (feature instanceof Cesium3DTileFeature) {
 *         const propertyIds = feature.getPropertyIds();
 *         const length = propertyIds.length;
 *         for (let i = 0; i < length; ++i) {
 *             const propertyId = propertyIds[i];
 *             console.log(`{propertyId}: ${feature.getProperty(propertyId)}`);
 *         }
 *     }
 * }, ScreenSpaceEventType.MOUSE_MOVE);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html">Online Documentation</a>
 */
external class Cesium3DTileFeature {
    /**
     * Gets or sets if the feature will be shown. This is set for all features
     * when a style's show is evaluated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the highlight color multiplied with the feature's color.  When
     * this is white, the feature's color is not changed. This is set for all features
     * when a style's color is evaluated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Gets a typed array containing the ECEF positions of the polyline.
     * Returns undefined if [Cesium3DTileset.vectorKeepDecodedPositions] is false
     * or the feature is not a polyline in a vector tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#polylinePositions">Online Documentation</a>
     */
    var polylinePositions: kotlinx.js.Float64Array

    /**
     * Gets the tileset containing the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset

    /**
     * All objects returned by [Scene.pick] have a `primitive` property. This returns
     * the tileset containing the feature.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#primitive">Online Documentation</a>
     */
    val primitive: Cesium3DTileset

    /**
     * Get the feature ID associated with this feature. For 3D Tiles 1.0, the
     * batch ID is returned. For EXT_mesh_features, this is the feature ID from
     * the selected feature ID set.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#featureId">Online Documentation</a>
     */
    val featureId: Int

    /**
     * Returns whether the feature contains this property. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [name] The case-sensitive name of the property.
     * @return Whether the feature contains this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(name: String): Boolean

    /**
     * Returns an array of property names for the feature. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [results] An array into which to store the results.
     * @return The names of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#getPropertyNames">Online Documentation</a>
     */
    fun getPropertyNames(results: ReadonlyArray<String>? = definedExternally): ReadonlyArray<String>

    /**
     * Returns an array of property IDs for the feature. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * @param [results] An array into which to store the results.
     * @return The IDs of the feature's properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#getPropertyIds">Online Documentation</a>
     */
    fun getPropertyIds(results: ReadonlyArray<String>? = definedExternally): ReadonlyArray<String>

    /**
     * Returns a copy of the value of the feature's property with the given name. This includes properties from this feature's
     * class and inherited classes when using a batch table hierarchy.
     * ```
     * // Display all the properties for a feature in the console log.
     * const propertyIds = feature.getPropertyIds();
     * const length = propertyIds.length;
     * for (let i = 0; i < length; ++i) {
     *     const propertyId = propertyIds[i];
     *     console.log(`{propertyId}: ${feature.getProperty(propertyId)}`);
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @return The value of the property or `undefined` if the feature does not have this property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#getProperty">Online Documentation</a>
     */
    fun getProperty(name: String): Any

    /**
     * Sets the value of the feature's property with the given name.
     *
     * If a property with the given name doesn't exist, it is created.
     * ```
     * const height = feature.getProperty('Height'); // e.g., the height of a building
     * ```
     * ```
     * const name = 'clicked';
     * if (feature.getProperty(name)) {
     *     console.log('already clicked');
     * } else {
     *     feature.setProperty(name, true);
     *     console.log('first click');
     * }
     * ```
     * @param [name] The case-sensitive name of the property.
     * @param [value] The value of the property that will be copied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#setProperty">Online Documentation</a>
     */
    fun setProperty(
        name: String,
        value: Any,
    )

    companion object {
        /**
         * Returns a copy of the feature's property with the given name, examining all
         * the metadata from 3D Tiles 1.0 formats, the EXT_structural_metadata and legacy
         * EXT_feature_metadata glTF extensions, and the metadata present either in the
         * tileset JSON (3D Tiles 1.1) or in the 3DTILES_metadata 3D Tiles extension.
         * Metadata is checked against name from most specific to most general and the
         * first match is returned. Metadata is checked in this order:
         *
         * <ol>
         *   <li>Batch table (structural metadata) property by semantic</li>
         *   <li>Batch table (structural metadata) property by property ID</li>
         *   <li>Content metadata property by semantic</li>
         *   <li>Content metadata property by property</li>
         *   <li>Tile metadata property by semantic</li>
         *   <li>Tile metadata property by property ID</li>
         *   <li>Subtree metadata property by semantic</li>
         *   <li>Subtree metadata property by property ID</li>
         *   <li>Group metadata property by semantic</li>
         *   <li>Group metadata property by property ID</li>
         *   <li>Tileset metadata property by semantic</li>
         *   <li>Tileset metadata property by property ID</li>
         *   <li>Otherwise, return undefined</li>
         * </ol>
         *
         * For 3D Tiles Next details, see the [3DTILES_metadata Extension](https://github.com/CesiumGS/3d-tiles/tree/main/extensions/3DTILES_metadata)
         * for 3D Tiles, as well as the [EXT_structural_metadata Extension](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata)
         * for glTF. For the legacy glTF extension, see [EXT_feature_metadata Extension](https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_feature_metadata)
         * @param [content] The content for accessing the metadata
         * @param [batchId] The batch ID (or feature ID) of the feature to get a property for
         * @param [name] The semantic or property ID of the feature. Semantics are checked before property IDs in each granularity of metadata.
         * @return The value of the property or `undefined` if the feature does not have this property.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTileFeature.html#.getPropertyInherited">Online Documentation</a>
         */
        fun getPropertyInherited(
            content: Cesium3DTileContent,
            batchId: Int,
            name: String,
        ): Any
    }
}
