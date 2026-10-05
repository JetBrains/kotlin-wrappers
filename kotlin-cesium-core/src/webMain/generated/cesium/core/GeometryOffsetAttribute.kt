// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * Represents which vertices should have a value of `true` for the `applyOffset` attribute
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#GeometryOffsetAttribute">Online Documentation</a>
 */
sealed external interface GeometryOffsetAttribute {
    companion object {

        /**
         * Value - `0`
         */
        val NONE: GeometryOffsetAttribute

        /**
         * Value - `1`
         */
        val TOP: GeometryOffsetAttribute

        /**
         * Value - `2`
         */
        val ALL: GeometryOffsetAttribute
    }
}
