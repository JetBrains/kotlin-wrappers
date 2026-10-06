// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines how opaque and translucent parts of primitives in a collection are blended
 * with the scene. Collections differ in the render pass, blending, and depth behavior
 * they select for each option; see the `blendOption` documentation of the
 * collection in question.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendOption">Online Documentation</a>
 */
sealed /* enum */
external interface BlendOption {
    companion object {

        /**
         * The primitives in the collection are completely opaque.
         *
         * Value - `0`
         */
        val OPAQUE: BlendOption

        /**
         * The primitives in the collection are completely translucent.
         *
         * Value - `1`
         */
        val TRANSLUCENT: BlendOption

        /**
         * The primitives in the collection are both opaque and translucent, and each primitive
         * is drawn according to its own opacity.
         *
         * Value - `2`
         */
        val OPAQUE_AND_TRANSLUCENT: BlendOption
    }
}
