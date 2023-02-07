// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Reports the availability of tiles in a [TilingScheme].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html">Online Documentation</a>
 *
 * @constructor
 * @param [tilingScheme] The tiling scheme in which to report availability.
 * @param [maximumLevel] The maximum tile level that is potentially available.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html">Online Documentation</a>
 */
external class TileAvailability(
    tilingScheme: TilingScheme,
    maximumLevel: Int,
) {
    /**
     * Marks a rectangular range of tiles in a particular level as being available.  For best performance,
     * add your ranges in order of increasing level.
     * @param [level] The level.
     * @param [startX] The X coordinate of the first available tiles at the level.
     * @param [startY] The Y coordinate of the first available tiles at the level.
     * @param [endX] The X coordinate of the last available tiles at the level.
     * @param [endY] The Y coordinate of the last available tiles at the level.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html#addAvailableTileRange">Online Documentation</a>
     */
    fun addAvailableTileRange(
        level: Int,
        startX: Double,
        startY: Double,
        endX: Double,
        endY: Double,
    )

    /**
     * Determines the level of the most detailed tile covering the position.  This function
     * usually completes in time logarithmic to the number of rectangles added with
     * [TileAvailability.addAvailableTileRange].
     * @param [position] The position for which to determine the maximum available level.  The height component is ignored.
     * @return The level of the most detailed tile covering the position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html#computeMaximumLevelAtPosition">Online Documentation</a>
     */
    fun computeMaximumLevelAtPosition(position: Cartographic): Double

    /**
     * Finds the most detailed level that is available _everywhere_ within a given rectangle.  More detailed
     * tiles may be available in parts of the rectangle, but not the whole thing.  The return value of this
     * function may be safely passed to [sampleTerrain] for any position within the rectangle.  This function
     * usually completes in time logarithmic to the number of rectangles added with
     * [TileAvailability.addAvailableTileRange].
     * @param [rectangle] The rectangle.
     * @return The best available level for the entire rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html#computeBestAvailableLevelOverRectangle">Online Documentation</a>
     */
    fun computeBestAvailableLevelOverRectangle(rectangle: Rectangle): Double

    /**
     * Determines if a particular tile is available.
     * @param [level] The tile level to check.
     * @param [x] The X coordinate of the tile to check.
     * @param [y] The Y coordinate of the tile to check.
     * @return True if the tile is available; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html#isTileAvailable">Online Documentation</a>
     */
    fun isTileAvailable(
        level: Int,
        x: Double,
        y: Double,
    ): Boolean

    /**
     * Computes a bit mask indicating which of a tile's four children exist.
     * If a child's bit is set, a tile is available for that child.  If it is cleared,
     * the tile is not available.
     * @param [level] The level of the parent tile.
     * @param [x] The X coordinate of the parent tile.
     * @param [y] The Y coordinate of the parent tile.
     * @return The bit mask indicating child availability.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileAvailability.html#computeChildMaskForTile">Online Documentation</a>
     */
    fun computeChildMaskForTile(
        level: Int,
        x: Double,
        y: Double,
    ): Double
}
