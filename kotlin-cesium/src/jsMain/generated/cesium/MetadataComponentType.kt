// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum of metadata component types.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#MetadataComponentType">Online Documentation</a>
 */
sealed external interface MetadataComponentType {
    companion object {

        /**
         * An 8-bit signed integer
         */
        val INT8: MetadataComponentType

        /**
         * An 8-bit unsigned integer
         */
        val UINT8: MetadataComponentType

        /**
         * A 16-bit signed integer
         */
        val INT16: MetadataComponentType

        /**
         * A 16-bit unsigned integer
         */
        val UINT16: MetadataComponentType

        /**
         * A 32-bit signed integer
         */
        val INT32: MetadataComponentType

        /**
         * A 32-bit unsigned integer
         */
        val UINT32: MetadataComponentType

        /**
         * A 64-bit signed integer. This type requires BigInt support.
         */
        val INT64: MetadataComponentType

        /**
         * A 64-bit signed integer. This type requires BigInt support
         */
        val UINT64: MetadataComponentType

        /**
         * A 32-bit (single precision) floating point number
         */
        val FLOAT32: MetadataComponentType

        /**
         * A 64-bit (double precision) floating point number
         */
        val FLOAT64: MetadataComponentType
    }
}
