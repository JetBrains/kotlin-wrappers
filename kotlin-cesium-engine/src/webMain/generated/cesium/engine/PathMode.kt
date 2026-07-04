// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Defines how material properties are applied along a path.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PathMode">Online Documentation</a>
 */
sealed /* enum */
external interface PathMode {
    companion object {

        /**
         * The material is applied to the entire path as a whole.
         *
         * Value - `0`
         */
        val WHOLE: PathMode

        /**
         * The material is applied in portions based on temporal position information,
         * using interval-based material properties.
         *
         * Value - `1`
         */
        val PORTIONS: PathMode
    }
}
