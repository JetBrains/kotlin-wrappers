// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * A Mapbox Vector Tiles (MVT) data provider. Loads .mvt or .pbf tiles, converting tiles
 * dynamically (at runtime) into 3D Tiles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MVTDataProvider.html">Online Documentation</a>
 */
open external class MVTDataProvider :
    UrlTemplate3DTilesDataProvider {


    companion object {
        /**
         * Creates an MVTDataProvider from the specified URL template and options.
         * @param [url] URL template, containing {z}, {x}, and {y} placeholders.
         * @param [options] Provider options.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MVTDataProvider.html#.fromUrl">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(
            url: Resource,
            options: FromUrlOptions? = definedExternally,
        ): MVTDataProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: Resource,
            options: FromUrlOptions? = definedExternally,
        ): Promise<MVTDataProvider>

        /**
         * @property [minZoom] Minimum zoom level represented in the generated tileset.
         *   Default value - `0`
         * @property [maxZoom] Maximum zoom level represented in the generated tileset.
         *   Default value - `14`
         * @property [extent] Optional geographic extent in radians to constrain the generated tile tree.
         * @property [featureIdProperty] MVT property name to use as feature ID.
         */
        @JsPlainObject
        interface FromUrlOptions {
            val minZoom: Double?
            val maxZoom: Double?
            val extent: Rectangle?
            val featureIdProperty: String?
        }

        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromUrl(
            url: String,
            options: FromUrlOptions? = definedExternally,
        ): MVTDataProvider

        @JsName("fromUrl")
        fun fromUrlAsync(
            url: String,
            options: FromUrlOptions? = definedExternally,
        ): Promise<MVTDataProvider>
    }
}
