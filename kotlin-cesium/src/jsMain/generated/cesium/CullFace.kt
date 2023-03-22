// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines which triangles, if any, are culled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CullFace">Online Documentation</a>
 */

sealed external interface CullFace {
    companion object {

        /**
         * Front-facing triangles are culled.
         */
        val FRONT: CullFace

        /**
         * Back-facing triangles are culled.
         */
        val BACK: CullFace

        /**
         * Both front-facing and back-facing triangles are culled.
         */
        val FRONT_AND_BACK: CullFace
    }
}
