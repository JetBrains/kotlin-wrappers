// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum of metadata types. These metadata types are containers containing
 * one or more components of type [MetadataComponentType]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#MetadataType">Online Documentation</a>
 */
sealed external interface MetadataType {
    companion object {

        /**
         * A single component
         */
        val SCALAR: MetadataType

        /**
         * A vector with two components
         */
        val VEC2: MetadataType

        /**
         * A vector with three components
         */
        val VEC3: MetadataType

        /**
         * A vector with four components
         */
        val VEC4: MetadataType

        /**
         * A 2x2 matrix, stored in column-major format.
         */
        val MAT2: MetadataType

        /**
         * A 3x3 matrix, stored in column-major format.
         */
        val MAT3: MetadataType

        /**
         * A 4x4 matrix, stored in column-major format.
         */
        val MAT4: MetadataType

        /**
         * A boolean (true/false) value
         */
        val BOOLEAN: MetadataType

        /**
         * A UTF-8 encoded string value
         */
        val STRING: MetadataType

        /**
         * An enumerated value. This type is used in conjunction with a [MetadataEnum] to describe the valid values.
         */
        val ENUM: MetadataType
    }
}
