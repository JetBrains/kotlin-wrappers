// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * A tiling scheme for geometry referenced to a simple [GeographicProjection] where
 * longitude and latitude are directly mapped to X and Y.  This projection is commonly
 * known as geographic, equirectangular, equidistant cylindrical, or plate carrée.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html">Online Documentation</a>
 */
external class GeographicTilingScheme(options: ConstructorOptions? = definedExternally) : TilingScheme {
    /**
     * @property [ellipsoid] The ellipsoid whose surface is being tiled. Defaults to
     *   the WGS84 ellipsoid.
     *   Default value - [Ellipsoid.WGS84]
     * @property [rectangle] The rectangle, in radians, covered by the tiling scheme.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [numberOfLevelZeroTilesX] The number of tiles in the X direction at level zero of
     *   the tile tree.
     *   Default value - `2`
     * @property [numberOfLevelZeroTilesY] The number of tiles in the Y direction at level zero of
     *   the tile tree.
     *   Default value - `1`
     */
    interface ConstructorOptions {
        var ellipsoid: Ellipsoid?
        var rectangle: Rectangle?
        var numberOfLevelZeroTilesX: Int?
        var numberOfLevelZeroTilesY: Int?
    }

    /**
     * Gets the ellipsoid that is tiled by this tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#ellipsoid">Online Documentation</a>
     */
    override var ellipsoid: Ellipsoid

    /**
     * Gets the rectangle, in radians, covered by this tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#rectangle">Online Documentation</a>
     */
    override var rectangle: Rectangle

    /**
     * Gets the map projection used by this tiling scheme.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#projection">Online Documentation</a>
     */
    override var projection: MapProjection

    /**
     * Gets the total number of tiles in the X direction at a specified level-of-detail.
     * @param [level] The level-of-detail.
     * @return The number of tiles in the X direction at the given level.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#getNumberOfXTilesAtLevel">Online Documentation</a>
     */
    override fun getNumberOfXTilesAtLevel(level: Int): Int

    /**
     * Gets the total number of tiles in the Y direction at a specified level-of-detail.
     * @param [level] The level-of-detail.
     * @return The number of tiles in the Y direction at the given level.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#getNumberOfYTilesAtLevel">Online Documentation</a>
     */
    override fun getNumberOfYTilesAtLevel(level: Int): Int

    /**
     * Transforms a rectangle specified in geodetic radians to the native coordinate system
     * of this tiling scheme.
     * @param [rectangle] The rectangle to transform.
     * @param [result] The instance to which to copy the result, or undefined if a new instance
     *   should be created.
     * @return The specified 'result', or a new object containing the native rectangle if 'result'
     *   is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#rectangleToNativeRectangle">Online Documentation</a>
     */
    override fun rectangleToNativeRectangle(
        rectangle: Rectangle,
        result: Rectangle?,
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#tileXYToNativeRectangle">Online Documentation</a>
     */
    override fun tileXYToNativeRectangle(
        x: Double,
        y: Double,
        level: Int,
        result: Any?,
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#tileXYToRectangle">Online Documentation</a>
     */
    override fun tileXYToRectangle(
        x: Double,
        y: Double,
        level: Int,
        result: Any?,
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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeographicTilingScheme.html#positionToTileXY">Online Documentation</a>
     */
    override fun positionToTileXY(
        position: Cartographic,
        level: Int,
        result: Cartesian2?,
    ): Cartesian2
}

inline fun GeographicTilingScheme(
    block: GeographicTilingScheme.ConstructorOptions.() -> Unit,
): GeographicTilingScheme =
    GeographicTilingScheme(options = jso(block))
