// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A view model which exposes the properties of a toggle button.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ToggleButtonViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [command] The command which will be executed when the button is toggled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ToggleButtonViewModel.html">Online Documentation</a>
 */
external class ToggleButtonViewModel(var command: Command) {
    /**
     * Gets or sets whether the button is currently toggled.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ToggleButtonViewModel.html#toggled">Online Documentation</a>
     */
    var toggled: Boolean

    /**
     * Gets or sets the button's tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ToggleButtonViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String
}
