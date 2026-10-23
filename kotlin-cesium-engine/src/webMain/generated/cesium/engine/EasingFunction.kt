// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

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
    val LINEAR_NONE: Callback

    /**
     * Quadratic in.
     */
    val QUADRATIC_IN: Callback

    /**
     * Quadratic out.
     */
    val QUADRATIC_OUT: Callback

    /**
     * Quadratic in then out.
     */
    val QUADRATIC_IN_OUT: Callback

    /**
     * Cubic in.
     */
    val CUBIC_IN: Callback

    /**
     * Cubic out.
     */
    val CUBIC_OUT: Callback

    /**
     * Cubic in then out.
     */
    val CUBIC_IN_OUT: Callback

    /**
     * Quartic in.
     */
    val QUARTIC_IN: Callback

    /**
     * Quartic out.
     */
    val QUARTIC_OUT: Callback

    /**
     * Quartic in then out.
     */
    val QUARTIC_IN_OUT: Callback

    /**
     * Quintic in.
     */
    val QUINTIC_IN: Callback

    /**
     * Quintic out.
     */
    val QUINTIC_OUT: Callback

    /**
     * Quintic in then out.
     */
    val QUINTIC_IN_OUT: Callback

    /**
     * Sinusoidal in.
     */
    val SINUSOIDAL_IN: Callback

    /**
     * Sinusoidal out.
     */
    val SINUSOIDAL_OUT: Callback

    /**
     * Sinusoidal in then out.
     */
    val SINUSOIDAL_IN_OUT: Callback

    /**
     * Exponential in.
     */
    val EXPONENTIAL_IN: Callback

    /**
     * Exponential out.
     */
    val EXPONENTIAL_OUT: Callback

    /**
     * Exponential in then out.
     */
    val EXPONENTIAL_IN_OUT: Callback

    /**
     * Circular in.
     */
    val CIRCULAR_IN: Callback

    /**
     * Circular out.
     */
    val CIRCULAR_OUT: Callback

    /**
     * Circular in then out.
     */
    val CIRCULAR_IN_OUT: Callback

    /**
     * Elastic in.
     */
    val ELASTIC_IN: Callback

    /**
     * Elastic out.
     */
    val ELASTIC_OUT: Callback

    /**
     * Elastic in then out.
     */
    val ELASTIC_IN_OUT: Callback

    /**
     * Back in.
     */
    val BACK_IN: Callback

    /**
     * Back out.
     */
    val BACK_OUT: Callback

    /**
     * Back in then out.
     */
    val BACK_IN_OUT: Callback

    /**
     * Bounce in.
     */
    val BOUNCE_IN: Callback

    /**
     * Bounce out.
     */
    val BOUNCE_OUT: Callback

    /**
     * Bounce in then out.
     */
    val BOUNCE_IN_OUT: Callback

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
    typealias Callback = (time: Double) -> Double
}
