// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [FullscreenButton].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [fullscreenElement] The element or id to be placed into fullscreen mode.
 *   Default value - `document.body`
 * @param [container] The DOM element that will contain the widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html">Online Documentation</a>
 */
external class FullscreenButtonViewModel(
    var fullscreenElement: org.w3c.dom.Element = definedExternally,
    container: org.w3c.dom.Element? = definedExternally,
) {
    /**
     * Gets whether or not fullscreen mode is active.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#isFullscreen">Online Documentation</a>
     */
    var isFullscreen: Boolean

    /**
     * Gets or sets whether or not fullscreen functionality should be enabled.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#isFullscreenEnabled">Online Documentation</a>
     */
    var isFullscreenEnabled: Boolean

    /**
     * Gets the tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String

    /**
     * Gets the Command to toggle fullscreen mode.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#command">Online Documentation</a>
     */
    var command: Command

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the view model.  Should be called to
     * properly clean up the view model when it is no longer needed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButtonViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
