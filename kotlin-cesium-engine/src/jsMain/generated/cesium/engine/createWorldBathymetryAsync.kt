// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Creates a [CesiumTerrainProvider] instance for the [Cesium World Bathymetry](https://cesium.com/content/#cesium-world-bathymetry).
 * ```
 * // Create Cesium World Bathymetry with default settings
 * try {
 *   const viewer = new Viewer("cesiumContainer", {
 *     terrainProvider: await createWorldBathymetryAsync();
 *   });
 * } catch (error) {
 *   console.log(error);
 * }
 * ```
 * ```
 * // Create Cesium World Bathymetry with normals.
 * try {
 *   const viewer1 = new Viewer("cesiumContainer", {
 *     terrainProvider: await createWorldBathymetryAsync({
 *       requestVertexNormals: true
 *     });
 *   });
 * } catch (error) {
 *   console.log(error);
 * }
 * ```
 * @return A promise that resolves to the created CesiumTerrainProvider
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#createWorldBathymetryAsync">Online Documentation</a>
 */
@JsAsync
external suspend fun createWorldBathymetry(options: CreateWorldBathymetryAsyncOptions? = definedExternally): CesiumTerrainProvider

external fun createWorldBathymetryAsync(options: CreateWorldBathymetryAsyncOptions? = definedExternally): Promise<CesiumTerrainProvider>

/**
 * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server if available.
 *   Default value - `false`
 */
@JsPlainObject
external interface CreateWorldBathymetryAsyncOptions {
    val requestVertexNormals: Boolean?
}
