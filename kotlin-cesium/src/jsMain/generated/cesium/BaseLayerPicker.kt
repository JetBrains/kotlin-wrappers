// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso
import web.dom.Element

/**
 * The BaseLayerPicker is a single button widget that displays a panel of available imagery and
 * terrain providers.  When imagery is selected, the corresponding imagery layer is created and inserted
 * as the base layer of the imagery collection; removing the existing base.  When terrain is selected,
 * it replaces the current terrain provider.  Each item in the available providers list contains a name,
 * a representative icon, and a tooltip to display more information when hovered. The list is initially
 * empty, and must be configured before use, as illustrated in the below example.
 *
 * By default, the BaseLayerPicker uses a default list of example providers for demonstration purposes.
 * Notably some of these providers, such as <a href="https://developers.arcgis.com" target="_blank">Esri ArcGIS</a> and <a href="https://docs.stadiamaps.com/ target="_blank">Stadia Maps</a>, have seperate terms of service and require authentication for production use.
 * ```
 * // In HTML head, include a link to the BaseLayerPicker.css stylesheet,
 * // and in the body, include: <div id="baseLayerPickerContainer"
 * //   style="position:absolute;top:24px;right:24px;width:38px;height:38px;"></div>
 *
 * //Create the list of available providers we would like the user to select from.
 * //This example uses 3, OpenStreetMap, The Black Marble, and a single, non-streaming world image.
 * const imageryViewModels = [];
 * imageryViewModels.push(new ProviderViewModel({
 *      name: "Open\u00adStreet\u00adMap",
 *      iconUrl: buildModuleUrl("Widgets/Images/ImageryProviders/openStreetMap.png"),
 *      tooltip: "OpenStreetMap (OSM) is a collaborative project to create a free editable \
 * map of the world.\nhttp://www.openstreetmap.org",
 *      creationFunction: function() {
 *          return new OpenStreetMapImageryProvider({
 *              url: "https://tile.openstreetmap.org/"
 *          });
 *      }
 *  }));
 *
 *  imageryViewModels.push(new ProviderViewModel({
 *      name: "Earth at Night",
 *      iconUrl: buildModuleUrl("Widgets/Images/ImageryProviders/blackMarble.png"),
 *      tooltip: "The lights of cities and villages trace the outlines of civilization \
 * in this global view of the Earth at night as seen by NASA/NOAA's Suomi NPP satellite.",
 *      creationFunction: function() {
 *          return IonImageryProvider.fromAssetId(3812);
 *      }
 *  }));
 *
 *  imageryViewModels.push(new ProviderViewModel({
 *      name: "Natural Earth\u00a0II",
 *      iconUrl: buildModuleUrl("Widgets/Images/ImageryProviders/naturalEarthII.png"),
 *      tooltip: "Natural Earth II, darkened for contrast.\nhttp://www.naturalearthdata.com/",
 *      creationFunction: function() {
 *          return TileMapServiceImageryProvider.fromUrl(
 *              buildModuleUrl("Assets/Textures/NaturalEarthII")
 *          );
 *      }
 *  }));
 *
 * //Create a CesiumWidget without imagery, if you haven't already done so.
 * const cesiumWidget = new CesiumWidget("cesiumContainer", { baseLayer: false });
 *
 * //Finally, create the baseLayerPicker widget using our view models.
 * const layers = cesiumWidget.imageryLayers;
 * const baseLayerPicker = new BaseLayerPicker("baseLayerPickerContainer", {
 *     globe: cesiumWidget.scene.globe,
 *     imageryProviderViewModels: imageryViewModels
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPicker.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The parent HTML container node or ID for this widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPicker.html">Online Documentation</a>
 */
external class BaseLayerPicker(
    var container: Element,
    options: ConstructorOptions,
) {
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
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPicker.html#viewModel">Online Documentation</a>
     */
    var viewModel: BaseLayerPickerViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPicker.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BaseLayerPicker.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun BaseLayerPicker(
    container: Element,
    block: BaseLayerPicker.ConstructorOptions.() -> Unit,
): BaseLayerPicker =
    BaseLayerPicker(container, options = jso(block))
