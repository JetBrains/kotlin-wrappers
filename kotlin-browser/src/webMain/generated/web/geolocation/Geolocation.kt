// Automatically generated - do not modify!

package web.geolocation

import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Geolocation`** interface represents an object able to obtain the position of the device programmatically. It gives Web content access to the location of the device. This allows a website or app to offer customized results based on the user's location.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation)
 */
open external class Geolocation
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
    @JsName("getCurrentPosition")
    fun getCurrentPositionWithCallbacks(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    )

    /**
     * The **`watchPosition()`** method of the Geolocation interface is used to register a handler function that will be called automatically each time the position of the device changes. You can also, optionally, specify an error handling callback function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Geolocation/watchPosition)
     */
    @JsName("watchPosition")
    fun watchPositionWithCallbacks(
        successCallback: PositionCallback,
        errorCallback: PositionErrorCallback? = definedExternally,
        options: PositionOptions = definedExternally,
    ): GeolocationWatchId
}
