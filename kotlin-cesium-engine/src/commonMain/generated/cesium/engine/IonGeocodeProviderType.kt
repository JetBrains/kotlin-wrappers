// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Underlying geocoding services that can be used via Cesium ion.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonGeocodeProviderType">Online Documentation</a>
 */
external class IonGeocodeProviderType
private constructor() {
    companion object {

        /**
         * Google geocoder, for use with Google data.
         */
        val GOOGLE: IonGeocodeProviderType

        /**
         * Bing geocoder, for use with Bing data.
         */
        val BING: IonGeocodeProviderType

        /**
         * Use the default geocoder as set on the server.  Used when neither Bing or
         * Google data is used.
         */
        val DEFAULT: IonGeocodeProviderType
    }
}
