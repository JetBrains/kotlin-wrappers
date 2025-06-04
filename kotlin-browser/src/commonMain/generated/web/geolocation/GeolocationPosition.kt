// Automatically generated - do not modify!

package web.geolocation

import js.core.JsAny
import web.time.EpochTimeStamp

/**
 * The **`GeolocationPosition`** interface represents the position of the concerned device at a given time.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition)
 */
external class GeolocationPosition
private constructor() {
    /**
     * The **`coords`** read-only property of the GeolocationPosition interface returns a GeolocationCoordinates object representing a geographic position.
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
     * The **`toJSON()`** method of the GeolocationPosition interface is a Serialization; it returns a JSON representation of the GeolocationPosition object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/toJSON)
     */
    fun toJSON(): JsAny
}
