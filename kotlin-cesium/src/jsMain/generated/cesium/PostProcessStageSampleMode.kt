// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines how input texture to a [PostProcessStage] is sampled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PostProcessStageSampleMode">Online Documentation</a>
 */

sealed external interface PostProcessStageSampleMode {
    companion object {

        /**
         * Samples the texture by returning the closest texel.
         */
        val NEAREST: PostProcessStageSampleMode

        /**
         * Samples the texture through bi-linear interpolation of the four nearest texels.
         */
        val LINEAR: PostProcessStageSampleMode
    }
}
