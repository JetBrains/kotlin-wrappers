// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlin.js.JsModule

/**
 * The direction to display a primitive or ImageryLayer relative to the [Scene.splitPosition].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#SplitDirection">Online Documentation</a>
 */
external class SplitDirection
private constructor() {
    companion object {

        /**
         * Display the primitive or ImageryLayer to the left of the [Scene.splitPosition].
         */
        val LEFT: SplitDirection

        /**
         * Always display the primitive or ImageryLayer.
         */
        val NONE: SplitDirection

        /**
         * Display the primitive or ImageryLayer to the right of the [Scene.splitPosition].
         */
        val RIGHT: SplitDirection
    }
}
