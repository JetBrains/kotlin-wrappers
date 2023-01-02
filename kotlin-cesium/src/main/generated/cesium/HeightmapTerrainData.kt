// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.typedarrays.Uint8Array
import kotlin.js.Promise

/**
 * Terrain data for a single tile where the terrain data is represented as a heightmap.  A heightmap
 * is a rectangular array of heights in row-major order from north to south and west to east.
 * ```
 * const buffer = ...
 * const heightBuffer = new Uint16Array(buffer, 0, that._heightmapWidth * that._heightmapWidth);
 * const childTileMask = new Uint8Array(buffer, heightBuffer.byteLength, 1)[0];
 * const waterMask = new Uint8Array(buffer, heightBuffer.byteLength + 1, buffer.byteLength - heightBuffer.byteLength - 1);
 * const terrainData = new HeightmapTerrainData({
 *   buffer : heightBuffer,
 *   width : 65,
 *   height : 65,
 *   childTileMask : childTileMask,
 *   waterMask : waterMask
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html">Online Documentation</a>
 */
external class HeightmapTerrainData(options: ConstructorOptions) : TerrainData {
    /**
     * @property [buffer] The buffer containing height data.
     * @property [width] The width (longitude direction) of the heightmap, in samples.
     * @property [height] The height (latitude direction) of the heightmap, in samples.
     * @property [childTileMask] A bit mask indicating which of this tile's four children exist.
     *   If a child's bit is set, geometry will be requested for that tile as well when it
     *   is needed.  If the bit is cleared, the child tile is not requested and geometry is
     *   instead upsampled from the parent.
     *   Default value - `15`
     * @property [waterMask] The water mask included in this terrain data, if any.  A water mask is a square
     *   Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
     *   Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
     * @property [structure] An object describing the structure of the height data.
     * @property [structure.heightScale] The factor by which to multiply height samples in order to obtain
     *   the height above the heightOffset, in meters.  The heightOffset is added to the resulting
     *   height after multiplying by the scale.
     *   Default value - `1.0`
     * @property [structure.heightOffset] The offset to add to the scaled height to obtain the final
     *   height in meters.  The offset is added after the height sample is multiplied by the
     *   heightScale.
     *   Default value - `0.0`
     * @property [structure.elementsPerHeight] The number of elements in the buffer that make up a single height
     *   sample.  This is usually 1, indicating that each element is a separate height sample.  If
     *   it is greater than 1, that number of elements together form the height sample, which is
     *   computed according to the structure.elementMultiplier and structure.isBigEndian properties.
     *   Default value - `1`
     * @property [structure.stride] The number of elements to skip to get from the first element of
     *   one height to the first element of the next height.
     *   Default value - `1`
     * @property [structure.elementMultiplier] The multiplier used to compute the height value when the
     *   stride property is greater than 1.  For example, if the stride is 4 and the strideMultiplier
     *   is 256, the height is computed as follows:
     *   `height = buffer[index] + buffer[index + 1] * 256 + buffer[index + 2] * 256 * 256 + buffer[index + 3] * 256 * 256 * 256`
     *   This is assuming that the isBigEndian property is false.  If it is true, the order of the
     *   elements is reversed.
     *   Default value - `256.0`
     * @property [structure.isBigEndian] Indicates endianness of the elements in the buffer when the
     *   stride property is greater than 1.  If this property is false, the first element is the
     *   low-order element.  If it is true, the first element is the high-order element.
     *   Default value - `false`
     * @property [structure.lowestEncodedHeight] The lowest value that can be stored in the height buffer.  Any heights that are lower
     *   than this value after encoding with the `heightScale` and `heightOffset` are clamped to this value.  For example, if the height
     *   buffer is a `Uint16Array`, this value should be 0 because a `Uint16Array` cannot store negative numbers.  If this parameter is
     *   not specified, no minimum value is enforced.
     * @property [structure.highestEncodedHeight] The highest value that can be stored in the height buffer.  Any heights that are higher
     *   than this value after encoding with the `heightScale` and `heightOffset` are clamped to this value.  For example, if the height
     *   buffer is a `Uint16Array`, this value should be `256 * 256 - 1` or 65535 because a `Uint16Array` cannot store numbers larger
     *   than 65535.  If this parameter is not specified, no maximum value is enforced.
     * @property [encoding] The encoding that is used on the buffer.
     *   Default value - [HeightmapEncoding.NONE]
     * @property [createdByUpsampling] True if this instance was created by upsampling another instance;
     *   otherwise, false.
     *   Default value - `false`
     */
    interface ConstructorOptions {
        var buffer: dynamic
        var width: Double
        var height: Double
        var childTileMask: Int?
        var waterMask: Uint8Array?
        var structure: ConstructorOptionsStructure?
        var encoding: HeightmapEncoding?
        var createdByUpsampling: Boolean?
    }

    interface ConstructorOptionsStructure {
        var heightScale: Double?
        var heightOffset: Double?
        var elementsPerHeight: Int?
        var stride: Int?
        var elementMultiplier: Double?
        var isBigEndian: Boolean?
        var lowestEncodedHeight: Double?
        var highestEncodedHeight: Double?
    }

    /**
     * An array of credits for this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#credits">Online Documentation</a>
     */
    override var credits: ReadonlyArray<Credit>

    /**
     * The water mask included in this terrain data, if any.  A water mask is a square
     * Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
     * Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#waterMask">Online Documentation</a>
     */
    override var waterMask: dynamic

    /**
     * Computes the terrain height at a specified longitude and latitude.
     * @param [rectangle] The rectangle covered by this terrain data.
     * @param [longitude] The longitude in radians.
     * @param [latitude] The latitude in radians.
     * @return The terrain height at the specified position.  If the position
     *   is outside the rectangle, this method will extrapolate the height, which is likely to be wildly
     *   incorrect for positions far outside the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#interpolateHeight">Online Documentation</a>
     */
    override fun interpolateHeight(
        rectangle: Rectangle,
        longitude: Double,
        latitude: Double,
    ): Double

    /**
     * Upsamples this terrain data for use by a descendant tile.  The resulting instance will contain a subset of the
     * height samples in this instance, interpolated if necessary.
     * @param [tilingScheme] The tiling scheme of this terrain data.
     * @param [thisX] The X coordinate of this tile in the tiling scheme.
     * @param [thisY] The Y coordinate of this tile in the tiling scheme.
     * @param [thisLevel] The level of this tile in the tiling scheme.
     * @param [descendantX] The X coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantY] The Y coordinate within the tiling scheme of the descendant tile for which we are upsampling.
     * @param [descendantLevel] The level within the tiling scheme of the descendant tile for which we are upsampling.
     * @return A promise for upsampled heightmap terrain data for the descendant tile,
     *   or undefined if the mesh is unavailable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#upsample">Online Documentation</a>
     */
    override fun upsample(
        tilingScheme: TilingScheme,
        thisX: Double,
        thisY: Double,
        thisLevel: Int,
        descendantX: Double,
        descendantY: Double,
        descendantLevel: Int,
    ): Promise<HeightmapTerrainData>?

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#isChildAvailable">Online Documentation</a>
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeightmapTerrainData.html#wasCreatedByUpsampling">Online Documentation</a>
     */
    override fun wasCreatedByUpsampling(): Boolean
}

inline fun HeightmapTerrainData(
    block: HeightmapTerrainData.ConstructorOptions.() -> Unit,
): HeightmapTerrainData {
    val options: HeightmapTerrainData.ConstructorOptions = js("({})")
    block(options)
    return HeightmapTerrainData(options)
}
