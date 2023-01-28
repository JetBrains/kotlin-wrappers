// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Browser-independent functions for working with the standard fullscreen API.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fullscreen.html">Online Documentation</a>
 */
external object Fullscreen {
    /**
     * The element that is currently fullscreen, if any.  To simply check if the
     * browser is in fullscreen mode or not, use [Fullscreen.fullscreen].
     */
    val element: Any

    /**
     * The name of the event on the document that is fired when fullscreen is
     * entered or exited.  This event name is intended for use with addEventListener.
     * In your event handler, to determine if the browser is in fullscreen mode or not,
     * use [Fullscreen.fullscreen].
     */
    val changeEventName: String

    /**
     * The name of the event that is fired when a fullscreen error
     * occurs.  This event name is intended for use with addEventListener.
     */
    val errorEventName: String

    /**
     * Determine whether the browser will allow an element to be made fullscreen, or not.
     * For example, by default, iframes cannot go fullscreen unless the containing page
     * adds an "allowfullscreen" attribute (or prefixed equivalent).
     */
    val enabled: Boolean

    /**
     * Determines if the browser is currently in fullscreen mode.
     */
    val fullscreen: Boolean

    /**
     * Detects whether the browser supports the standard fullscreen API.
     * @return `true` if the browser supports the standard fullscreen API,
     *   `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fullscreen.html#.supportsFullscreen">Online Documentation</a>
     */
    fun supportsFullscreen(): Boolean

    /**
     * Asynchronously requests the browser to enter fullscreen mode on the given element.
     * If fullscreen mode is not supported by the browser, does nothing.
     * ```
     * // Put the entire page into fullscreen.
     * Fullscreen.requestFullscreen(document.body)
     *
     * // Place only the Cesium canvas into fullscreen.
     * Fullscreen.requestFullscreen(scene.canvas)
     * ```
     * @param [element] The HTML element which will be placed into fullscreen mode.
     * @param [vrDevice] The HMDVRDevice device.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fullscreen.html#.requestFullscreen">Online Documentation</a>
     */
    fun requestFullscreen(
        element: Any,
        vrDevice: Any? = definedExternally,
    )

    /**
     * Asynchronously exits fullscreen mode.  If the browser is not currently
     * in fullscreen, or if fullscreen mode is not supported by the browser, does nothing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Fullscreen.html#.exitFullscreen">Online Documentation</a>
     */
    fun exitFullscreen()
}
