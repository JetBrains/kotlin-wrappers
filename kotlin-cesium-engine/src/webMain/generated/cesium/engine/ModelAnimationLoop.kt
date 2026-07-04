// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines if and how a glTF animation is looped.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ModelAnimationLoop">Online Documentation</a>
 */
sealed /* enum */
external interface ModelAnimationLoop {
    companion object {

        /**
         * Play the animation once; do not loop it.
         *
         * Value - `0`
         */
        val NONE: ModelAnimationLoop

        /**
         * Loop the animation playing it from the start immediately after it stops.
         *
         * Value - `1`
         */
        val REPEAT: ModelAnimationLoop

        /**
         * Loop the animation.  First, playing it forward, then in reverse, then forward, and so on.
         *
         * Value - `2`
         */
        val MIRRORED_REPEAT: ModelAnimationLoop
    }
}
