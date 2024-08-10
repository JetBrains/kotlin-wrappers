// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync
import web.html.HTMLCanvasElement

/**
 * An [ImageryProvider] that draws a wireframe grid on every tile with controllable background and glow.
 * May be useful for custom rendering effects or debugging terrain.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html">Online Documentation</a>
 */
external class GridImageryProvider(
    options: ConstructorOptions,
) {
    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: DefaultEvent

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
     * and texture upload time are reduced.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Draws a grid of lines into a canvas.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#_drawGrid">Online Documentation</a>
     */
    fun _drawGrid()

    /**
     * Render a grid into a canvas with background and glow
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#_createGridCanvas">Online Documentation</a>
     */
    fun _createGridCanvas()

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): ReadonlyArray<Credit>

    /**
     * Requests the image for a given tile.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return The resolved image as a Canvas DOM object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#requestImage">Online Documentation</a>
     */
    @JsAsync
    suspend fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): HTMLCanvasElement

    @JsName("requestImage")
    fun requestImageAsync(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<HTMLCanvasElement>

    /**
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Void

    /**
     * Initialization options for the GridImageryProvider constructor
     * @property [tilingScheme] The tiling scheme for which to draw tiles.
     *   Default value - [GeographicTilingScheme()][GeographicTilingScheme]
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the default ellipsoid is used.
     *   Default value - [Ellipsoid.default]
     * @property [cells] The number of grids cells.
     *   Default value - `8`
     * @property [color] The color to draw grid lines.
     *   Default value - `Color(1.0, 1.0, 1.0, 0.4)`
     * @property [glowColor] The color to draw glow for grid lines.
     *   Default value - `Color(0.0, 1.0, 0.0, 0.05)`
     * @property [glowWidth] The width of lines used for rendering the line glow effect.
     *   Default value - `6`
     * @property [backgroundColor] Background fill color.
     *   Default value - `Color(0.0, 0.5, 0.0, 0.2)`
     * @property [tileWidth] The width of the tile for level-of-detail selection purposes.
     *   Default value - `256`
     * @property [tileHeight] The height of the tile for level-of-detail selection purposes.
     *   Default value - `256`
     * @property [canvasSize] The size of the canvas used for rendering.
     *   Default value - `256`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GridImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var cells: Int?
        var color: Color?
        var glowColor: Color?
        var glowWidth: Int?
        var backgroundColor: Color?
        var tileWidth: Int?
        var tileHeight: Int?
        var canvasSize: Int?
    }
}
