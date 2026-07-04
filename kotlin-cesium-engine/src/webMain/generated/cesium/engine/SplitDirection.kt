// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The direction to display a primitive or ImageryLayer relative to the [Scene.splitPosition].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#SplitDirection">Online Documentation</a>
 */
sealed /* enum */
external interface SplitDirection {
    companion object {

        /**
         * Display the primitive or ImageryLayer to the left of the [Scene.splitPosition].
         *
         * Value - `-1`
         */
        val LEFT: SplitDirection

        /**
         * Always display the primitive or ImageryLayer.
         *
         * Value - `0`
         */
        val NONE: SplitDirection

        /**
         * Display the primitive or ImageryLayer to the right of the [Scene.splitPosition].
         *
         * Value - `1`
         */
        val RIGHT: SplitDirection
    }
}
