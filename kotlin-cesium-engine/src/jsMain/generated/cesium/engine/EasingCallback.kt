// Automatically generated - do not modify!

package cesium.engine

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
