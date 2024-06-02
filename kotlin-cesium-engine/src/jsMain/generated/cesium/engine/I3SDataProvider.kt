// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium.engine

import js.array.ReadonlyArray
import js.core.Void
import js.objects.JsPlainObject
import js.objects.jso
import js.promise.Promise
import js.promise.PromiseResult
import seskar.js.JsAsync

/**
 * An I3SDataProvider is the main public class for I3S support. The url option
 * should return a scene object. Currently supported I3S versions are 1.6 and
 * 1.7/1.8 (OGC I3S 1.2). I3SFeature and I3SNode classes implement the
 * Object Model for I3S entities, with public interfaces.
 * ```
 * try {
 *   const i3sData = await I3SDataProvider.fromUrl(
 *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0"
 *   );
 *   viewer.scene.primitives.add(i3sData);
 * } catch (error) {
 *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
 * }
 * ```
 * ```
 * try {
 *   const geoidService = await ArcGISTiledElevationTerrainProvider.fromUrl(
 *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/EGM2008/ImageServer"
 *   );
 *   const i3sData = await I3SDataProvider.fromUrl(
 *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0", {
 *       geoidTiledTerrainProvider: geoidService
 *   });
 *   viewer.scene.primitives.add(i3sData);
 * } catch (error) {
 *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html">Online Documentation</a>
 */
external class I3SDataProvider(options: ConstructorOptions) {
    /**
     * Gets a human-readable name for this dataset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * Determines if the dataset will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The terrain provider referencing the GEOID service to be used for orthometric to ellipsoidal conversion.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#geoidTiledTerrainProvider">Online Documentation</a>
     */
    val geoidTiledTerrainProvider: ArcGISTiledElevationTerrainProvider

    /**
     * Gets the collection of layers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#layers">Online Documentation</a>
     */
    val layers: ReadonlyArray<I3SLayer>

    /**
     * Gets the collection of building sublayers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#sublayers">Online Documentation</a>
     */
    val sublayers: ReadonlyArray<I3SSublayer>

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * Gets the extent covered by this I3S.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#extent">Online Documentation</a>
     */
    val extent: Rectangle

    /**
     * The resource used to fetch the I3S dataset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Determines if the features will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#showFeatures">Online Documentation</a>
     */
    val showFeatures: Boolean

    /**
     * Determines if the alpha mode of the material will be adjusted depending on the color vertex attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#adjustMaterialAlphaMode">Online Documentation</a>
     */
    val adjustMaterialAlphaMode: Boolean

    /**
     * Determines if the I3S symbology will be parsed and applied for the layers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#applySymbology">Online Documentation</a>
     */
    val applySymbology: Boolean

    /**
     * Determines if the flat normals will be generated for I3S geometry without normals.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#calculateNormals">Online Documentation</a>
     */
    val calculateNormals: Boolean

    /**
     * Destroys the WebGL resources held by this object. Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception. Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Returns the collection of names for all available attributes
     * @return The collection of attribute names
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#getAttributeNames">Online Documentation</a>
     */
    fun getAttributeNames(): ReadonlyArray<String>

    /**
     * Returns the collection of values for the attribute with the given name
     * @param [name] The attribute name
     * @return The collection of attribute values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#getAttributeValues">Online Documentation</a>
     */
    fun getAttributeValues(name: String): ReadonlyArray<String>

    /**
     * Filters the drawn elements of a scene to specific attribute names and values
     * @param [filters] The collection of attribute filters
     *   Default value - `[]`
     * @return A promise that is resolved when the filter is applied
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#filterByAttributes">Online Documentation</a>
     */
    @JsAsync
    suspend fun filterByAttributes(filters: ReadonlyArray<I3SNode.AttributeFilter>? = definedExternally)

    @JsName("filterByAttributes")
    fun filterByAttributesAsync(filters: ReadonlyArray<I3SNode.AttributeFilter>? = definedExternally): Promise<Void>

    /**
     * Initialization options for the I3SDataProvider constructor
     * ```
     * // Increase LOD by reducing SSE
     * const cesium3dTilesetOptions = {
     *   maximumScreenSpaceError: 1,
     * };
     * const i3sOptions = {
     *   cesium3dTilesetOptions: cesium3dTilesetOptions,
     * };
     * ```
     * ```
     * // Set a custom outline color to replace the color defined in I3S symbology
     * const cesium3dTilesetOptions = {
     *   outlineColor: Color.BLUE,
     * };
     * const i3sOptions = {
     *   cesium3dTilesetOptions: cesium3dTilesetOptions,
     *   applySymbology: true,
     * };
     * ```
     * @property [name] The name of the I3S dataset.
     * @property [show] Determines if the dataset will be shown.
     *   Default value - `true`
     * @property [geoidTiledTerrainProvider] Tiled elevation provider describing an Earth Gravitational Model. If defined, geometry will be shifted based on the offsets given by this provider. Required to position I3S data sets with gravity-related height at the correct location.
     * @property [cesium3dTilesetOptions] Object containing options to pass to an internally created [Cesium3DTileset]. See [Cesium3DTileset] for list of valid properties. All options can be used with the exception of `url` and `show` which are overridden by values from I3SDataProvider.
     * @property [showFeatures] Determines if the features will be shown.
     *   Default value - `false`
     * @property [adjustMaterialAlphaMode] The option to adjust the alpha mode of the material based on the transparency of the vertex color. When `true`, the alpha mode of the material (if not defined) will be set to BLEND for geometry with any transparency in the color vertex attribute.
     *   Default value - `false`
     * @property [applySymbology] Determines if the I3S symbology will be parsed and applied for the layers.
     *   Default value - `false`
     * @property [calculateNormals] Determines if the flat normals will be generated for I3S geometry without normals.
     *   Default value - `false`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var name: String?
        var show: Boolean?
        var geoidTiledTerrainProvider: PromiseResult<ArcGISTiledElevationTerrainProvider>?
        var cesium3dTilesetOptions: Cesium3DTileset.ConstructorOptions?
        var showFeatures: Boolean?
        var adjustMaterialAlphaMode: Boolean?
        var applySymbology: Boolean?
        var calculateNormals: Boolean?
    }

    companion object {
        /**
         * Creates an I3SDataProvider. Currently supported I3S versions are 1.6 and
         * 1.7/1.8 (OGC I3S 1.2).
         * ```
         * try {
         *   const i3sData = await I3SDataProvider.fromUrl(
         *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0"
         *   );
         *   viewer.scene.primitives.add(i3sData);
         * } catch (error) {
         *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
         * }
         * ```
         * ```
         * try {
         *   const geoidService = await ArcGISTiledElevationTerrainProvider.fromUrl(
         *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/EGM2008/ImageServer"
         *   );
         *   const i3sData = await I3SDataProvider.fromUrl(
         *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0", {
         *       geoidTiledTerrainProvider: geoidService
         *   });
         *   viewer.scene.primitives.add(i3sData);
         * } catch (error) {
         *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
         * }
         * ```
         * @param [url] The url of the I3S dataset, which should return an I3S scene object
         * @param [options] An object describing initialization options
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        suspend fun fromUrl(
            url: Resource,
            options: ConstructorOptions,
        ): I3SDataProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: ConstructorOptions,
        ): Promise<I3SDataProvider>
    }
}

inline fun I3SDataProvider(
    block: I3SDataProvider.ConstructorOptions.() -> Unit,
): I3SDataProvider =
    I3SDataProvider(options = jso(block))
