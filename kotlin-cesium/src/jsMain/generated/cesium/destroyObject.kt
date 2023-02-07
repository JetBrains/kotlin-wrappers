// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Destroys an object.  Each of the object's functions, including functions in its prototype,
 * is replaced with a function that throws a [DeveloperError], except for the object's
 * `isDestroyed` function, which is set to a function that returns `true`.
 * The object's properties are removed with `delete`.
 *
 * This function is used by objects that hold native resources, e.g., WebGL resources, which
 * need to be explicitly released.  Client code calls an object's `destroy` function,
 * which then releases the native resource and calls `destroyObject` to put itself
 * in a destroyed state.
 * ```
 * // How a texture would destroy itself.
 * this.destroy = function () {
 *     _gl.deleteTexture(_texture);
 *     return destroyObject(this);
 * };
 * ```
 * @param [object] The object to destroy.
 * @param [message] The message to include in the exception that is thrown if
 *   a destroyed object's function is called.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/destroyObject.html">Online Documentation</a>
 */
external fun destroyObject(
    obj: Any,
    message: String? = definedExternally,
)
