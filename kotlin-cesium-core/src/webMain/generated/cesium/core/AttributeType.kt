// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * An enum describing the attribute type for glTF and 3D Tiles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#AttributeType">Online Documentation</a>
 */
sealed /* enum */
external interface AttributeType {
    companion object {

        /**
         * The attribute is a single component.
         *
         * Value - `"SCALAR"`
         */
        val SCALAR: AttributeType

        /**
         * The attribute is a two-component vector.
         *
         * Value - `"VEC2"`
         */
        val VEC2: AttributeType

        /**
         * The attribute is a three-component vector.
         *
         * Value - `"VEC3"`
         */
        val VEC3: AttributeType

        /**
         * The attribute is a four-component vector.
         *
         * Value - `"VEC4"`
         */
        val VEC4: AttributeType

        /**
         * The attribute is a 2x2 matrix.
         *
         * Value - `"MAT2"`
         */
        val MAT2: AttributeType

        /**
         * The attribute is a 3x3 matrix.
         *
         * Value - `"MAT3"`
         */
        val MAT3: AttributeType

        /**
         * The attribute is a 4x4 matrix.
         *
         * Value - `"MAT4"`
         */
        val MAT4: AttributeType
    }
}
