// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso
import web.html.HTMLImageElement
import kotlin.js.Promise

/**
 * Provides functionality for ImageryProviders that have time dynamic imagery
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html">Online Documentation</a>
 */
external class TimeDynamicImagery(options: ConstructorOptions) {
    /**
     * @property [clock] A Clock instance that is used when determining the value for the time dimension. Required when `options.times` is specified.
     * @property [times] TimeIntervalCollection with its `data` property being an object containing time dynamic dimension and their values.
     * @property [requestImageFunction] A function that will request imagery tiles.
     * @property [reloadFunction] A function that will be called when all imagery tiles need to be reloaded.
     */
    interface ConstructorOptions {
        var clock: Clock
        var times: TimeIntervalCollection
        var requestImageFunction: Function<*>
        var reloadFunction: Function<*>
    }

    /**
     * Gets or sets a clock that is used to get keep the time used for time dynamic parameters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html#clock">Online Documentation</a>
     */
    var clock: Clock

    /**
     * Gets or sets a time interval collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html#times">Online Documentation</a>
     */
    var times: TimeIntervalCollection

    /**
     * Gets the current interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html#currentInterval">Online Documentation</a>
     */
    var currentInterval: TimeInterval

    /**
     * Gets the tile from the cache if its available.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @return A promise for the image that will resolve when the image is available, or
     *   undefined if the tile is not in the cache.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html#getFromCache">Online Documentation</a>
     */
    fun getFromCache(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    ): Promise<HTMLImageElement>?

    /**
     * Checks if the next interval is approaching and will start preload the tile if necessary. Otherwise it will
     * just add the tile to a list to preload when we approach the next interval.
     * @param [x] The tile X coordinate.
     * @param [y] The tile Y coordinate.
     * @param [level] The tile level.
     * @param [request] The request object. Intended for internal use only.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeDynamicImagery.html#checkApproachingInterval">Online Documentation</a>
     */
    fun checkApproachingInterval(
        x: Double,
        y: Double,
        level: Int,
        request: Request? = definedExternally,
    )
}

inline fun TimeDynamicImagery(
    block: TimeDynamicImagery.ConstructorOptions.() -> Unit,
): TimeDynamicImagery =
    TimeDynamicImagery(options = jso(block))
