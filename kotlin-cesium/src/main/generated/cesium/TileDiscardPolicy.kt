// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A policy for discarding tile images according to some criteria.  This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileDiscardPolicy.html">Online Documentation</a>
 */
abstract external class TileDiscardPolicy {
    /**
     * Determines if the discard policy is ready to process images.
     * @return True if the discard policy is ready to process images; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileDiscardPolicy.html#isReady">Online Documentation</a>
     */
    abstract fun isReady(): Boolean

    /**
     * Given a tile image, decide whether to discard that image.
     * @param [image] An image to test.
     * @return True if the image should be discarded; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileDiscardPolicy.html#shouldDiscardImage">Online Documentation</a>
     */
    abstract fun shouldDiscardImage(image: org.w3c.dom.HTMLImageElement): Boolean
}
