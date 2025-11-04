// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.typedarrays.Uint8Array

/**
 * Terrain data for a single tile where the terrain data is represented as a glb (binary glTF).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html">Online Documentation</a>
 */
external class Cesium3DTilesTerrainData(
    options: ConstructorOptions,
) : TerrainData {
    /**
     * @property [gltf] The parsed glTF JSON.
     * @property [minimumHeight] The minimum terrain height within the tile, in meters above the ellipsoid.
     * @property [maximumHeight] The maximum terrain height within the tile, in meters above the ellipsoid.
     * @property [boundingSphere] A sphere bounding all of the vertices in the mesh.
     * @property [orientedBoundingBox] An oriented bounding box containing all of the vertices in the mesh.
     * @property [horizonOcclusionPoint] The horizon occlusion point of the mesh. If this point
     *   is below the horizon, the entire tile is assumed to be below the horizon as well.
     *   The point is expressed in ellipsoid-scaled coordinates.
     * @property [skirtHeight] The height of the skirt to add on the edges of the tile.
     * @property [requestVertexNormals] Indicates whether normals should be loaded.
     *   Default value - `false`
     * @property [requestWaterMask] Indicates whether water mask data should be loaded.
     *   Default value - `false`
     * @property [credits] Array of credits for this tile.
     * @property [childTileMask] A bit mask indicating which of this tile's four children exist.
     *   If a child's bit is set, geometry will be requested for that tile as well when it
     *   is needed.  If the bit is cleared, the child tile is not requested and geometry is
     *   instead upsampled from the parent.
     *   Default value - `15`
     * @property [waterMask] The buffer containing the water mask.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val gltf: ReadonlyRecord<JsString, JsAny>
        val minimumHeight: Double
        val maximumHeight: Double
        val boundingSphere: BoundingSphere
        val orientedBoundingBox: OrientedBoundingBox
        val horizonOcclusionPoint: Cartesian3
        val skirtHeight: Double
        val requestVertexNormals: Boolean?
        val requestWaterMask: Boolean?
        val credits: ReadonlyArray<Credit>?
        val childTileMask: Int?
        val waterMask: Uint8Array<*>?
    }

    /**
     * An array of credits for this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#credits">Online Documentation</a>
     */
    override var credits: ReadonlyArray<Credit>

    /**
     * The water mask included in this terrain data, if any. A water mask is a rectangular
     * Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
     * Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#waterMask">Online Documentation</a>
     */
    override var waterMask: JsAny? /* Uint8Array | HTMLImageElement | HTMLCanvasElement | ImageBitmap | undefined */

    /**
     * Returns the terrain height at a specified longitude and latitude, or undefined if the mesh is undefined.
     * @param [rectangle] The rectangle covered by this terrain data.
     * @param [longitude] The longitude in radians.
     * @param [latitude] The latitude in radians.
     * @return The terrain height at the specified position, or undefined if the mesh is undefined.
     *   If the position is outside the rectangle, this method will extrapolate the height,
     *   which is likely to be wildly incorrect for positions far outside the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#interpolateHeight">Online Documentation</a>
     */
    override fun interpolateHeight(
        rectangle: Rectangle,
        longitude: Double,
        latitude: Double,
    ): Double

    /**
     * Determines if a given child tile is available, based on the
     * [TerrainData.childTileMask]. The given child tile coordinates are assumed
     * to be one of the four children of this tile. If non-child tile coordinates are
     * given, the availability of the southeast child tile is returned.
     * @param [thisX] The tile X coordinate of this (the parent) tile.
     * @param [thisY] The tile Y coordinate of this (the parent) tile.
     * @param [childX] The tile X coordinate of the child tile to check for availability.
     * @param [childY] The tile Y coordinate of the child tile to check for availability.
     * @return True if the child tile is available; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#isChildAvailable">Online Documentation</a>
     */
    override fun isChildAvailable(
        thisX: Double,
        thisY: Double,
        childX: Double,
        childY: Double,
    ): Boolean

    /**
     * Upsamples this terrain data for use by a descendant tile.
     * @param [tilingScheme] The tiling scheme of this terrain data.
     * @param [thisX] The X coordinate of this tile in the tiling scheme.
     * @param [thisY] The Y coordinate of this tile in the tiling scheme.
     * @param [thisLevel] The level of this tile in the tiling scheme.
     * @param [descendantX] The X coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantY] The Y coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantLevel] The level within the tiling scheme of the descendant tile for which we are upsampling.
     * @return A promise for upsampled terrain data for the descendant tile, or undefined if createMesh has not been called yet or too many asynchronous upsample operations are in progress and the request has been deferred.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#upsample">Online Documentation</a>
     */
    override fun upsampleAsync(
        tilingScheme: TilingScheme,
        thisX: Double,
        thisY: Double,
        thisLevel: Int,
        descendantX: Double,
        descendantY: Double,
        descendantLevel: Int,
    ): Promise<TerrainData>?

    /**
     * Gets a value indicating whether or not this terrain data was created by upsampling lower resolution
     * terrain data. If this value is false, the data was obtained from some other source, such
     * as by downloading it from a remote server. This method should return true for instances
     * returned from a call to [Cesium3DTilesTerrainData.upsample].
     * @return True if this instance was created by upsampling; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesTerrainData.html#wasCreatedByUpsampling">Online Documentation</a>
     */
    override fun wasCreatedByUpsampling(): Boolean
}
