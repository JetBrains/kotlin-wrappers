// Automatically generated - do not modify!

package web.geolocation

/**
 * An object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation)
 */
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
