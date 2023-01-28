// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Easing functions for use with TweenCollection.  These function are from
 * [Tween.js](https://github.com/sole/tween.js/) and Robert Penner.  See the
 * [Tween.js graphs for each function](http://sole.github.io/tween.js/examples/03_graphs.html).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EasingFunction.html">Online Documentation</a>
 */
external object EasingFunction {
    /**
     * Linear easing.
     */
    val LINEAR_NONE: EasingCallback

    /**
     * Quadratic in.
     */
    val QUADRATIC_IN: EasingCallback

    /**
     * Quadratic out.
     */
    val QUADRATIC_OUT: EasingCallback

    /**
     * Quadratic in then out.
     */
    val QUADRATIC_IN_OUT: EasingCallback

    /**
     * Cubic in.
     */
    val CUBIC_IN: EasingCallback

    /**
     * Cubic out.
     */
    val CUBIC_OUT: EasingCallback

    /**
     * Cubic in then out.
     */
    val CUBIC_IN_OUT: EasingCallback

    /**
     * Quartic in.
     */
    val QUARTIC_IN: EasingCallback

    /**
     * Quartic out.
     */
    val QUARTIC_OUT: EasingCallback

    /**
     * Quartic in then out.
     */
    val QUARTIC_IN_OUT: EasingCallback

    /**
     * Quintic in.
     */
    val QUINTIC_IN: EasingCallback

    /**
     * Quintic out.
     */
    val QUINTIC_OUT: EasingCallback

    /**
     * Quintic in then out.
     */
    val QUINTIC_IN_OUT: EasingCallback

    /**
     * Sinusoidal in.
     */
    val SINUSOIDAL_IN: EasingCallback

    /**
     * Sinusoidal out.
     */
    val SINUSOIDAL_OUT: EasingCallback

    /**
     * Sinusoidal in then out.
     */
    val SINUSOIDAL_IN_OUT: EasingCallback

    /**
     * Exponential in.
     */
    val EXPONENTIAL_IN: EasingCallback

    /**
     * Exponential out.
     */
    val EXPONENTIAL_OUT: EasingCallback

    /**
     * Exponential in then out.
     */
    val EXPONENTIAL_IN_OUT: EasingCallback

    /**
     * Circular in.
     */
    val CIRCULAR_IN: EasingCallback

    /**
     * Circular out.
     */
    val CIRCULAR_OUT: EasingCallback

    /**
     * Circular in then out.
     */
    val CIRCULAR_IN_OUT: EasingCallback

    /**
     * Elastic in.
     */
    val ELASTIC_IN: EasingCallback

    /**
     * Elastic out.
     */
    val ELASTIC_OUT: EasingCallback

    /**
     * Elastic in then out.
     */
    val ELASTIC_IN_OUT: EasingCallback

    /**
     * Back in.
     */
    val BACK_IN: EasingCallback

    /**
     * Back out.
     */
    val BACK_OUT: EasingCallback

    /**
     * Back in then out.
     */
    val BACK_IN_OUT: EasingCallback

    /**
     * Bounce in.
     */
    val BOUNCE_IN: EasingCallback

    /**
     * Bounce out.
     */
    val BOUNCE_OUT: EasingCallback

    /**
     * Bounce in then out.
     */
    val BOUNCE_IN_OUT: EasingCallback
}

/**
 * Function interface for implementing a custom easing function.
 * ```
 * function quadraticIn(time) {
 *     return time * time;
 * }
 * ```
 * ```
 * function quadraticOut(time) {
 *     return time * (2.0 - time);
 * }
 * ```
 * @param [time] The time in the range `[0, 1]`.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EasingFunction.html#.Callback">Online Documentation</a>
 */
typealias EasingCallback = (time: Double) -> Double
