// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import js.promise.Promise

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
     * Gets or sets debugging and tracing of I3S fetches.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#traceFetches">Online Documentation</a>
     */
    var traceFetches: Boolean

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
     * Gets the promise that will be resolved when the I3S scene is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: Promise<I3SDataProvider>

    /**
     * When `true`, the I3S scene is loaded.
     * This is set to `true` right before [I3SDataProvider.readyPromise] is resolved.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * The resource used to fetch the I3S dataset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#resource">Online Documentation</a>
     */
    val resource: Resource

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
     * Initialization options for the I3SDataProvider constructor
     * @property [url] The url of the I3S dataset. Deprecated.
     * @property [name] The name of the I3S dataset.
     * @property [show] Determines if the dataset will be shown.
     *   Default value - `true`
     * @property [geoidTiledTerrainProvider] Tiled elevation provider describing an Earth Gravitational Model. If defined, geometry will be shifted based on the offsets given by this provider. Required to position I3S data sets with gravity-related height at the correct location.
     * @property [traceFetches] Debug option. When true, log a message whenever an I3S tile is fetched.
     *   Default value - `false`
     * @property [cesium3dTilesetOptions] Object containing options to pass to an internally created [Cesium3DTileset]. See [Cesium3DTileset] for list of valid properties. All options can be used with the exception of `url` and `show` which are overridden by values from I3SDataProvider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SDataProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: Resource?
        var name: String?
        var show: Boolean?
        var geoidTiledTerrainProvider: dynamic
        var traceFetches: Boolean?
        var cesium3dTilesetOptions: Cesium3DTileset.ConstructorOptions?
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
        fun fromUrl(
            url: Resource,
            options: ConstructorOptions,
        ): Promise<I3SDataProvider>
    }
}

inline fun I3SDataProvider(
    block: I3SDataProvider.ConstructorOptions.() -> Unit,
): I3SDataProvider =
    I3SDataProvider(options = jso(block))
