// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A single button widget for returning to the default camera view of the current scene.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButton.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] The Scene instance to use.
 * @param [duration] The time, in seconds, it takes to complete the camera flight home.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButton.html">Online Documentation</a>
 */
external class HomeButton(
    var container: org.w3c.dom.Element,
    scene: Scene,
    duration: Double? = definedExternally,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButton.html#viewModel">Online Documentation</a>
     */
    var viewModel: HomeButtonViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButton.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButton.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
