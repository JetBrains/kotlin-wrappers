// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.core.ReadonlyArray
import js.promise.Promise

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
 *
 * // To handle tile errors, pass true for the rejectOnTileFail parameter.
 * try {
 *    const updatedPositions = await sampleTerrainMostDetailed(terrainProvider, positions, true);
 * } catch (error) {
 *   // A tile request error occurred.
 * }
 * ```
 * @param [terrainProvider] The terrain provider from which to query heights.
 * @param [positions] The positions to update with terrain heights.
 * @param [rejectOnTileFail] If true, for a failed terrain tile request the promise will be rejected. If false, returned heights will be undefined.
 *   Default value - `false`
 * @return A promise that resolves to the provided list of positions when terrain the query has completed.  This
 *   promise will reject if the terrain provider's `availability` property is undefined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/sampleTerrainMostDetailed.html">Online Documentation</a>
 */
external fun sampleTerrainMostDetailed(
    terrainProvider: TerrainProvider,
    positions: ReadonlyArray<Cartographic>,
    rejectOnTileFail: Boolean? = definedExternally,
): Promise<ReadonlyArray<Cartographic>>
