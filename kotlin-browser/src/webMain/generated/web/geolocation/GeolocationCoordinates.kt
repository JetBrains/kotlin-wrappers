// Automatically generated - do not modify!

package web.geolocation

import kotlin.js.JsAny

/**
 * The **`GeolocationCoordinates`** interface represents the position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated. The geographic position information is provided in terms of World Geodetic System coordinates (WGS84).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates)
 */
open external class GeolocationCoordinates
private constructor() {
    /**
     * The **`accuracy`** read-only property of the GeolocationCoordinates interface is a strictly positive double representing the accuracy, with a 95% confidence level, of the GeolocationCoordinates.latitude and GeolocationCoordinates.longitude properties expressed in meters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/accuracy)
     */
    val accuracy: Double

    /**
     * The **`altitude`** read-only property of the GeolocationCoordinates interface is a double representing the altitude of the position in meters above the WGS84 ellipsoid (which defines the nominal sea level surface). This value is null if the implementation cannot provide this data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitude)
     */
    val altitude: Double?

    /**
     * The **`altitudeAccuracy`** read-only property of the GeolocationCoordinates interface is a strictly positive double representing the accuracy, with a 95% confidence level, of the altitude expressed in meters. This value is null if the implementation doesn't support measuring altitude.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitudeAccuracy)
     */
    val altitudeAccuracy: Double?

    /**
     * The **`heading`** read-only property of the GeolocationCoordinates interface is a double representing the direction in which the device is traveling. This value, specified in degrees, indicates how far off from heading due north the device is. 0 degrees represents true north, and the direction is determined clockwise (which means that east is 90 degrees and west is 270 degrees). If GeolocationCoordinates.speed is 0 or the device is not able to provide heading information, heading is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/heading)
     */
    val heading: Double?

    /**
     * The **`latitude`** read-only property of the GeolocationCoordinates interface is a double representing the latitude of the position in decimal degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/latitude)
     */
    val latitude: Double

    /**
     * The **`longitude`** read-only property of the GeolocationCoordinates interface is a number which represents the longitude of a geographical position, specified in decimal degrees. Together with a timestamp, given as Unix time in milliseconds, indicating a time of measurement, the GeolocationCoordinates object is part of the GeolocationPosition interface, which is the object type returned by Geolocation API functions that obtain and return a geographical position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/longitude)
     */
    val longitude: Double

    /**
     * The **`speed`** read-only property of the GeolocationCoordinates interface is a double representing the velocity of the device in meters per second. This value is null if the implementation is not able to measure it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/speed)
     */
    val speed: Double?

    /**
     * The **`toJSON()`** method of the GeolocationCoordinates interface is a serializer; it returns a JSON representation of the GeolocationCoordinates object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/toJSON)
     */
    fun toJSON(): JsAny
}
