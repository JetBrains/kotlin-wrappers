// Automatically generated - do not modify!

package web.geolocation

import kotlin.js.definedExternally

/**
 * The **`Geolocation`** interface represents an object able to obtain the position of the device programmatically.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation)
 */
external class Geolocation
private constructor() {
    /**
     * The **`clearWatch()`** method of the Geolocation interface is used to unregister location/error monitoring handlers previously installed using Geolocation.watchPosition().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/clearWatch)
     */
    fun clearWatch(watchId: GeolocationWatchId)

    /**
     * The **`getCurrentPosition()`** method of the Geolocation interface is used to get the current position of the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/getCurrentPosition)
     */
    fun getCurrentPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    )

    /**
     * The **`watchPosition()`** method of the Geolocation interface is used to register a handler function that will be called automatically each time the position of the device changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition)
     */
    fun watchPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    ): GeolocationWatchId
}
