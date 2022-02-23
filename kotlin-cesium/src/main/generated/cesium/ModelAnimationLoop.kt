// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Determines if and how a glTF animation is looped.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ModelAnimationLoop">Online Documentation</a>
 */

external enum class ModelAnimationLoop {

    /**
     * Play the animation once; do not loop it.
     */
    NONE,

    /**
     * Loop the animation playing it from the start immediately after it stops.
     */
    REPEAT,

    /**
     * Loop the animation.  First, playing it forward, then in reverse, then forward, and so on.
     */
    MIRRORED_REPEAT,

    ;

}
