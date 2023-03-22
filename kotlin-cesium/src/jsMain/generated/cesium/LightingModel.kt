// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The lighting model to use for lighting a [Model].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#LightingModel">Online Documentation</a>
 */
sealed external interface LightingModel {
    companion object {

        /**
         * Use unlit shading, i.e. skip lighting calculations. The model's
         * diffuse color (assumed to be linear RGB, not sRGB) is used directly
         * when computing `out_FragColor`. The alpha mode is still
         * applied.
         */
        val UNLIT: LightingModel

        /**
         * Use physically-based rendering lighting calculations. This includes
         * both PBR metallic roughness and PBR specular glossiness. Image-based
         * lighting is also applied when possible.
         */
        val PBR: LightingModel
    }
}
