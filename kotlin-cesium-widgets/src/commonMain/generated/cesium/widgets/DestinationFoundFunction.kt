// Automatically generated - do not modify!

package cesium.widgets

import js.core.JsAny

/**
 * A function that handles the result of a successful geocode.
 * @param [viewModel] The view model.
 * @param [destination] The destination result of the geocode.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geocoder.html#.DestinationFoundFunction">Online Documentation</a>
 */
typealias DestinationFoundFunction = (
    viewModel: GeocoderViewModel,
    destination: JsAny, /* Cartesian3 | Rectangle */
) -> Unit
