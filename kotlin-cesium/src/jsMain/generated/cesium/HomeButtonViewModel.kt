// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [HomeButton].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButtonViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The scene instance to use.
 * @param [duration] The duration of the camera flight in seconds.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButtonViewModel.html">Online Documentation</a>
 */
external class HomeButtonViewModel(
    var scene: Scene,
    duration: Double? = definedExternally,
) {
    /**
     * Gets or sets the tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButtonViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String

    /**
     * Gets the Command that is executed when the button is clicked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButtonViewModel.html#command">Online Documentation</a>
     */
    var command: Command

    /**
     * Gets or sets the the duration of the camera flight in seconds.
     * A value of zero causes the camera to instantly switch to home view.
     * The duration will be computed based on the distance when undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HomeButtonViewModel.html#duration">Online Documentation</a>
     */
    var duration: Double?
}
