// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * WebGL component datatypes.  Components are intrinsics,
 * which form attributes, which form vertices.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ComponentDatatype">Online Documentation</a>
 */

sealed external interface ComponentDatatype {
    companion object {

        /**
         * 8-bit signed byte corresponding to `gl.BYTE` and the type
         * of an element in `Int8Array`.
         */
        val BYTE: ComponentDatatype

        /**
         * 8-bit unsigned byte corresponding to `UNSIGNED_BYTE` and the type
         * of an element in `Uint8Array`.
         */
        val UNSIGNED_BYTE: ComponentDatatype

        /**
         * 16-bit signed short corresponding to `SHORT` and the type
         * of an element in `Int16Array`.
         */
        val SHORT: ComponentDatatype

        /**
         * 16-bit unsigned short corresponding to `UNSIGNED_SHORT` and the type
         * of an element in `Uint16Array`.
         */
        val UNSIGNED_SHORT: ComponentDatatype

        /**
         * 32-bit signed int corresponding to `INT` and the type
         * of an element in `Int32Array`.
         */
        val INT: ComponentDatatype

        /**
         * 32-bit unsigned int corresponding to `UNSIGNED_INT` and the type
         * of an element in `Uint32Array`.
         */
        val UNSIGNED_INT: ComponentDatatype

        /**
         * 32-bit floating-point corresponding to `FLOAT` and the type
         * of an element in `Float32Array`.
         */
        val FLOAT: ComponentDatatype

        /**
         * 64-bit floating-point corresponding to `gl.DOUBLE` (in Desktop OpenGL;
         * this is not supported in WebGL, and is emulated in Cesium via [GeometryPipeline.encodeAttribute])
         * and the type of an element in `Float64Array`.
         */
        val DOUBLE: ComponentDatatype
    }
}
