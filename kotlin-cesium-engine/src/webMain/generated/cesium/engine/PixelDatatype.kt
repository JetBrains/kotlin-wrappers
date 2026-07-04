// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.gl.WebGL2RenderingContext

/**
 * The data type of a pixel.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PixelDatatype">Online Documentation</a>
 */
sealed /* enum */
external interface PixelDatatype {
    companion object {

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_BYTE]
         */
        val UNSIGNED_BYTE: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_SHORT]
         */
        val UNSIGNED_SHORT: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_INT]
         */
        val UNSIGNED_INT: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.FLOAT]
         */
        val FLOAT: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.HALF_FLOAT_OES]
         */
        val HALF_FLOAT: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_INT_24_8]
         */
        val UNSIGNED_INT_24_8: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4]
         */
        val UNSIGNED_SHORT_4_4_4_4: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1]
         */
        val UNSIGNED_SHORT_5_5_5_1: PixelDatatype

        /**
         * Value - [WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5]
         */
        val UNSIGNED_SHORT_5_6_5: PixelDatatype
    }
}
