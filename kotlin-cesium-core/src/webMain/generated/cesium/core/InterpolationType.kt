// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * An enum describing the type of interpolation used in a glTF animation.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#InterpolationType">Online Documentation</a>
 */
sealed external interface InterpolationType {
    companion object {

        /**
         * Value - `0`
         */
        val STEP: InterpolationType

        /**
         * Value - `1`
         */
        val LINEAR: InterpolationType

        /**
         * Value - `2`
         */
        val CUBICSPLINE: InterpolationType
    }
}
