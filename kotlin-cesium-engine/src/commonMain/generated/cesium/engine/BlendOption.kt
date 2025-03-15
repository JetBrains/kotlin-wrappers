// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines how opaque and translucent parts of billboards, points, and labels are blended with the scene.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendOption">Online Documentation</a>
 */
sealed external interface BlendOption {
    companion object {

        /**
         * The billboards, points, or labels in the collection are completely opaque.
         */
        val OPAQUE: BlendOption

        /**
         * The billboards, points, or labels in the collection are completely translucent.
         */
        val TRANSLUCENT: BlendOption

        /**
         * The billboards, points, or labels in the collection are both opaque and translucent.
         */
        val OPAQUE_AND_TRANSLUCENT: BlendOption
    }
}
