// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import dom.html.HTMLImageElement

/**
 * A policy for discarding tile images that contain no data (and so aren't actually images).
 * This policy discards [DiscardEmptyTileImagePolicy.EMPTY_IMAGE], which is
 * expected to be used in place of any empty tile images by the image loading code.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardEmptyTileImagePolicy.html">Online Documentation</a>
 */
external class DiscardEmptyTileImagePolicy : TileDiscardPolicy {
    /**
     * Determines if the discard policy is ready to process images.
     * @return True if the discard policy is ready to process images; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardEmptyTileImagePolicy.html#isReady">Online Documentation</a>
     */
    override fun isReady(): Boolean

    /**
     * Given a tile image, decide whether to discard that image.
     * @param [image] An image to test.
     * @return True if the image should be discarded; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardEmptyTileImagePolicy.html#shouldDiscardImage">Online Documentation</a>
     */
    override fun shouldDiscardImage(image: HTMLImageElement): Boolean

    companion object {
        /**
         * Default value for representing an empty image.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardEmptyTileImagePolicy.html#.EMPTY_IMAGE">Online Documentation</a>
         */
        val EMPTY_IMAGE: HTMLImageElement
    }
}
