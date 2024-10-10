// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Metadata for one stored anchor point using direct storage.
 *
 * This reflects the `anchronPointDirect` definition of the
 * [NGA_gpm_local](https://nsgreg.nga.mil/csmwg.jsp) glTF extension.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointDirect.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointDirect.html">Online Documentation</a>
 */
external class AnchorPointDirect(
    options: ConstructorOptions,
) {
    /**
     * Anchor point geographic coordinates in meters as X/Easting, Y/Northing, Z/HAE
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointDirect.html#position">Online Documentation</a>
     */
    val position: Cartesian3

    /**
     * The delta-x delta-y delta-z adjustment values in meters per anchor
     * point.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointDirect.html#adjustmentParams">Online Documentation</a>
     */
    val adjustmentParams: Cartesian3

    /**
     * Initialization options for the AnchorPointDirect constructor
     * @property [position] Anchor point geographic coordinates
     * @property [adjustmentParams] The adjustment values in meters
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AnchorPointDirect.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        val position: Cartesian3
        val adjustmentParams: Cartesian3
    }
}
