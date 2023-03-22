// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum for the GLSL varying types. These can be used for declaring varyings
 * in [CustomShader]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VaryingType">Online Documentation</a>
 */
sealed external interface VaryingType {
    companion object {

        /**
         * A single floating point value.
         */
        val FLOAT: VaryingType

        /**
         * A vector of 2 floating point values.
         */
        val VEC2: VaryingType

        /**
         * A vector of 3 floating point values.
         */
        val VEC3: VaryingType

        /**
         * A vector of 4 floating point values.
         */
        val VEC4: VaryingType

        /**
         * A 2x2 matrix of floating point values.
         */
        val MAT2: VaryingType

        /**
         * A 3x3 matrix of floating point values.
         */
        val MAT3: VaryingType

        /**
         * A 3x3 matrix of floating point values.
         */
        val MAT4: VaryingType
    }
}
