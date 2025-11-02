// Automatically generated - do not modify!

package web.geolocation

import web.time.EpochTimeStamp
import kotlin.js.JsAny

/**
 * The **`GeolocationPosition`** interface represents the position of the concerned device at a given time. The position, represented by a GeolocationCoordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition)
 */
open external class GeolocationPosition
private constructor() {
    /**
     * The **`coords`** read-only property of the GeolocationPosition interface returns a GeolocationCoordinates object representing a geographic position. It contains the location, that is longitude and latitude on the Earth, the altitude, and the speed of the object concerned, regrouped inside the returned value. It also contains accuracy information about these values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/coords)
     */
    val coords: GeolocationCoordinates

    /**
     * The **`timestamp`** read-only property of the GeolocationPosition interface represents the date and time that the position was acquired by the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/timestamp)
     */
    val timestamp: EpochTimeStamp

    /**
     * The **`toJSON()`** method of the GeolocationPosition interface is a serializer; it returns a JSON representation of the GeolocationPosition object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/toJSON)
     */
    fun toJSON(): JsAny
}
