// Automatically generated - do not modify!

package web.geolocation

/**
 * The **`GeolocationPositionError`** interface represents the reason of an error occurring when using the geolocating device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError)
 */
external class GeolocationPositionError
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/code)
     */
    val code: Code

    /**
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
