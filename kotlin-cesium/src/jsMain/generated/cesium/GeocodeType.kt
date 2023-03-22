// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The type of geocoding to be performed by a [GeocoderService].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#GeocodeType">Online Documentation</a>
 */
sealed external interface GeocodeType {
    companion object {

        /**
         * Perform a search where the input is considered complete.
         */
        val SEARCH: GeocodeType

        /**
         * Perform an auto-complete using partial input, typically
         * reserved for providing possible results as a user is typing.
         */
        val AUTOCOMPLETE: GeocodeType
    }
}
