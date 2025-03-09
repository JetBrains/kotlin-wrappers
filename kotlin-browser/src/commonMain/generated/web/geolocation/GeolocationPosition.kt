// Automatically generated - do not modify!

package web.geolocation

import web.time.EpochTimeStamp

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition)
 */
external class GeolocationPosition
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/coords)
     */
    val coords: GeolocationCoordinates

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/timestamp)
     */
    val timestamp: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/toJSON)
     */
    fun toJSON(): Any
}
