// Automatically generated - do not modify!

package web.geolocation

sealed external class Geolocation {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/clearWatch) */
    fun clearWatch(watchId: GeolocationWatchId)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/getCurrentPosition) */
    fun getCurrentPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition) */
    fun watchPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    ): GeolocationWatchId
}
