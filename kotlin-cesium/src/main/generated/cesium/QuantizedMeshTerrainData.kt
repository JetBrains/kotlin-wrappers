// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Terrain data for a single tile where the terrain data is represented as a quantized mesh.  A quantized
 * mesh consists of three vertex attributes, longitude, latitude, and height.  All attributes are expressed
 * as 16-bit values in the range 0 to 32767.  Longitude and latitude are zero at the southwest corner
 * of the tile and 32767 at the northeast corner.  Height is zero at the minimum height in the tile
 * and 32767 at the maximum height in the tile.
 * ```
 * const data = new QuantizedMeshTerrainData({
 *     minimumHeight : -100,
 *     maximumHeight : 2101,
 *     quantizedVertices : new Uint16Array([// order is SW NW SE NE
 *                                          // longitude
 *                                          0, 0, 32767, 32767,
 *                                          // latitude
 *                                          0, 32767, 0, 32767,
 *                                          // heights
 *                                          16384, 0, 32767, 16384]),
 *     indices : new Uint16Array([0, 3, 1,
 *                                0, 2, 3]),
 *     boundingSphere : new BoundingSphere(new Cartesian3(1.0, 2.0, 3.0), 10000),
 *     orientedBoundingBox : new OrientedBoundingBox(new Cartesian3(1.0, 2.0, 3.0), Matrix3.fromRotationX(Math.PI, new Matrix3())),
 *     horizonOcclusionPoint : new Cartesian3(3.0, 2.0, 1.0),
 *     westIndices : [0, 1],
 *     southIndices : [0, 1],
 *     eastIndices : [2, 3],
 *     northIndices : [1, 3],
 *     westSkirtHeight : 1.0,
 *     southSkirtHeight : 1.0,
 *     eastSkirtHeight : 1.0,
 *     northSkirtHeight : 1.0
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html">Online Documentation</a>
 */
external class QuantizedMeshTerrainData(options: ConstructorOptions) : TerrainData {
    /**
     * @property [quantizedVertices] The buffer containing the quantized mesh.
     * @property [indices] The indices specifying how the quantized vertices are linked
     *   together into triangles.  Each three indices specifies one triangle.
     * @property [minimumHeight] The minimum terrain height within the tile, in meters above the ellipsoid.
     * @property [maximumHeight] The maximum terrain height within the tile, in meters above the ellipsoid.
     * @property [boundingSphere] A sphere bounding all of the vertices in the mesh.
     * @property [orientedBoundingBox] An OrientedBoundingBox bounding all of the vertices in the mesh.
     * @property [horizonOcclusionPoint] The horizon occlusion point of the mesh.  If this point
     *   is below the horizon, the entire tile is assumed to be below the horizon as well.
     *   The point is expressed in ellipsoid-scaled coordinates.
     * @property [westIndices] The indices of the vertices on the western edge of the tile.
     * @property [southIndices] The indices of the vertices on the southern edge of the tile.
     * @property [eastIndices] The indices of the vertices on the eastern edge of the tile.
     * @property [northIndices] The indices of the vertices on the northern edge of the tile.
     * @property [westSkirtHeight] The height of the skirt to add on the western edge of the tile.
     * @property [southSkirtHeight] The height of the skirt to add on the southern edge of the tile.
     * @property [eastSkirtHeight] The height of the skirt to add on the eastern edge of the tile.
     * @property [northSkirtHeight] The height of the skirt to add on the northern edge of the tile.
     * @property [childTileMask] A bit mask indicating which of this tile's four children exist.
     *   If a child's bit is set, geometry will be requested for that tile as well when it
     *   is needed.  If the bit is cleared, the child tile is not requested and geometry is
     *   instead upsampled from the parent.
     *   Default value - `15`
     * @property [createdByUpsampling] True if this instance was created by upsampling another instance;
     *   otherwise, false.
     *   Default value - `false`
     * @property [encodedNormals] The buffer containing per vertex normals, encoded using 'oct' encoding
     * @property [waterMask] The buffer containing the watermask.
     * @property [credits] Array of credits for this tile.
     */
    interface ConstructorOptions {
        var quantizedVertices: kotlinx.js.Uint16Array
        var indices: dynamic
        var minimumHeight: Double
        var maximumHeight: Double
        var boundingSphere: BoundingSphere
        var orientedBoundingBox: OrientedBoundingBox?
        var horizonOcclusionPoint: Cartesian3
        var westIndices: ReadonlyArray<Double>
        var southIndices: ReadonlyArray<Double>
        var eastIndices: ReadonlyArray<Double>
        var northIndices: ReadonlyArray<Double>
        var westSkirtHeight: Double
        var southSkirtHeight: Double
        var eastSkirtHeight: Double
        var northSkirtHeight: Double
        var childTileMask: Int?
        var createdByUpsampling: Boolean?
        var encodedNormals: kotlinx.js.Uint8Array?
        var waterMask: kotlinx.js.Uint8Array?
        var credits: ReadonlyArray<Credit>?
    }

    /**
     * An array of credits for this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#credits">Online Documentation</a>
     */
    override var credits: ReadonlyArray<Credit>

    /**
     * The water mask included in this terrain data, if any.  A water mask is a rectangular
     * Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
     * Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#waterMask">Online Documentation</a>
     */
    override var waterMask: dynamic

    /**
     * Upsamples this terrain data for use by a descendant tile.  The resulting instance will contain a subset of the
     * vertices in this instance, interpolated if necessary.
     * @param [tilingScheme] The tiling scheme of this terrain data.
     * @param [thisX] The X coordinate of this tile in the tiling scheme.
     * @param [thisY] The Y coordinate of this tile in the tiling scheme.
     * @param [thisLevel] The level of this tile in the tiling scheme.
     * @param [descendantX] The X coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantY] The Y coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantLevel] The level within the tiling scheme of the descendant tile for which we are upsampling.
     * @return A promise for upsampled heightmap terrain data for the descendant tile,
     *   or undefined if too many asynchronous upsample operations are in progress and the request has been
     *   deferred.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#upsample">Online Documentation</a>
     */
    override fun upsample(
        tilingScheme: TilingScheme,
        thisX: Double,
        thisY: Double,
        thisLevel: Int,
        descendantX: Double,
        descendantY: Double,
        descendantLevel: Int,
    ): kotlin.js.Promise<QuantizedMeshTerrainData>?

    /**
     * Computes the terrain height at a specified longitude and latitude.
     * @param [rectangle] The rectangle covered by this terrain data.
     * @param [longitude] The longitude in radians.
     * @param [latitude] The latitude in radians.
     * @return The terrain height at the specified position.  The position is clamped to
     *   the rectangle, so expect incorrect results for positions far outside the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#interpolateHeight">Online Documentation</a>
     */
    override fun interpolateHeight(
        rectangle: Rectangle,
        longitude: Double,
        latitude: Double,
    ): Double

    /**
     * Determines if a given child tile is available, based on the
     * [HeightmapTerrainData.childTileMask].  The given child tile coordinates are assumed
     * to be one of the four children of this tile.  If non-child tile coordinates are
     * given, the availability of the southeast child tile is returned.
     * @param [thisX] The tile X coordinate of this (the parent) tile.
     * @param [thisY] The tile Y coordinate of this (the parent) tile.
     * @param [childX] The tile X coordinate of the child tile to check for availability.
     * @param [childY] The tile Y coordinate of the child tile to check for availability.
     * @return True if the child tile is available; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#isChildAvailable">Online Documentation</a>
     */
    override fun isChildAvailable(
        thisX: Double,
        thisY: Double,
        childX: Double,
        childY: Double,
    ): Boolean

    /**
     * Gets a value indicating whether or not this terrain data was created by upsampling lower resolution
     * terrain data.  If this value is false, the data was obtained from some other source, such
     * as by downloading it from a remote server.  This method should return true for instances
     * returned from a call to [HeightmapTerrainData.upsample].
     * @return True if this instance was created by upsampling; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/QuantizedMeshTerrainData.html#wasCreatedByUpsampling">Online Documentation</a>
     */
    override fun wasCreatedByUpsampling(): Boolean
}

inline fun QuantizedMeshTerrainData(
    block: QuantizedMeshTerrainData.ConstructorOptions.() -> Unit,
): QuantizedMeshTerrainData {
    val options: QuantizedMeshTerrainData.ConstructorOptions = js("({})")
    block(options)
    return QuantizedMeshTerrainData(options)
}
