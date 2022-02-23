// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A directional light source that originates from the Sun.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SunLight.html">Online Documentation</a>
 */
external class SunLight : Light {
    /**
     * The color of the light.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SunLight.html#color">Online Documentation</a>
     */
    override var color: Color

    /**
     * The intensity of the light.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SunLight.html#intensity">Online Documentation</a>
     */
    override var intensity: Double
}

inline fun SunLight(
    block: SunLight.() -> Unit,
): SunLight =
    SunLight().apply(block)
