// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A viewport aligned quad.
 * ```
 * const viewportQuad = new ViewportQuad(new BoundingRectangle(0, 0, 80, 40));
 * viewportQuad.material.uniforms.color = new Color(1.0, 0.0, 0.0, 1.0);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html">Online Documentation</a>
 *
 * @constructor
 * @property [rectangle] The [BoundingRectangle] defining the quad's position within the viewport.
 * @property [material] The [Material] defining the surface appearance of the viewport quad.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html">Online Documentation</a>
 */
external class ViewportQuad(
    var rectangle: BoundingRectangle = definedExternally,
    var material: Material = definedExternally,
) {
    /**
     * Determines if the viewport quad primitive will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Called when [Viewer] or [CesiumWidget] render the scene to
     * get the draw commands needed to render this primitive.
     *
     * Do not call this function directly.  This is documented just to
     * list the exceptions that may be propagated when the scene is rendered:
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * quad = quad && quad.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ViewportQuad.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
