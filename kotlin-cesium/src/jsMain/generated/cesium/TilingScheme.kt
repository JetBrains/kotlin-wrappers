// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A tiling scheme for geometry or imagery on the surface of an ellipsoid.  At level-of-detail zero,
 * the coarsest, least-detailed level, the number of tiles is configurable.
 * At level of detail one, each of the level zero tiles has four children, two in each direction.
 * At level of detail two, each of the level one tiles has four children, two in each direction.
 * This continues for as many levels as are present in the geometry or imagery source.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html">Online Documentation</a>
 */
abstract external class TilingScheme {
    /**
     * Gets the ellipsoid that is tiled by the tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#ellipsoid">Online Documentation</a>
     */
    abstract var ellipsoid: Ellipsoid

    /**
     * Gets the rectangle, in radians, covered by this tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#rectangle">Online Documentation</a>
     */
    abstract var rectangle: Rectangle

    /**
     * Gets the map projection used by the tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#projection">Online Documentation</a>
     */
    abstract var projection: MapProjection

    /**
     * Gets the total number of tiles in the X direction at a specified level-of-detail.
     * @param [level] The level-of-detail.
     * @return The number of tiles in the X direction at the given level.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#getNumberOfXTilesAtLevel">Online Documentation</a>
     */
    abstract fun getNumberOfXTilesAtLevel(level: Int): Int

    /**
     * Gets the total number of tiles in the Y direction at a specified level-of-detail.
     * @param [level] The level-of-detail.
     * @return The number of tiles in the Y direction at the given level.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#getNumberOfYTilesAtLevel">Online Documentation</a>
     */
    abstract fun getNumberOfYTilesAtLevel(level: Int): Int

    /**
     * Transforms a rectangle specified in geodetic radians to the native coordinate system
     * of this tiling scheme.
     * @param [rectangle] The rectangle to transform.
     * @param [result] The instance to which to copy the result, or undefined if a new instance
     *   should be created.
     * @return The specified 'result', or a new object containing the native rectangle if 'result'
     *   is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#rectangleToNativeRectangle">Online Documentation</a>
     */
    abstract fun rectangleToNativeRectangle(
        rectangle: Rectangle,
        result: Rectangle? = definedExternally,
    ): Rectangle

    /**
     * Converts tile x, y coordinates and level to a rectangle expressed in the native coordinates
     * of the tiling scheme.
     * @param [x] The integer x coordinate of the tile.
     * @param [y] The integer y coordinate of the tile.
     * @param [level] The tile level-of-detail.  Zero is the least detailed.
     * @param [result] The instance to which to copy the result, or undefined if a new instance
     *   should be created.
     * @return The specified 'result', or a new object containing the rectangle
     *   if 'result' is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#tileXYToNativeRectangle">Online Documentation</a>
     */
    abstract fun tileXYToNativeRectangle(
        x: Double,
        y: Double,
        level: Int,
        result: Any? = definedExternally,
    ): Rectangle

    /**
     * Converts tile x, y coordinates and level to a cartographic rectangle in radians.
     * @param [x] The integer x coordinate of the tile.
     * @param [y] The integer y coordinate of the tile.
     * @param [level] The tile level-of-detail.  Zero is the least detailed.
     * @param [result] The instance to which to copy the result, or undefined if a new instance
     *   should be created.
     * @return The specified 'result', or a new object containing the rectangle
     *   if 'result' is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#tileXYToRectangle">Online Documentation</a>
     */
    abstract fun tileXYToRectangle(
        x: Double,
        y: Double,
        level: Int,
        result: Any? = definedExternally,
    ): Rectangle

    /**
     * Calculates the tile x, y coordinates of the tile containing
     * a given cartographic position.
     * @param [position] The position.
     * @param [level] The tile level-of-detail.  Zero is the least detailed.
     * @param [result] The instance to which to copy the result, or undefined if a new instance
     *   should be created.
     * @return The specified 'result', or a new object containing the tile x, y coordinates
     *   if 'result' is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TilingScheme.html#positionToTileXY">Online Documentation</a>
     */
    abstract fun positionToTileXY(
        position: Cartographic,
        level: Int,
        result: Cartesian2? = definedExternally,
    ): Cartesian2
}
