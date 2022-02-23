// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Draws the axes of a reference frame defined by a matrix that transforms to world
 * coordinates, i.e., Earth's WGS84 coordinates.  The most prominent example is
 * a primitives `modelMatrix`.
 *
 * The X axis is red; Y is green; and Z is blue.
 *
 * This is for debugging only; it is not optimized for production use.
 * ```
 * primitives.add(new DebugModelMatrixPrimitive({
 *   modelMatrix : primitive.modelMatrix,  // primitive to debug
 *   length : 100000.0,
 *   width : 10.0
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html">Online Documentation</a>
 */
external class DebugModelMatrixPrimitive {
    /**
     * The length of the axes in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * The width of the axes in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#width">Online Documentation</a>
     */
    var width: Double

    /**
     * Determines if this primitive will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The 4x4 matrix that defines the reference frame, i.e., origin plus axes, to visualize.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#modelMatrix">Online Documentation</a>
     */
    var modelMatrix: Matrix4

    /**
     * User-defined value returned when the primitive is picked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#id">Online Documentation</a>
     */
    var id: Any

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#isDestroyed">Online Documentation</a>
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
     * p = p && p.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DebugModelMatrixPrimitive.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun DebugModelMatrixPrimitive(
    block: DebugModelMatrixPrimitive.() -> Unit,
): DebugModelMatrixPrimitive =
    DebugModelMatrixPrimitive().apply(block)
