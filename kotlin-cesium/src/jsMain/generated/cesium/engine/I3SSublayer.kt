// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium.engine

import js.array.ReadonlyArray

/**
 * This class implements an I3S sublayer for Building Scene Layer.
 *
 * This object is normally not instantiated directly, use [I3SSublayer.fromData].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html">Online Documentation</a>
 */
external class I3SSublayer {
    /**
     * Gets the resource for the sublayer
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * Gets the name for the sublayer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * Gets the model name for the sublayer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#modelName">Online Documentation</a>
     */
    val modelName: String

    /**
     * Gets the collection of child sublayers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#sublayers">Online Documentation</a>
     */
    val sublayers: ReadonlyArray<I3SSublayer>

    /**
     * Gets or sets the sublayer visibility.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#visibility">Online Documentation</a>
     */
    var visibility: Boolean

    /**
     * Determines if the sublayer will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SSublayer.html#show">Online Documentation</a>
     */
    val show: Boolean
}
