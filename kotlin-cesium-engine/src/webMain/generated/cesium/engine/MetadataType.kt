// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * An enum of metadata types. These metadata types are containers containing
 * one or more components of type [MetadataComponentType]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#MetadataType">Online Documentation</a>
 */
sealed /* enum */
external interface MetadataType {
    companion object {

        /**
         * A single component
         *
         * Value - `"SCALAR"`
         */
        val SCALAR: MetadataType

        /**
         * A vector with two components
         *
         * Value - `"VEC2"`
         */
        val VEC2: MetadataType

        /**
         * A vector with three components
         *
         * Value - `"VEC3"`
         */
        val VEC3: MetadataType

        /**
         * A vector with four components
         *
         * Value - `"VEC4"`
         */
        val VEC4: MetadataType

        /**
         * A 2x2 matrix, stored in column-major format.
         *
         * Value - `"MAT2"`
         */
        val MAT2: MetadataType

        /**
         * A 3x3 matrix, stored in column-major format.
         *
         * Value - `"MAT3"`
         */
        val MAT3: MetadataType

        /**
         * A 4x4 matrix, stored in column-major format.
         *
         * Value - `"MAT4"`
         */
        val MAT4: MetadataType

        /**
         * A boolean (true/false) value
         *
         * Value - `"BOOLEAN"`
         */
        val BOOLEAN: MetadataType

        /**
         * A UTF-8 encoded string value
         *
         * Value - `"STRING"`
         */
        val STRING: MetadataType

        /**
         * An enumerated value. This type is used in conjunction with a [MetadataEnum] to describe the valid values.
         *
         * Value - `"ENUM"`
         */
        val ENUM: MetadataType
    }
}
