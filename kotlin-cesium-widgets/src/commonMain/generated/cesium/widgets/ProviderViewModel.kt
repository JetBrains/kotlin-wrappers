// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * A view model that represents each item in the [BaseLayerPicker].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] The object containing all parameters.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html">Online Documentation</a>
 */
external class ProviderViewModel(
    options: ConstructorOptions,
) {
    /**
     * @property [name] The name of the layer.
     * @property [tooltip] The tooltip to show when the item is moused over.
     * @property [iconUrl] An icon representing the layer.
     * @property [category] A category for the layer.
     * @property [creationFunction] A function or Command
     *   that creates one or more providers which will be added to the globe when this item is selected.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val name: String
        val tooltip: String
        val iconUrl: String
        val category: String?
        val creationFunction: JsAny /* ProviderViewModel.CreationFunction | Command */
    }

    /**
     * Gets the display name.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html#name">Online Documentation</a>
     */
    var name: String

    /**
     * Gets the tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String

    /**
     * Gets the icon.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html#iconUrl">Online Documentation</a>
     */
    var iconUrl: String

    /**
     * Gets the Command that creates one or more providers which will be added to
     * the globe when this item is selected.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html#creationCommand">Online Documentation</a>
     */
    val creationCommand: Command

    /**
     * Gets the category
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProviderViewModel.html#category">Online Documentation</a>
     */
    val category: String
}
