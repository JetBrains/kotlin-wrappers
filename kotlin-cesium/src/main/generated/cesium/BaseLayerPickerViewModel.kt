// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * The view model for [BaseLayerPicker].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html">Online Documentation</a>
 */
external class BaseLayerPickerViewModel(options: ConstructorOptions) {
    /**
     * @property [globe] The Globe to use.
     * @property [imageryProviderViewModels] The array of ProviderViewModel instances to use for imagery.
     *   Default value - `[]`
     * @property [selectedImageryProviderViewModel] The view model for the current base imagery layer, if not supplied the first available imagery layer is used.
     * @property [terrainProviderViewModels] The array of ProviderViewModel instances to use for terrain.
     *   Default value - `[]`
     * @property [selectedTerrainProviderViewModel] The view model for the current base terrain layer, if not supplied the first available terrain layer is used.
     */
    interface ConstructorOptions {
        var globe: Globe
        var imageryProviderViewModels: ReadonlyArray<ProviderViewModel>?
        var selectedImageryProviderViewModel: ProviderViewModel?
        var terrainProviderViewModels: ReadonlyArray<ProviderViewModel>?
        var selectedTerrainProviderViewModel: ProviderViewModel?
    }

    /**
     * Gets or sets an array of ProviderViewModel instances available for imagery selection.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#imageryProviderViewModels">Online Documentation</a>
     */
    var imageryProviderViewModels: ReadonlyArray<ProviderViewModel>

    /**
     * Gets or sets an array of ProviderViewModel instances available for terrain selection.
     * This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#terrainProviderViewModels">Online Documentation</a>
     */
    var terrainProviderViewModels: ReadonlyArray<ProviderViewModel>

    /**
     * Gets or sets whether the imagery selection drop-down is currently visible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#dropDownVisible">Online Documentation</a>
     */
    var dropDownVisible: Boolean

    /**
     * Gets the button tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#buttonTooltip">Online Documentation</a>
     */
    var buttonTooltip: String

    /**
     * Gets the button background image.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#buttonImageUrl">Online Documentation</a>
     */
    var buttonImageUrl: String

    /**
     * Gets or sets the currently selected imagery.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#selectedImagery">Online Documentation</a>
     */
    var selectedImagery: ProviderViewModel

    /**
     * Gets or sets the currently selected terrain.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#selectedTerrain">Online Documentation</a>
     */
    var selectedTerrain: ProviderViewModel

    /**
     * Gets the command to toggle the visibility of the drop down.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#toggleDropDown">Online Documentation</a>
     */
    var toggleDropDown: Command

    /**
     * Gets the globe.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPickerViewModel.html#globe">Online Documentation</a>
     */
    var globe: Globe
}

inline fun BaseLayerPickerViewModel(
    block: BaseLayerPickerViewModel.ConstructorOptions.() -> Unit,
): BaseLayerPickerViewModel {
    val options: BaseLayerPickerViewModel.ConstructorOptions = js("({})")
    block(options)
    return BaseLayerPickerViewModel(options)
}
