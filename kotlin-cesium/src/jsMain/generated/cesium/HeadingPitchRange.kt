// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Defines a heading angle, pitch angle, and range in a local frame.
 * Heading is the rotation from the local north direction where a positive angle is increasing eastward.
 * Pitch is the rotation from the local xy-plane. Positive pitch angles are above the plane. Negative pitch
 * angles are below the plane. Range is the distance from the center of the frame.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRange.html">Online Documentation</a>
 *
 * @constructor
 * @property [heading] The heading angle in radians.
 *   Default value - `0.0`
 * @property [pitch] The pitch angle in radians.
 *   Default value - `0.0`
 * @property [range] The distance from the center in meters.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRange.html">Online Documentation</a>
 */
external class HeadingPitchRange(
    var heading: Double = definedExternally,
    var pitch: Double = definedExternally,
    var range: Double = definedExternally,
) {


    companion object {
        /**
         * Duplicates a HeadingPitchRange instance.
         * @param [hpr] The HeadingPitchRange to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new HeadingPitchRange instance if one was not provided. (Returns undefined if hpr is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HeadingPitchRange.html#.clone">Online Documentation</a>
         */
        fun clone(
            hpr: HeadingPitchRange,
            result: HeadingPitchRange? = definedExternally,
        ): HeadingPitchRange
    }
}
