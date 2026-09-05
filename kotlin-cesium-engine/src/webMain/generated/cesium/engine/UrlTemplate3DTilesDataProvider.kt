// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Base provider for URL-template vector sources that are rendered through a
 * runtime-generated 3D Tiles tileset.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html">Online Documentation</a>
 *
 * @constructor
 * @param [urlTemplate] URL template containing {z}, {x}, and {y} placeholders.
 * @param [options] Provider options.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html">Online Documentation</a>
 */
open external class UrlTemplate3DTilesDataProvider(
    urlTemplate: Resource,
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * @property [minZoom] Minimum zoom level represented in the generated tileset.
     *   Default value - `0`
     * @property [maxZoom] Maximum zoom level represented in the generated tileset.
     *   Default value - `14`
     * @property [extent] Optional geographic extent in radians to constrain the generated tile tree.
     * @property [featureIdProperty] Feature property name to use as feature ID when supported by content decoding.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val minZoom: Double?
        val maxZoom: Double?
        val extent: Rectangle?
        val featureIdProperty: String?
    }

    constructor(
        urlTemplate: String,
        options: ConstructorOptions? = definedExternally,
    )

    /**
     * URL template containing {z}/{x}/{y}.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#urlTemplate">Online Documentation</a>
     */
    val urlTemplate: String

    /**
     * Resource derived from the URL template.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Optional geographic extent in radians used to generate tile headers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#extent">Online Documentation</a>
     */
    val extent: Rectangle?

    /**
     * Backing 3D Tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset?

    /**
     * Determines if the generated tileset is shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#show">Online Documentation</a>
     */
    var show: Boolean

    companion object {
        /**
         * Creates a provider from a URL template.
         * @param [url] URL template containing {z}, {x}, and {y} placeholders.
         * @param [options] Provider options.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/UrlTemplate3DTilesDataProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(
            url: Resource,
            options: JsAny? = definedExternally,
        ): UrlTemplate3DTilesDataProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: JsAny? = definedExternally,
        ): Promise<UrlTemplate3DTilesDataProvider>

        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(
            url: String,
            options: JsAny? = definedExternally,
        ): UrlTemplate3DTilesDataProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: String,
            options: JsAny? = definedExternally,
        ): Promise<UrlTemplate3DTilesDataProvider>
    }
}
