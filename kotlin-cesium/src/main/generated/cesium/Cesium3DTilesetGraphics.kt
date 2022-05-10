// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A 3D Tiles tileset represented by an [Entity].
 * The tileset modelMatrix is determined by the containing Entity position and orientation
 * or is left unset if position is undefined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html">Online Documentation</a>
 */
external class Cesium3DTilesetGraphics {
    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the boolean Property specifying the visibility of the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#show">Online Documentation</a>
     */
    var show: Property?

    /**
     * Gets or sets the string Property specifying the URI of the glTF asset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#uri">Online Documentation</a>
     */
    var uri: Property?

    /**
     * Gets or sets the maximum screen space error used to drive level of detail refinement.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#maximumScreenSpaceError">Online Documentation</a>
     */
    var maximumScreenSpaceError: Property?

    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#clone">Online Documentation</a>
     */
    fun clone(result: Cesium3DTilesetGraphics? = definedExternally): Cesium3DTilesetGraphics

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesetGraphics.html#merge">Online Documentation</a>
     */
    fun merge(source: Cesium3DTilesetGraphics)
}

inline fun Cesium3DTilesetGraphics(
    block: Cesium3DTilesetGraphics.() -> Unit,
): Cesium3DTilesetGraphics =
    Cesium3DTilesetGraphics().apply(block)
