// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import web.dom.Element

/**
 * Monitors performance of the application and displays a message if poor performance is detected.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerformanceWatchdog.html">Online Documentation</a>
 */
external class PerformanceWatchdog(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [container] The DOM element that will contain the widget.
     * @property [scene] The [Scene] for which to monitor performance.
     * @property [lowFrameRateMessage] The
     *   message to display when a low frame rate is detected.  The message is interpeted as HTML, so make sure
     *   it comes from a trusted source so that your application is not vulnerable to cross-site scripting attacks.
     *   Default value - `'This application appears to be performing poorly on your system.  Please try using a different web browser or updating your video drivers.'`
     */
    interface ConstructorOptions {
        var container: Element
        var scene: Scene
        var lowFrameRateMessage: String?
    }

    /**
     * Gets the parent container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerformanceWatchdog.html#container">Online Documentation</a>
     */
    var container: Element

    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerformanceWatchdog.html#viewModel">Online Documentation</a>
     */
    var viewModel: PerformanceWatchdogViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerformanceWatchdog.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PerformanceWatchdog.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun PerformanceWatchdog(
    block: PerformanceWatchdog.ConstructorOptions.() -> Unit,
): PerformanceWatchdog {
    val options: PerformanceWatchdog.ConstructorOptions = js("({})")
    block(options)
    return PerformanceWatchdog(options)
}
