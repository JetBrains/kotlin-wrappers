// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlin.js.JsModule

/**
 * Determines how input texture to a [PostProcessStage] is sampled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PostProcessStageSampleMode">Online Documentation</a>
 */
external class PostProcessStageSampleMode
private constructor() {
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
