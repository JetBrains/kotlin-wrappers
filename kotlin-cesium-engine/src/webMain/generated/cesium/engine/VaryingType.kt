// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * An enum for the GLSL varying types. These can be used for declaring varyings
 * in [CustomShader]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VaryingType">Online Documentation</a>
 */
sealed /* enum */
external interface VaryingType {
    companion object {

        /**
         * A single floating point value.
         *
         * Value - `"float"`
         */
        val FLOAT: VaryingType

        /**
         * A vector of 2 floating point values.
         *
         * Value - `"vec2"`
         */
        val VEC2: VaryingType

        /**
         * A vector of 3 floating point values.
         *
         * Value - `"vec3"`
         */
        val VEC3: VaryingType

        /**
         * A vector of 4 floating point values.
         *
         * Value - `"vec4"`
         */
        val VEC4: VaryingType

        /**
         * A 2x2 matrix of floating point values.
         *
         * Value - `"mat2"`
         */
        val MAT2: VaryingType

        /**
         * A 3x3 matrix of floating point values.
         *
         * Value - `"mat3"`
         */
        val MAT3: VaryingType

        /**
         * A 4x4 matrix of floating point values.
         *
         * Value - `"mat4"`
         */
        val MAT4: VaryingType
    }
}
