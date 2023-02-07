// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A light source. This type describes an interface and is not intended to be instantiated directly. Together, `color` and `intensity` produce a high-dynamic-range light color. `intensity` can also be used individually to dim or brighten the light without changing the hue.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Light.html">Online Documentation</a>
 */
abstract external class Light {
    /**
     * The color of the light.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Light.html#color">Online Documentation</a>
     */
    abstract var color: Color

    /**
     * The intensity controls the strength of the light. `intensity` has a minimum value of 0.0 and no maximum value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Light.html#intensity">Online Documentation</a>
     */
    abstract var intensity: Double
}
