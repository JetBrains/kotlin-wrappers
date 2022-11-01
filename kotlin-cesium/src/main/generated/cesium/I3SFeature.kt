// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * This class implements an I3S Feature.
 *
 * Do not construct this directly, instead access tiles through [I3SNode].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html">Online Documentation</a>
 */
sealed external class I3SFeature {
    /**
     * Gets the resource for the feature
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html#data">Online Documentation</a>
     */
    val data: Any
}
