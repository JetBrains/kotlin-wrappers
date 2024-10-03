// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Metadata for one stored anchor point.
 *
 * This reflects the `anchronPointIndirect` definition of the
 * [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp) glTF extension.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html">Online Documentation</a>
 */
external class AnchorPointIndirect(
    options: ConstructorOptions,
) {
    /**
     * Anchor point geographic coordinates in meters as X/Easting, Y/Northing, Z/HAE
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html#position">Online Documentation</a>
     */
    val position: Cartesian3

    /**
     * The delta-x delta-y delta-z adjustment values in meters per anchor
     * point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html#adjustmentParams">Online Documentation</a>
     */
    val adjustmentParams: Cartesian3

    /**
     * The 3x3 covariance matrix.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html#covarianceMatrix">Online Documentation</a>
     */
    val covarianceMatrix: Matrix3

    /**
     * Initialization options for the AnchorPointIndirect constructor
     * @property [position] Anchor point geographic coordinates
     * @property [adjustmentParams] The adjustment values in meters
     * @property [covarianceMatrix] The 3x3 covariance matrix
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointIndirect.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var position: Cartesian3
        var adjustmentParams: Cartesian3
        var covarianceMatrix: Matrix3
    }
}
