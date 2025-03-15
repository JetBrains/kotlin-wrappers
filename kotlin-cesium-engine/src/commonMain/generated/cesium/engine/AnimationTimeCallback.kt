// Automatically generated - do not modify!

package cesium.engine

/**
 * A function used to compute the local animation time for a ModelAnimation.
 * ```
 * // Use real time for model animation (assuming animateWhilePaused was set to true)
 * function animationTime(duration) {
 *     return Date.now() / 1000 / duration;
 * }
 * ```
 * ```
 * // Offset the phase of the animation, so it starts halfway through its cycle.
 * function animationTime(duration, seconds) {
 *     return seconds / duration + 0.5;
 * }
 * ```
 * @param [duration] The animation's original duration in seconds.
 * @param [seconds] The seconds since the animation started, in scene time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimation.html#.AnimationTimeCallback">Online Documentation</a>
 */
typealias AnimationTimeCallback = (duration: Double, seconds: Double) -> Double
