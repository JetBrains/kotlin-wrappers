// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.array.ReadonlyArray

/**
 * This class implements an I3S statistics for Building Scene Layer.
 *
 * Do not construct this directly, instead access statistics through [I3SDataProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SStatistics.html">Online Documentation</a>
 */
sealed external class I3SStatistics {
    /**
     * Gets the resource for the statistics
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SStatistics.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SStatistics.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * Gets the collection of attribute names.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SStatistics.html#names">Online Documentation</a>
     */
    val names: ReadonlyArray<String>
}
