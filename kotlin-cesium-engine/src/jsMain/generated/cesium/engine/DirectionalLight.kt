// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.objects.JsPlainObject

/**
 * A light that gets emitted in a single direction from infinitely far away.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DirectionalLight.html">Online Documentation</a>
 */
external class DirectionalLight(
    options: ConstructorOptions,
) : Light {
    /**
     * @property [direction] The direction in which light gets emitted.
     * @property [color] The color of the light.
     *   Default value - [Color.WHITE]
     * @property [intensity] The intensity of the light.
     *   Default value - `1.0`
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var direction: Cartesian3
        var color: Color?
        var intensity: Double?
    }

    /**
     * The direction in which light gets emitted.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DirectionalLight.html#direction">Online Documentation</a>
     */
    var direction: Cartesian3

    /**
     * The color of the light.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DirectionalLight.html#color">Online Documentation</a>
     */
    override var color: Color

    /**
     * The intensity of the light.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DirectionalLight.html#intensity">Online Documentation</a>
     */
    override var intensity: Double
}
