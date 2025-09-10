// Automatically generated - do not modify!

package web.geolocation

import kotlin.js.JsAny

/**
 * The **`GeolocationCoordinates`** interface represents the position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates)
 */
open external class GeolocationCoordinates
private constructor() {
    /**
     * The **`accuracy`** read-only property of the GeolocationCoordinates interface is a strictly positive `double` representing the accuracy, with a 95% confidence level, of the GeolocationCoordinates.latitude and GeolocationCoordinates.longitude properties expressed in meters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/accuracy)
     */
    val accuracy: Double

    /**
     * The **`altitude`** read-only property of the GeolocationCoordinates interface is a `double` representing the altitude of the position in meters above the WGS84 ellipsoid (which defines the nominal sea level surface).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitude)
     */
    val altitude: Double?

    /**
     * The **`altitudeAccuracy`** read-only property of the GeolocationCoordinates interface is a strictly positive `double` representing the accuracy, with a 95% confidence level, of the `altitude` expressed in meters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitudeAccuracy)
     */
    val altitudeAccuracy: Double?

    /**
     * The **`heading`** read-only property of the GeolocationCoordinates interface is a `double` representing the direction in which the device is traveling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/heading)
     */
    val heading: Double?

    /**
     * The **`latitude`** read-only property of the GeolocationCoordinates interface is a `double` representing the latitude of the position in decimal degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/latitude)
     */
    val latitude: Double

    /**
     * The **`longitude`** read-only property of the GeolocationCoordinates interface is a number which represents the longitude of a geographical position, specified in decimal degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/longitude)
     */
    val longitude: Double

    /**
     * The **`speed`** read-only property of the GeolocationCoordinates interface is a `double` representing the velocity of the device in meters per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/speed)
     */
    val speed: Double?

    /**
     * The **`toJSON()`** method of the GeolocationCoordinates interface is a Serialization; it returns a JSON representation of the GeolocationCoordinates object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/toJSON)
     */
    fun toJSON(): JsAny
}
