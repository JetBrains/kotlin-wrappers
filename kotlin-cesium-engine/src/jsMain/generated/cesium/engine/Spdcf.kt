// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Variables for a Strictly Positive-Definite Correlation Function.
 *
 * This reflects the `spdcf` definition of the
 * [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp) glTF extension.
 * Instances of this type are stored as the parameters within a
 * `CorrelationGroup`.
 *
 * Parameters (A, alpha, beta, T) describe the correlation decrease
 * between points as a function of delta time:
 * ```
 * spdcf(delta_t) = A_t * (alpha_t + ((1 - alpha_t)(1 + beta_t)) / (beta_t + e^(delta_t/T_t)))
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html">Online Documentation</a>
 */
external class Spdcf(
    options: ConstructorOptions,
) {
    /**
     * In (0, 1]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html#A">Online Documentation</a>
     */
    val A: Double

    /**
     * In [0, 1)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html#alpha">Online Documentation</a>
     */
    val alpha: Double

    /**
     * In [0, 10]
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html#beta">Online Documentation</a>
     */
    val beta: Double

    /**
     * In (0, +inf)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html#T">Online Documentation</a>
     */
    val T: Double

    /**
     * Initialization options for the Spdcf constructor
     * @property [A] The factor A, in (0, 1]
     * @property [alpha] The alpha value, in [0, 1)
     * @property [beta] The beta value, in [0, 10]
     * @property [T] the tau value, in (0, +inf)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Spdcf.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        var A: Double
        var alpha: Double
        var beta: Double
        var T: Double
    }
}
