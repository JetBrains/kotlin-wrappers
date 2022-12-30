// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import web.html.HTMLCanvasElement

/**
 * A utility class for generating custom map pins as canvas elements.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PinBuilder.html">Online Documentation</a>
 */
external class PinBuilder {
    /**
     * Creates an empty pin of the specified color and size.
     * @param [color] The color of the pin.
     * @param [size] The size of the pin, in pixels.
     * @return The canvas element that represents the generated pin.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PinBuilder.html#fromColor">Online Documentation</a>
     */
    fun fromColor(
        color: Color,
        size: Double,
    ): HTMLCanvasElement

    /**
     * Creates a pin with the specified icon, color, and size.
     * @param [url] The url of the image to be stamped onto the pin.
     * @param [color] The color of the pin.
     * @param [size] The size of the pin, in pixels.
     * @return The canvas element or a Promise to the canvas element that represents the generated pin.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PinBuilder.html#fromUrl">Online Documentation</a>
     */
    fun fromUrl(
        url: Resource,
        color: Color,
        size: Double,
    ): dynamic

    fun fromUrl(
        url: String,
        color: Color,
        size: Double,
    ): dynamic

    /**
     * Creates a pin with the specified [maki](https://www.mapbox.com/maki/) icon identifier, color, and size.
     * @param [id] The id of the maki icon to be stamped onto the pin.
     * @param [color] The color of the pin.
     * @param [size] The size of the pin, in pixels.
     * @return The canvas element or a Promise to the canvas element that represents the generated pin.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PinBuilder.html#fromMakiIconId">Online Documentation</a>
     */
    fun fromMakiIconId(
        id: String,
        color: Color,
        size: Double,
    ): dynamic

    /**
     * Creates a pin with the specified text, color, and size.  The text will be sized to be as large as possible
     * while still being contained completely within the pin.
     * @param [text] The text to be stamped onto the pin.
     * @param [color] The color of the pin.
     * @param [size] The size of the pin, in pixels.
     * @return The canvas element that represents the generated pin.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PinBuilder.html#fromText">Online Documentation</a>
     */
    fun fromText(
        text: String,
        color: Color,
        size: Double,
    ): HTMLCanvasElement
}
