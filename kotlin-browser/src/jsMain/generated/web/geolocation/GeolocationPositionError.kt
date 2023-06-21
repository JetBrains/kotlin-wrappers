// Automatically generated - do not modify!

package web.geolocation

sealed external class GeolocationPositionError {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/code) */
    val code: Short

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/message) */
    val message: String
    val PERMISSION_DENIED: Short
    val POSITION_UNAVAILABLE: Short
    val TIMEOUT: Short

    companion object {
        val PERMISSION_DENIED: Short
        val POSITION_UNAVAILABLE: Short
        val TIMEOUT: Short
    }
}
