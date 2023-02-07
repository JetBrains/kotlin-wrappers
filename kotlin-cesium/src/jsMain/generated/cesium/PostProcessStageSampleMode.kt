// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Determines how input texture to a [PostProcessStage] is sampled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PostProcessStageSampleMode">Online Documentation</a>
 */

external enum class PostProcessStageSampleMode {

    /**
     * Samples the texture by returning the closest texel.
     */
    NEAREST,

    /**
     * Samples the texture through bi-linear interpolation of the four nearest texels.
     */
    LINEAR,

    ;

}
