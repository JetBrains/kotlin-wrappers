// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import kotlin.js.Promise

/**
 * Creates a [CesiumTerrainProvider] instance for the [Cesium World Terrain](https://cesium.com/content/#cesium-world-terrain).
 * ```
 * // Create Cesium World Terrain with default settings
 * try {
 *   const viewer = new Viewer("cesiumContainer", {
 *     terrainProvider: await createWorldTerrainAsync();
 *   });
 * } catch (error) {
 *   console.log(error);
 * }
 * ```
 * ```
 * // Create Cesium World Terrain with water and normals.
 * try {
 *   const viewer1 = new Viewer("cesiumContainer", {
 *     terrainProvider: await createWorldTerrainAsync({
 *       requestWaterMask: true,
 *       requestVertexNormals: true
 *     });
 *   });
 * } catch (error) {
 *   console.log(error);
 * }
 * ```
 * @return A promise that resolves to the created CesiumTerrainProvider
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createWorldTerrainAsync.html">Online Documentation</a>
 */
external fun createWorldTerrainAsync(options: CreateWorldTerrainAsyncOptions? = definedExternally): Promise<CesiumTerrainProvider>

/**
 * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server if available.
 *   Default value - `false`
 * @property [requestWaterMask] Flag that indicates if the client should request per tile water masks from the server if available.
 *   Default value - `false`
 */
external interface CreateWorldTerrainAsyncOptions {
    var requestVertexNormals: Boolean?
    var requestWaterMask: Boolean?
}
