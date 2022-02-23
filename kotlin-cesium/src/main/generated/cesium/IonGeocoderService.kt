// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Provides geocoding through Cesium ion.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonGeocoderService.html">Online Documentation</a>
 */
external class IonGeocoderService(options: ConstructorOptions) {
    /**
     * @property [scene] The scene
     * @property [accessToken] The access token to use.
     *   Default value - [Ion.defaultAccessToken]
     * @property [server] The resource to the Cesium ion API server.
     *   Default value - [Ion.defaultServer]
     */
    interface ConstructorOptions {
        var scene: Scene
        var accessToken: String?
        var server: Resource?
    }

    /**
     * @param [query] The query to be sent to the geocoder service
     * @param [type] The type of geocode to perform.
     *   Default value - [GeocodeType.SEARCH]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonGeocoderService.html#geocode">Online Documentation</a>
     */
    fun geocode(
        query: String,
        type: GeocodeType? = definedExternally,
    ): kotlin.js.Promise<Array<out GeocoderService.Result>>
}

inline fun IonGeocoderService(
    block: IonGeocoderService.ConstructorOptions.() -> Unit,
): IonGeocoderService {
    val options: IonGeocoderService.ConstructorOptions = js("({})")
    block(options)
    return IonGeocoderService(options)
}
