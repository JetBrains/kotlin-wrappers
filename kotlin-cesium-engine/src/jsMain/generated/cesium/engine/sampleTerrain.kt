// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Initiates a terrain height query for an array of [Cartographic] positions by
 * requesting tiles from a terrain provider, sampling, and interpolating.  The interpolation
 * matches the triangles used to render the terrain at the specified level.  The query
 * happens asynchronously, so this function returns a promise that is resolved when
 * the query completes.  Each point height is modified in place.  If a height can not be
 * determined because no terrain data is available for the specified level at that location,
 * or another error occurs, the height is set to undefined.  As is typical of the
 * [Cartographic] type, the supplied height is a height above the reference ellipsoid
 * (such as [Ellipsoid.WGS84]) rather than an altitude above mean sea level.  In other
 * words, it will not necessarily be 0.0 if sampled in the ocean. This function needs the
 * terrain level of detail as input, if you need to get the altitude of the terrain as precisely
 * as possible (i.e. with maximum level of detail) use [sampleTerrainMostDetailed].
 * ```
 * // Query the terrain height of two Cartographic positions
 * const terrainProvider = await createWorldTerrainAsync();
 * const positions = [
 *     Cartographic.fromDegrees(86.925145, 27.988257),
 *     Cartographic.fromDegrees(87.0, 28.0)
 * ];
 * const updatedPositions = await sampleTerrain(terrainProvider, 11, positions);
 * // positions[0].height and positions[1].height have been updated.
 * // updatedPositions is just a reference to positions.
 *
 * // To handle tile errors, pass true for the rejectOnTileFail parameter.
 * try {
 *    const updatedPositions = await sampleTerrain(terrainProvider, 11, positions, true);
 * } catch (error) {
 *   // A tile request error occurred.
 * }
 * ```
 * @param [terrainProvider] The terrain provider from which to query heights.
 * @param [level] The terrain level-of-detail from which to query terrain heights.
 * @param [positions] The positions to update with terrain heights.
 * @param [rejectOnTileFail] If true, for any failed terrain tile requests, the promise will be rejected. If false, returned heights will be undefined.
 *   Default value - `false`
 * @return A promise that resolves to the provided list of positions when terrain the query has completed.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#sampleTerrain">Online Documentation</a>
 */
@JsAsync
external suspend fun sampleTerrain(
    terrainProvider: TerrainProvider,
    level: Int,
    positions: ReadonlyArray<Cartographic>,
    rejectOnTileFail: Boolean? = definedExternally,
): ReadonlyArray<Cartographic>

@JsName("sampleTerrain")
external fun sampleTerrainAsync(
    terrainProvider: TerrainProvider,
    level: Int,
    positions: ReadonlyArray<Cartographic>,
    rejectOnTileFail: Boolean? = definedExternally,
): Promise<ReadonlyArray<Cartographic>>
