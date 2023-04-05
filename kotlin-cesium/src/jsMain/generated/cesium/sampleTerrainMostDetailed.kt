// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import kotlin.js.Promise

/**
 * Initiates a sampleTerrain() request at the maximum available tile level for a terrain dataset.
 * ```
 * // Query the terrain height of two Cartographic positions
 * const terrainProvider = await createWorldTerrainAsync();
 * const positions = [
 *     Cartographic.fromDegrees(86.925145, 27.988257),
 *     Cartographic.fromDegrees(87.0, 28.0)
 * ];
 * const updatedPositions = await sampleTerrainMostDetailed(terrainProvider, positions);
 * // positions[0].height and positions[1].height have been updated.
 * // updatedPositions is just a reference to positions.
 * ```
 * @param [terrainProvider] The terrain provider from which to query heights.
 * @param [positions] The positions to update with terrain heights.
 * @return A promise that resolves to the provided list of positions when terrain the query has completed.  This
 *   promise will reject if the terrain provider's `availability` property is undefined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/sampleTerrainMostDetailed.html">Online Documentation</a>
 */
external fun sampleTerrainMostDetailed(
    terrainProvider: TerrainProvider,
    positions: ReadonlyArray<Cartographic>,
): Promise<ReadonlyArray<Cartographic>>
