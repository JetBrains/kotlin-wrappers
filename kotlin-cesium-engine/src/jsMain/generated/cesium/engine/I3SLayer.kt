// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

/**
 * This class implements an I3S layer. In CesiumJS each I3SLayer creates a Cesium3DTileset.
 *
 * Do not construct this directly, instead access layers through [I3SDataProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html">Online Documentation</a>
 */
external class I3SLayer
private constructor() {
    /**
     * Gets the resource for the layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the root node of this layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#rootNode">Online Documentation</a>
     */
    val rootNode: I3SNode

    /**
     * Gets the Cesium3DTileset for this layer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset?

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * The version string of the loaded I3S dataset
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#version">Online Documentation</a>
     */
    val version: String

    /**
     * The major version number of the loaded I3S dataset
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#majorVersion">Online Documentation</a>
     */
    val majorVersion: Double

    /**
     * The minor version number of the loaded I3S dataset
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#minorVersion">Online Documentation</a>
     */
    val minorVersion: Double

    /**
     * When `true`, when the loaded I3S version is 1.6 or older
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#legacyVersion16">Online Documentation</a>
     */
    val legacyVersion16: Boolean

    /**
     * Filters the drawn elements of a layer to specific attribute names and values
     * @param [filters] The collection of attribute filters
     *   Default value - `[]`
     * @return A promise that is resolved when the filter is applied
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SLayer.html#filterByAttributes">Online Documentation</a>
     */
    @JsAsync
    suspend fun filterByAttributes(filters: ReadonlyArray<I3SNode.AttributeFilter>? = definedExternally)

    @JsName("filterByAttributes")
    fun filterByAttributesAsync(filters: ReadonlyArray<I3SNode.AttributeFilter>? = definedExternally): Promise<Void>
}
