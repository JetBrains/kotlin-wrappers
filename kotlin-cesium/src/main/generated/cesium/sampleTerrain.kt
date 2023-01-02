// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray
import kotlin.js.Promise

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
 * const terrainProvider = createWorldTerrain();
 * const positions = [
 *     Cartographic.fromDegrees(86.925145, 27.988257),
 *     Cartographic.fromDegrees(87.0, 28.0)
 * ];
 * const promise = sampleTerrain(terrainProvider, 11, positions);
 * Promise.resolve(promise).then(function(updatedPositions) {
 *     // positions[0].height and positions[1].height have been updated.
 *     // updatedPositions is just a reference to positions.
 * });
 * ```
 * @param [terrainProvider] The terrain provider from which to query heights.
 * @param [level] The terrain level-of-detail from which to query terrain heights.
 * @param [positions] The positions to update with terrain heights.
 * @return A promise that resolves to the provided list of positions when terrain the query has completed.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/sampleTerrain.html">Online Documentation</a>
 */
external fun sampleTerrain(
    terrainProvider: TerrainProvider,
    level: Int,
    positions: ReadonlyArray<Cartographic>,
): Promise<ReadonlyArray<Cartographic>>
