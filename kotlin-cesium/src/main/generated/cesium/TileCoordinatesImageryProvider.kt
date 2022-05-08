// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * An [ImageryProvider] that draws a box around every rendered tile in the tiling scheme, and draws
 * a label inside it indicating the X, Y, Level coordinates of the tile.  This is mostly useful for
 * debugging terrain and imagery rendering problems.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html">Online Documentation</a>
 */
external class TileCoordinatesImageryProvider(options: ConstructorOptions? = definedExternally) {
    /**
     * The default alpha blending value of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultAlpha">Online Documentation</a>
     */
    var defaultAlpha: Double?

    /**
     * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultNightAlpha">Online Documentation</a>
     */
    var defaultNightAlpha: Double?

    /**
     * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultDayAlpha">Online Documentation</a>
     */
    var defaultDayAlpha: Double?

    /**
     * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultBrightness">Online Documentation</a>
     */
    var defaultBrightness: Double?

    /**
     * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultContrast">Online Documentation</a>
     */
    var defaultContrast: Double?

    /**
     * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultHue">Online Documentation</a>
     */
    var defaultHue: Double?

    /**
     * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultSaturation">Online Documentation</a>
     */
    var defaultSaturation: Double?

    /**
     * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultGamma">Online Documentation</a>
     */
    var defaultGamma: Double?

    /**
     * The default texture minification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultMinificationFilter">Online Documentation</a>
     */
    var defaultMinificationFilter: TextureMinificationFilter

    /**
     * The default texture magnification filter to apply to this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#defaultMagnificationFilter">Online Documentation</a>
     */
    var defaultMagnificationFilter: TextureMagnificationFilter

    /**
     * Gets the proxy used by this provider.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#proxy">Online Documentation</a>
     */
    val proxy: Proxy

    /**
     * Gets the width of each tile, in pixels. This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#tileWidth">Online Documentation</a>
     */
    val tileWidth: Int

    /**
     * Gets the height of each tile, in pixels.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#tileHeight">Online Documentation</a>
     */
    val tileHeight: Int

    /**
     * Gets the maximum level-of-detail that can be requested.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#maximumLevel">Online Documentation</a>
     */
    val maximumLevel: Int?

    /**
     * Gets the minimum level-of-detail that can be requested.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#minimumLevel">Online Documentation</a>
     */
    val minimumLevel: Int

    /**
     * Gets the tiling scheme used by this provider.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#tilingScheme">Online Documentation</a>
     */
    val tilingScheme: TilingScheme

    /**
     * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets the tile discard policy.  If not undefined, the discard policy is responsible
     * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
     * returns undefined, no tiles are filtered.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#tileDiscardPolicy">Online Documentation</a>
     */
    val tileDiscardPolicy: TileDiscardPolicy

    /**
     * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
     * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
     * are passed an instance of [TileProviderError].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#errorEvent">Online Documentation</a>
     */
    val errorEvent: Event<*>

    /**
     * Gets a value indicating whether or not the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Gets a promise that resolves to true when the provider is ready for use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#readyPromise">Online Documentation</a>
     */
    val readyPromise: kotlin.js.Promise<Boolean>

    /**
     * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
     * the source of the imagery.  This function should not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#credit">Online Documentation</a>
     */
    val credit: Credit

    /**
     * Gets a value indicating whether or not the images provided by this imagery provider
     * include an alpha channel.  If this property is false, an alpha channel, if present, will
     * be ignored.  If this property is true, any images without an alpha channel will be treated
     * as if their alpha is 1.0 everywhere.  Setting this property to false reduces memory usage
     * and texture upload time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#hasAlphaChannel">Online Documentation</a>
     */
    val hasAlphaChannel: Boolean

    /**
     * Gets the credits to be displayed when a given tile is displayed.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level;
     * @return The credits to be displayed when the tile is displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#getTileCredits">Online Documentation</a>
     */
    fun getTileCredits(
        x: Double,
        y: Double,
        level: Int,
    ): Array<out Credit>

    /**
     * Requests the image for a given tile.  This function should
     * not be called before [TileCoordinatesImageryProvider.ready] returns true.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return The resolved image as a Canvas DOM object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#requestImage">Online Documentation</a>
     */
    fun requestImage(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): kotlin.js.Promise<org.w3c.dom.HTMLCanvasElement>

    /**
     * Picking features is not currently supported by this imagery provider, so this function simply returns
     * undefined.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [longitude] The longitude at which to pick features.
     * @param [latitude] The latitude at which to pick features.
     * @return Undefined since picking is not supported.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#pickFeatures">Online Documentation</a>
     */
    fun pickFeatures(
        x: Double,
        y: Double,
        level: Int,
        longitude: Double,
        latitude: Double,
    ): Nothing?

    /**
     * Initialization options for the TileCoordinatesImageryProvider constructor
     * @property [tilingScheme] The tiling scheme for which to draw tiles.
     *   Default value - [GeographicTilingScheme()][GeographicTilingScheme]
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [color] The color to draw the tile box and label.
     *   Default value - [Color.YELLOW]
     * @property [tileWidth] The width of the tile for level-of-detail selection purposes.
     *   Default value - `256`
     * @property [tileHeight] The height of the tile for level-of-detail selection purposes.
     *   Default value - `256`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileCoordinatesImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var color: Color?
        var tileWidth: Int?
        var tileHeight: Int?
    }
}

inline fun TileCoordinatesImageryProvider(
    block: TileCoordinatesImageryProvider.ConstructorOptions.() -> Unit,
): TileCoordinatesImageryProvider {
    val options: TileCoordinatesImageryProvider.ConstructorOptions = js("({})")
    block(options)
    return TileCoordinatesImageryProvider(options)
}
