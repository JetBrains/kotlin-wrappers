// Automatically generated - do not modify!

package web.geolocation

sealed external class Geolocation {
    fun clearWatch(watchId: GeolocationWatchId)
    fun getCurrentPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    )

    fun watchPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    ): GeolocationWatchId
}
