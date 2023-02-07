// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import web.html.HTMLImageElement

/**
 * A [TileDiscardPolicy] specifying that tile images should never be discard.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NeverTileDiscardPolicy.html">Online Documentation</a>
 */
external class NeverTileDiscardPolicy : TileDiscardPolicy {
    /**
     * Determines if the discard policy is ready to process images.
     * @return True if the discard policy is ready to process images; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NeverTileDiscardPolicy.html#isReady">Online Documentation</a>
     */
    override fun isReady(): Boolean

    /**
     * Given a tile image, decide whether to discard that image.
     * @param [image] An image to test.
     * @return True if the image should be discarded; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NeverTileDiscardPolicy.html#shouldDiscardImage">Online Documentation</a>
     */
    override fun shouldDiscardImage(image: HTMLImageElement): Boolean
}
