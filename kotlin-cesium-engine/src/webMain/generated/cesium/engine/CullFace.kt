// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines which triangles, if any, are culled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CullFace">Online Documentation</a>
 */
sealed /* enum */
external interface CullFace {
    companion object {

        /**
         * Front-facing triangles are culled.
         *
         * Value - [WebGL2RenderingContext.FRONT]
         */
        val FRONT: CullFace

        /**
         * Back-facing triangles are culled.
         *
         * Value - [WebGL2RenderingContext.BACK]
         */
        val BACK: CullFace

        /**
         * Both front-facing and back-facing triangles are culled.
         *
         * Value - [WebGL2RenderingContext.FRONT_AND_BACK]
         */
        val FRONT_AND_BACK: CullFace
    }
}
