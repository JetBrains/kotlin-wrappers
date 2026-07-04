// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * An enum of the basic GLSL uniform types. These can be used with
 * [CustomShader] to declare user-defined uniforms.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#UniformType">Online Documentation</a>
 */
sealed /* enum */
external interface UniformType {
    companion object {

        /**
         * A single floating point value.
         *
         * Value - `"float"`
         */
        val FLOAT: UniformType

        /**
         * A vector of 2 floating point values.
         *
         * Value - `"vec2"`
         */
        val VEC2: UniformType

        /**
         * A vector of 3 floating point values.
         *
         * Value - `"vec3"`
         */
        val VEC3: UniformType

        /**
         * A vector of 4 floating point values.
         *
         * Value - `"vec4"`
         */
        val VEC4: UniformType

        /**
         * A single integer value
         *
         * Value - `"int"`
         */
        val INT: UniformType

        /**
         * A vector of 2 integer values.
         *
         * Value - `"ivec2"`
         */
        val INT_VEC2: UniformType

        /**
         * A vector of 3 integer values.
         *
         * Value - `"ivec3"`
         */
        val INT_VEC3: UniformType

        /**
         * A vector of 4 integer values.
         *
         * Value - `"ivec4"`
         */
        val INT_VEC4: UniformType

        /**
         * A single boolean value.
         *
         * Value - `"bool"`
         */
        val BOOL: UniformType

        /**
         * A vector of 2 boolean values.
         *
         * Value - `"bvec2"`
         */
        val BOOL_VEC2: UniformType

        /**
         * A vector of 3 boolean values.
         *
         * Value - `"bvec3"`
         */
        val BOOL_VEC3: UniformType

        /**
         * A vector of 4 boolean values.
         *
         * Value - `"bvec4"`
         */
        val BOOL_VEC4: UniformType

        /**
         * A 2x2 matrix of floating point values.
         *
         * Value - `"mat2"`
         */
        val MAT2: UniformType

        /**
         * A 3x3 matrix of floating point values.
         *
         * Value - `"mat3"`
         */
        val MAT3: UniformType

        /**
         * A 4x4 matrix of floating point values.
         *
         * Value - `"mat4"`
         */
        val MAT4: UniformType

        /**
         * A 2D sampled texture.
         *
         * Value - `"sampler2D"`
         */
        val SAMPLER_2D: UniformType

        /**
         * Value - `"samplerCube"`
         */
        val SAMPLER_CUBE: UniformType
    }
}
