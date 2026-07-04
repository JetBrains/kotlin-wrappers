// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.gl.WebGL2RenderingContext

/**
 * WebGL component datatypes.  Components are intrinsics,
 * which form attributes, which form vertices.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ComponentDatatype">Online Documentation</a>
 */
sealed /* enum */
external interface ComponentDatatype {
    companion object {

        /**
         * 8-bit signed byte corresponding to `gl.BYTE` and the type
         * of an element in `Int8Array`.
         *
         * Value - [WebGL2RenderingContext.BYTE]
         */
        val BYTE: ComponentDatatype

        /**
         * 8-bit unsigned byte corresponding to `UNSIGNED_BYTE` and the type
         * of an element in `Uint8Array`.
         *
         * Value - [WebGL2RenderingContext.UNSIGNED_BYTE]
         */
        val UNSIGNED_BYTE: ComponentDatatype

        /**
         * 16-bit signed short corresponding to `SHORT` and the type
         * of an element in `Int16Array`.
         *
         * Value - [WebGL2RenderingContext.SHORT]
         */
        val SHORT: ComponentDatatype

        /**
         * 16-bit unsigned short corresponding to `UNSIGNED_SHORT` and the type
         * of an element in `Uint16Array`.
         *
         * Value - [WebGL2RenderingContext.UNSIGNED_SHORT]
         */
        val UNSIGNED_SHORT: ComponentDatatype

        /**
         * 32-bit signed int corresponding to `INT` and the type
         * of an element in `Int32Array`.
         *
         * Value - [WebGL2RenderingContext.INT]
         */
        val INT: ComponentDatatype

        /**
         * 32-bit unsigned int corresponding to `UNSIGNED_INT` and the type
         * of an element in `Uint32Array`.
         *
         * Value - [WebGL2RenderingContext.UNSIGNED_INT]
         */
        val UNSIGNED_INT: ComponentDatatype

        /**
         * 32-bit floating-point corresponding to `FLOAT` and the type
         * of an element in `Float32Array`.
         *
         * Value - [WebGL2RenderingContext.FLOAT]
         */
        val FLOAT: ComponentDatatype

        /**
         * 64-bit floating-point corresponding to `gl.DOUBLE` (in Desktop OpenGL;
         * this is not supported in WebGL, and is emulated in Cesium via [GeometryPipeline.encodeAttribute])
         * and the type of an element in `Float64Array`.
         *
         * Value - [WebGL2RenderingContext.DOUBLE]
         */
        val DOUBLE: ComponentDatatype
    }
}
