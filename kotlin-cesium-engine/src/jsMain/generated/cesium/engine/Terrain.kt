// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium.engine

import js.promise.Promise

/**
 * A helper to manage async operations of a terrain provider.
 * ```
 * // Create
 * const viewer = new Viewer("cesiumContainer", {
 *   terrain: new Terrain(CesiumTerrainProvider.fromUrl("https://myTestTerrain.com"));
 * });
 * ```
 * ```
 * // Handle loading events
 * const terrain = new Terrain(CesiumTerrainProvider.fromUrl("https://myTestTerrain.com"));
 *
 * scene.setTerrain(terrain);
 *
 * terrain.readyEvent.addEventListener(provider => {
 *   scene.globe.enableLighting = true;
 *
 *   terrain.provider.errorEvent.addEventListener(error => {
 *     alert(`Encountered an error while loading terrain tiles! ${error}`);
 *   });
 * });
 *
 * terrain.errorEvent.addEventListener(error => {
 *   alert(`Encountered an error while creating terrain! ${error}`);
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html">Online Documentation</a>
 *
 * @constructor
 * @param [terrainProviderPromise] A promise which resolves to a terrain provider
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html">Online Documentation</a>
 */
external class Terrain(terrainProviderPromise: Promise<TerrainProvider>) {
    /**
     * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of the thrown error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: Event<TerrainErrorEventCallback>

    /**
     * Gets an event that is raised when the terrain provider has been successfully created. Event listeners
     * are passed the created instance of [TerrainProvider].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#readyEvent">Online Documentation</a>
     */
    val readyEvent: Event<TerrainReadyEventCallback>

    /**
     * Returns true when the terrain provider has been successfully created. Otherwise, returns false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * The terrain provider providing surface geometry to a globe. Do not use until [Terrain.readyEvent] is raised.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#provider">Online Documentation</a>
     */
    val provider: TerrainProvider

    companion object {
        /**
         * Creates a [Terrain] instance for [Cesium World Terrain](https://cesium.com/content/#cesium-world-terrain).
         * ```
         * // Create Cesium World Terrain with default settings
         * const viewer = new Viewer("cesiumContainer", {
         *   terrain: fromWorldTerrain()
         * });
         * ```
         * ```
         * // Create Cesium World Terrain with water and normals.
         * const viewer1 = new Viewer("cesiumContainer", {
         *   terrain: fromWorldTerrain({
         *      requestWaterMask: true,
         *      requestVertexNormals: true
         *    });
         * });
         * ```
         * ```
         * // Handle loading events
         * const terrain = Terrain.fromWorldTerrain();
         *
         * scene.setTerrain(terrain);
         *
         * terrain.readyEvent.addEventListener(provider => {
         *   scene.globe.enableLighting = true;
         *
         *   terrain.provider.errorEvent.addEventListener(error => {
         *     alert(`Encountered an error while loading terrain tiles! ${error}`);
         *   });
         * });
         *
         * terrain.errorEvent.addEventListener(error => {
         *   alert(`Encountered an error while creating terrain! ${error}`);
         * });
         * ```
         * @return An asynchronous helper object for a CesiumTerrainProvider
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#.fromWorldTerrain">Online Documentation</a>
         */
        fun fromWorldTerrain(options: FromWorldTerrainOptions? = definedExternally): Terrain

        /**
         * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server if available.
         *   Default value - `false`
         * @property [requestWaterMask] Flag that indicates if the client should request per tile water masks from the server if available.
         *   Default value - `false`
         */
        interface FromWorldTerrainOptions {
            var requestVertexNormals: Boolean?
            var requestWaterMask: Boolean?
        }

        /**
         * Creates a [Terrain] instance for [Cesium World Bathymetry](https://cesium.com/content/#cesium-world-bathymetry).
         * ```
         * // Create Cesium World Bathymetry with default settings
         * const viewer = new Viewer("cesiumContainer", {
         *   terrain: fromWorldBathymetry)
         * });
         * ```
         * ```
         * // Create Cesium World Terrain with normals.
         * const viewer1 = new Viewer("cesiumContainer", {
         *   terrain: fromWorldBathymetry({
         *      requestVertexNormals: true
         *    });
         * });
         * ```
         * ```
         * // Handle loading events
         * const bathymetry = Terrain.fromWorldBathymetry();
         *
         * scene.setTerrain(bathymetry);
         *
         * bathymetry.readyEvent.addEventListener(provider => {
         *   scene.globe.enableLighting = true;
         *
         *   bathymetry.provider.errorEvent.addEventListener(error => {
         *     alert(`Encountered an error while loading bathymetric terrain tiles! ${error}`);
         *   });
         * });
         *
         * bathymetry.errorEvent.addEventListener(error => {
         *   alert(`Encountered an error while creating bathymetric terrain! ${error}`);
         * });
         * ```
         * @return An asynchronous helper object for a CesiumTerrainProvider
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#.fromWorldBathymetry">Online Documentation</a>
         */
        fun fromWorldBathymetry(options: FromWorldBathymetryOptions? = definedExternally): Terrain

        /**
         * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server if available.
         *   Default value - `false`
         */
        interface FromWorldBathymetryOptions {
            var requestVertexNormals: Boolean?
        }
    }
}

/**
 * A function that is called when an error occurs.
 * @param [err] An object holding details about the error that occurred.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#.TerrainErrorEventCallback">Online Documentation</a>
 */
typealias TerrainErrorEventCallback = (err: Error) -> Unit

/**
 * A function that is called when the provider has been created
 * @param [provider] The created terrain provider.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Terrain.html#.TerrainReadyEventCallback">Online Documentation</a>
 */
typealias TerrainReadyEventCallback = (provider: TerrainProvider) -> Unit
