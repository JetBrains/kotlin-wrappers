// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines if and how a glTF animation is looped.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ModelAnimationLoop">Online Documentation</a>
 */

sealed external interface ModelAnimationLoop {
    companion object {

        /**
         * Play the animation once; do not loop it.
         */
        val NONE: ModelAnimationLoop

        /**
         * Loop the animation playing it from the start immediately after it stops.
         */
        val REPEAT: ModelAnimationLoop

        /**
         * Loop the animation.  First, playing it forward, then in reverse, then forward, and so on.
         */
        val MIRRORED_REPEAT: ModelAnimationLoop
    }
}
