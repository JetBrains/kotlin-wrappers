// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import kotlin.js.Promise

/**
 * An imagery layer that displays tiled image data from a single imagery provider
 * on a [Globe].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html">Online Documentation</a>
 *
 * @constructor
 * @property [imageryProvider] The imagery provider to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html">Online Documentation</a>
 */
external class ImageryLayer(
    val imageryProvider: ImageryProvider,
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * @property [rectangle] The rectangle of the layer.  This rectangle
     *   can limit the visible portion of the imagery provider.
     *   Default value - [imageryProvider.rectangle]
     * @property [alpha] The alpha blending value of this layer, from 0.0 to 1.0.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the alpha is required, and it is expected to return
     *   the alpha value to use for the tile.
     *   Default value - `1.0`
     * @property [nightAlpha] The alpha blending value of this layer on the night side of the globe, from 0.0 to 1.0.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the alpha is required, and it is expected to return
     *   the alpha value to use for the tile. This only takes effect when `enableLighting` is `true`.
     *   Default value - `1.0`
     * @property [dayAlpha] The alpha blending value of this layer on the day side of the globe, from 0.0 to 1.0.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the alpha is required, and it is expected to return
     *   the alpha value to use for the tile. This only takes effect when `enableLighting` is `true`.
     *   Default value - `1.0`
     * @property [brightness] The brightness of this layer.  1.0 uses the unmodified imagery
     *   color.  Less than 1.0 makes the imagery darker while greater than 1.0 makes it brighter.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the brightness is required, and it is expected to return
     *   the brightness value to use for the tile.  The function is executed for every
     *   frame and for every tile, so it must be fast.
     *   Default value - `1.0`
     * @property [contrast] The contrast of this layer.  1.0 uses the unmodified imagery color.
     *   Less than 1.0 reduces the contrast while greater than 1.0 increases it.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the contrast is required, and it is expected to return
     *   the contrast value to use for the tile.  The function is executed for every
     *   frame and for every tile, so it must be fast.
     *   Default value - `1.0`
     * @property [hue] The hue of this layer.  0.0 uses the unmodified imagery color.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates
     *   of the imagery tile for which the hue is required, and it is expected to return
     *   the contrast value to use for the tile.  The function is executed for every
     *   frame and for every tile, so it must be fast.
     *   Default value - `0.0`
     * @property [saturation] The saturation of this layer.  1.0 uses the unmodified imagery color.
     *   Less than 1.0 reduces the saturation while greater than 1.0 increases it.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates
     *   of the imagery tile for which the saturation is required, and it is expected to return
     *   the contrast value to use for the tile.  The function is executed for every
     *   frame and for every tile, so it must be fast.
     *   Default value - `1.0`
     * @property [gamma] The gamma correction to apply to this layer.  1.0 uses the unmodified imagery color.
     *   This can either be a simple number or a function with the signature
     *   `function(frameState, layer, x, y, level)`.  The function is passed the
     *   current frame state, this layer, and the x, y, and level coordinates of the
     *   imagery tile for which the gamma is required, and it is expected to return
     *   the gamma value to use for the tile.  The function is executed for every
     *   frame and for every tile, so it must be fast.
     *   Default value - `1.0`
     * @property [splitDirection] The [SplitDirection] split to apply to this layer.
     *   Default value - [SplitDirection.NONE]
     * @property [minificationFilter] The
     *   texture minification filter to apply to this layer. Possible values
     *   are `TextureMinificationFilter.LINEAR` and
     *   `TextureMinificationFilter.NEAREST`.
     *   Default value - [TextureMinificationFilter.LINEAR]
     * @property [magnificationFilter] The
     *   texture minification filter to apply to this layer. Possible values
     *   are `TextureMagnificationFilter.LINEAR` and
     *   `TextureMagnificationFilter.NEAREST`.
     *   Default value - [TextureMagnificationFilter.LINEAR]
     * @property [show] True if the layer is shown; otherwise, false.
     *   Default value - `true`
     * @property [maximumAnisotropy] The maximum anisotropy level to use
     *   for texture filtering.  If this parameter is not specified, the maximum anisotropy supported
     *   by the WebGL stack will be used.  Larger values make the imagery look better in horizon
     *   views.
     *   Default value - `maximum supported`
     * @property [minimumTerrainLevel] The minimum terrain level-of-detail at which to show this imagery layer,
     *   or undefined to show it at all levels.  Level zero is the least-detailed level.
     * @property [maximumTerrainLevel] The maximum terrain level-of-detail at which to show this imagery layer,
     *   or undefined to show it at all levels.  Level zero is the least-detailed level.
     * @property [cutoutRectangle] Cartographic rectangle for cutting out a portion of this ImageryLayer.
     * @property [colorToAlpha] Color to be used as alpha.
     * @property [colorToAlphaThreshold] Threshold for color-to-alpha.
     *   Default value - `0.004`
     */
    interface ConstructorOptions {
        var rectangle: Rectangle?
        var alpha: dynamic
        var nightAlpha: dynamic
        var dayAlpha: dynamic
        var brightness: dynamic
        var contrast: dynamic
        var hue: dynamic
        var saturation: dynamic
        var gamma: dynamic
        var splitDirection: dynamic
        var minificationFilter: TextureMinificationFilter?
        var magnificationFilter: TextureMagnificationFilter?
        var show: Boolean?
        var maximumAnisotropy: Double?
        var minimumTerrainLevel: Int?
        var maximumTerrainLevel: Int?
        var cutoutRectangle: Rectangle?
        var colorToAlpha: Color?
        var colorToAlphaThreshold: Double?
    }

    /**
     * The alpha blending value of this layer, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#alpha">Online Documentation</a>
     */
    var alpha: Double

    /**
     * The alpha blending value of this layer on the night side of the globe, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque. This only takes effect when [Globe.enableLighting] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#nightAlpha">Online Documentation</a>
     */
    var nightAlpha: Double

    /**
     * The alpha blending value of this layer on the day side of the globe, with 0.0 representing fully transparent and
     * 1.0 representing fully opaque. This only takes effect when [Globe.enableLighting] is `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#dayAlpha">Online Documentation</a>
     */
    var dayAlpha: Double

    /**
     * The brightness of this layer.  1.0 uses the unmodified imagery color.  Less than 1.0
     * makes the imagery darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#brightness">Online Documentation</a>
     */
    var brightness: Double

    /**
     * The contrast of this layer.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
     * the contrast while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#contrast">Online Documentation</a>
     */
    var contrast: Double

    /**
     * The hue of this layer in radians. 0.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#hue">Online Documentation</a>
     */
    var hue: Double

    /**
     * The saturation of this layer. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#saturation">Online Documentation</a>
     */
    var saturation: Double

    /**
     * The gamma correction to apply to this layer.  1.0 uses the unmodified imagery color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#gamma">Online Documentation</a>
     */
    var gamma: Double

    /**
     * The [SplitDirection] to apply to this layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#splitDirection">Online Documentation</a>
     */
    var splitDirection: SplitDirection

    /**
     * The [TextureMinificationFilter] to apply to this layer.
     * Possible values are [TextureMinificationFilter.LINEAR] (the default)
     * and [TextureMinificationFilter.NEAREST].
     *
     * To take effect, this property must be set immediately after adding the imagery layer.
     * Once a texture is loaded it won't be possible to change the texture filter used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#minificationFilter">Online Documentation</a>
     */
    var minificationFilter: TextureMinificationFilter

    /**
     * The [TextureMagnificationFilter] to apply to this layer.
     * Possible values are [TextureMagnificationFilter.LINEAR] (the default)
     * and [TextureMagnificationFilter.NEAREST].
     *
     * To take effect, this property must be set immediately after adding the imagery layer.
     * Once a texture is loaded it won't be possible to change the texture filter used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#magnificationFilter">Online Documentation</a>
     */
    var magnificationFilter: TextureMagnificationFilter

    /**
     * Determines if this layer is shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Rectangle cutout in this layer of imagery.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#cutoutRectangle">Online Documentation</a>
     */
    var cutoutRectangle: Rectangle

    /**
     * Color value that should be set to transparent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#colorToAlpha">Online Documentation</a>
     */
    var colorToAlpha: Color

    /**
     * Normalized (0-1) threshold for color-to-alpha.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#colorToAlphaThreshold">Online Documentation</a>
     */
    var colorToAlphaThreshold: Double

    /**
     * Gets the rectangle of this layer.  If this rectangle is smaller than the rectangle of the
     * [ImageryProvider], only a portion of the imagery provider is shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#rectangle">Online Documentation</a>
     */
    val rectangle: Rectangle

    /**
     * Gets a value indicating whether this layer is the base layer in the
     * [ImageryLayerCollection].  The base layer is the one that underlies all
     * others.  It is special in that it is treated as if it has global rectangle, even if
     * it actually does not, by stretching the texels at the edges over the entire
     * globe.
     * @return true if this is the base layer; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#isBaseLayer">Online Documentation</a>
     */
    fun isBaseLayer(): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * imageryLayer = imageryLayer && imageryLayer.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Computes the intersection of this layer's rectangle with the imagery provider's availability rectangle,
     * producing the overall bounds of imagery that can be produced by this layer.
     * ```
     * // Zoom to an imagery layer.
     * imageryLayer.getViewableRectangle().then(function (rectangle) {
     *     return camera.flyTo({
     *         destination: rectangle
     *     });
     * });
     * ```
     * @return A promise to a rectangle which defines the overall bounds of imagery that can be produced by this layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#getViewableRectangle">Online Documentation</a>
     */
    fun getViewableRectangle(): Promise<Rectangle>

    companion object {
        /**
         * This value is used as the default brightness for the imagery layer if one is not provided during construction
         * or by the imagery provider. This value does not modify the brightness of the imagery.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_BRIGHTNESS">Online Documentation</a>
         */
        var DEFAULT_BRIGHTNESS: Double

        /**
         * This value is used as the default contrast for the imagery layer if one is not provided during construction
         * or by the imagery provider. This value does not modify the contrast of the imagery.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_CONTRAST">Online Documentation</a>
         */
        var DEFAULT_CONTRAST: Double

        /**
         * This value is used as the default hue for the imagery layer if one is not provided during construction
         * or by the imagery provider. This value does not modify the hue of the imagery.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_HUE">Online Documentation</a>
         */
        var DEFAULT_HUE: Double

        /**
         * This value is used as the default saturation for the imagery layer if one is not provided during construction
         * or by the imagery provider. This value does not modify the saturation of the imagery.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_SATURATION">Online Documentation</a>
         */
        var DEFAULT_SATURATION: Double

        /**
         * This value is used as the default gamma for the imagery layer if one is not provided during construction
         * or by the imagery provider. This value does not modify the gamma of the imagery.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_GAMMA">Online Documentation</a>
         */
        var DEFAULT_GAMMA: Double

        /**
         * This value is used as the default split for the imagery layer if one is not provided during construction
         * or by the imagery provider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_SPLIT">Online Documentation</a>
         */
        var DEFAULT_SPLIT: SplitDirection

        /**
         * This value is used as the default texture minification filter for the imagery layer if one is not provided
         * during construction or by the imagery provider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_MINIFICATION_FILTER">Online Documentation</a>
         */
        var DEFAULT_MINIFICATION_FILTER: TextureMinificationFilter

        /**
         * This value is used as the default texture magnification filter for the imagery layer if one is not provided
         * during construction or by the imagery provider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_MAGNIFICATION_FILTER">Online Documentation</a>
         */
        var DEFAULT_MAGNIFICATION_FILTER: TextureMagnificationFilter

        /**
         * This value is used as the default threshold for color-to-alpha if one is not provided
         * during construction or by the imagery provider.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ImageryLayer.html#.DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD">Online Documentation</a>
         */
        var DEFAULT_APPLY_COLOR_TO_ALPHA_THRESHOLD: Double
    }
}

inline fun ImageryLayer(
    imageryProvider: ImageryProvider,
    block: ImageryLayer.ConstructorOptions.() -> Unit,
): ImageryLayer {
    val options: ImageryLayer.ConstructorOptions = js("({})")
    block(options)
    return ImageryLayer(imageryProvider, options)
}
