// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Metadata identifying parameters using same correlation modeling and
 * associated correlation parameters.
 *
 * This reflects the `correlationGroup` definition of the
 * [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp) glTF extension.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html">Online Documentation</a>
 */
external class CorrelationGroup(
    options: ConstructorOptions,
) {
    /**
     * Array of 3 booleans indicating if parameters delta-x delta-y delta-z
     * used in the correlation group
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html#groupFlags">Online Documentation</a>
     */
    val groupFlags: ReadonlyArray<Boolean>

    /**
     * Rotations in milliradians about X, Y, Z axes, respectively
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html#rotationThetas">Online Documentation</a>
     */
    val rotationThetas: Cartesian3

    /**
     * Array of 3 sets of SPDCF parameters, for the U, V, W directions, respectively
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html#params">Online Documentation</a>
     */
    val params: ReadonlyArray<Spdcf>

    /**
     * Initialization options for the CorrelationGroup constructor
     * @property [groupFlags] Array of 3 booleans indicating if
     *   parameters delta-x delta-y delta-z used in the correlation group
     * @property [rotationThetas] Rotations in milliradians
     *   about X, Y, Z axes, respectively
     * @property [params] Array of `Spdcf` (Strictly Positive-Definite
     *   Correlation Function) parameters, for the U, V, W directions, respectively
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CorrelationGroup.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val groupFlags: ReadonlyArray<Boolean>
        val rotationThetas: Cartesian3
        val params: ReadonlyArray<Spdcf>
    }
}
