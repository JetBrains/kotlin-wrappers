// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * An enum of metadata types. These metadata types are containers containing
 * one or more components of type [MetadataComponentType]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#MetadataType">Online Documentation</a>
 */

external enum class MetadataType {

    /**
     * A single component
     */
    SCALAR,

    /**
     * A vector with two components
     */
    VEC2,

    /**
     * A vector with three components
     */
    VEC3,

    /**
     * A vector with four components
     */
    VEC4,

    /**
     * A 2x2 matrix, stored in column-major format.
     */
    MAT2,

    /**
     * A 3x3 matrix, stored in column-major format.
     */
    MAT3,

    /**
     * A 4x4 matrix, stored in column-major format.
     */
    MAT4,

    /**
     * A boolean (true/false) value
     */
    BOOLEAN,

    /**
     * A UTF-8 encoded string value
     */
    STRING,

    /**
     * An enumerated value. This type is used in conjunction with a [MetadataEnum] to describe the valid values.
     */
    ENUM,

    ;

}
