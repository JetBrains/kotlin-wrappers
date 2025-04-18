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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/clearWatch)
     */
    fun clearWatch(watchId: GeolocationWatchId)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/getCurrentPosition)
     */
    fun getCurrentPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition)
     */
    fun watchPosition(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    ): GeolocationWatchId
}
