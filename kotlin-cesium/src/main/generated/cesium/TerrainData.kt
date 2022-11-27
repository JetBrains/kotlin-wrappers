// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import js.core.ReadonlyArray

/**
 * Terrain data for a single tile.  This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html">Online Documentation</a>
 */
abstract external class TerrainData {
    /**
     * An array of credits for this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#credits">Online Documentation</a>
     */
    abstract var credits: ReadonlyArray<Credit>

    /**
     * The water mask included in this terrain data, if any.  A water mask is a rectangular
     * Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
     * Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#waterMask">Online Documentation</a>
     */
    abstract var waterMask: dynamic

    /**
     * Computes the terrain height at a specified longitude and latitude.
     * @param [rectangle] The rectangle covered by this terrain data.
     * @param [longitude] The longitude in radians.
     * @param [latitude] The latitude in radians.
     * @return The terrain height at the specified position.  If the position
     *   is outside the rectangle, this method will extrapolate the height, which is likely to be wildly
     *   incorrect for positions far outside the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#interpolateHeight">Online Documentation</a>
     */
    abstract fun interpolateHeight(
        rectangle: Rectangle,
        longitude: Double,
        latitude: Double,
    ): Double

    /**
     * Determines if a given child tile is available, based on the
     * [TerrainData.childTileMask].  The given child tile coordinates are assumed
     * to be one of the four children of this tile.  If non-child tile coordinates are
     * given, the availability of the southeast child tile is returned.
     * @param [thisX] The tile X coordinate of this (the parent) tile.
     * @param [thisY] The tile Y coordinate of this (the parent) tile.
     * @param [childX] The tile X coordinate of the child tile to check for availability.
     * @param [childY] The tile Y coordinate of the child tile to check for availability.
     * @return True if the child tile is available; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#isChildAvailable">Online Documentation</a>
     */
    abstract fun isChildAvailable(
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
     * @return A promise for upsampled terrain data for the descendant tile,
     *   or undefined if too many asynchronous upsample operations are in progress and the request has been
     *   deferred.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#upsample">Online Documentation</a>
     */
    abstract fun upsample(
        tilingScheme: TilingScheme,
        thisX: Double,
        thisY: Double,
        thisLevel: Int,
        descendantX: Double,
        descendantY: Double,
        descendantLevel: Int,
    ): kotlin.js.Promise<TerrainData>?

    /**
     * Gets a value indicating whether or not this terrain data was created by upsampling lower resolution
     * terrain data.  If this value is false, the data was obtained from some other source, such
     * as by downloading it from a remote server.  This method should return true for instances
     * returned from a call to [TerrainData.upsample].
     * @return True if this instance was created by upsampling; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TerrainData.html#wasCreatedByUpsampling">Online Documentation</a>
     */
    abstract fun wasCreatedByUpsampling(): Boolean
}
