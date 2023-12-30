// Automatically generated - do not modify!

package web.geolocation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError)
 */
sealed external class GeolocationPositionError {
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
