// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A single button widget for toggling fullscreen mode.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButton.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [fullscreenElement] The element or id to be placed into fullscreen mode.
 *   Default value - `document.body`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButton.html">Online Documentation</a>
 */
external class FullscreenButton(
    var container: org.w3c.dom.Element,
    fullscreenElement: org.w3c.dom.Element? = definedExternally,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButton.html#viewModel">Online Documentation</a>
     */
    var viewModel: FullscreenButtonViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButton.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/FullscreenButton.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
