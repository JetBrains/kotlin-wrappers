// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * The lighting model to use for lighting a [Model].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#LightingModel">Online Documentation</a>
 */

external enum class LightingModel {

    /**
     * Use unlit shading, i.e. skip lighting calculations. The model's
     * diffuse color (assumed to be linear RGB, not sRGB) is used directly
     * when computing `gl_FragColor`. The alpha mode is still
     * applied.
     */
    UNLIT,

    /**
     * Use physically-based rendering lighting calculations. This includes
     * both PBR metallic roughness and PBR specular glossiness. Image-based
     * lighting is also applied when possible.
     */
    PBR,

    ;

}
