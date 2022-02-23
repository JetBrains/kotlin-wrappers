// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A policy for discarding tile images that match a known image containing a
 * "missing" image.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardMissingTileImagePolicy.html">Online Documentation</a>
 */
external class DiscardMissingTileImagePolicy(options: ConstructorOptions) : TileDiscardPolicy {
    /**
     * @property [missingImageUrl] The URL of the known missing image.
     * @property [pixelsToCheck] An array of [Cartesian2] pixel positions to
     *   compare against the missing image.
     * @property [disableCheckIfAllPixelsAreTransparent] If true, the discard check will be disabled
     *   if all of the pixelsToCheck in the missingImageUrl have an alpha value of 0.  If false, the
     *   discard check will proceed no matter the values of the pixelsToCheck.
     *   Default value - `false`
     */
    interface ConstructorOptions {
        var missingImageUrl: Resource
        var pixelsToCheck: Array<out Cartesian2>
        var disableCheckIfAllPixelsAreTransparent: Boolean?
    }

    /**
     * Determines if the discard policy is ready to process images.
     * @return True if the discard policy is ready to process images; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardMissingTileImagePolicy.html#isReady">Online Documentation</a>
     */
    override fun isReady(): Boolean

    /**
     * Given a tile image, decide whether to discard that image.
     * @param [image] An image to test.
     * @return True if the image should be discarded; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DiscardMissingTileImagePolicy.html#shouldDiscardImage">Online Documentation</a>
     */
    override fun shouldDiscardImage(image: org.w3c.dom.HTMLImageElement): Boolean
}

inline fun DiscardMissingTileImagePolicy(
    block: DiscardMissingTileImagePolicy.ConstructorOptions.() -> Unit,
): DiscardMissingTileImagePolicy {
    val options: DiscardMissingTileImagePolicy.ConstructorOptions = js("({})")
    block(options)
    return DiscardMissingTileImagePolicy(options)
}
