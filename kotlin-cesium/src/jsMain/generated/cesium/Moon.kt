// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * Draws the Moon in 3D.
 * ```
 * scene.moon = new Moon();
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html">Online Documentation</a>
 */
external class Moon(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [show] Determines whether the moon will be rendered.
     *   Default value - `true`
     * @property [textureUrl] The moon texture.
     *   Default value - `buildModuleUrl('Assets/Textures/moonSmall.jpg')`
     * @property [ellipsoid] The moon ellipsoid.
     *   Default value - [Ellipsoid.MOON]
     * @property [onlySunLighting] Use the sun as the only light source.
     *   Default value - `true`
     */
    interface ConstructorOptions {
        var show: Boolean?
        var textureUrl: String?
        var ellipsoid: Ellipsoid?
        var onlySunLighting: Boolean?
    }

    /**
     * Determines if the moon will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * The moon texture.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#textureUrl">Online Documentation</a>
     */
    var textureUrl: String

    /**
     * Use the sun as the only light source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#onlySunLighting">Online Documentation</a>
     */
    var onlySunLighting: Boolean

    /**
     * Get the ellipsoid that defines the shape of the moon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#ellipsoid">Online Documentation</a>
     */
    val ellipsoid: Ellipsoid

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#isDestroyed">Online Documentation</a>
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
     * moon = moon && moon.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Moon.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

inline fun Moon(
    block: Moon.ConstructorOptions.() -> Unit,
): Moon =
    Moon(options = jso(block))
