// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Creates a [CesiumTerrainProvider] instance for the [Cesium World Terrain](https://cesium.com/content/#cesium-world-terrain).
 * ```
 * // Create Cesium World Terrain with default settings
 * const viewer = new Viewer('cesiumContainer', {
 *     terrainProvider : createWorldTerrain();
 * });
 * ```
 * ```
 * // Create Cesium World Terrain with water and normals.
 * const viewer1 = new Viewer('cesiumContainer', {
 *     terrainProvider : createWorldTerrain({
 *         requestWaterMask : true,
 *         requestVertexNormals : true
 *     });
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createWorldTerrain.html">Online Documentation</a>
 */
external fun createWorldTerrain(options: CreateWorldTerrainOptions? = definedExternally): CesiumTerrainProvider

/**
 * @property [requestVertexNormals] Flag that indicates if the client should request additional lighting information from the server if available.
 *   Default value - `false`
 * @property [requestWaterMask] Flag that indicates if the client should request per tile water masks from the server if available.
 *   Default value - `false`
 */
external interface CreateWorldTerrainOptions {
    var requestVertexNormals: Boolean?
    var requestWaterMask: Boolean?
}
