// Automatically generated - do not modify!

package web.geolocation

import js.errors.JsErrorLike

/**
 * The **`GeolocationPositionError`** interface represents the reason of an error occurring when using the geolocating device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError)
 */
open external class GeolocationPositionError
private constructor() :
    JsErrorLike {
    /**
     * The **`code`** read-only property of the GeolocationPositionError interface is an unsigned short representing the error code.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/code)
     */
    val code: Code

    /**
     * The **`message`** read-only property of the GeolocationPositionError interface returns a human-readable string describing the details of the error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/message)
     */
    val message: String
    val PERMISSION_DENIED: Code
    val POSITION_UNAVAILABLE: Code
    val TIMEOUT: Code

    companion object {
        val PERMISSION_DENIED: Code
        val POSITION_UNAVAILABLE: Code
        val TIMEOUT: Code
    }

    sealed interface Code
}
