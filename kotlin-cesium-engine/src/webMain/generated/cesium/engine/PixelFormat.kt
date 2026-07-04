// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.gl.WebGL2RenderingContext

/**
 * The format of a pixel, i.e., the number of components it has and what they represent.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PixelFormat">Online Documentation</a>
 */
sealed /* enum */
external interface PixelFormat {
    companion object {

        /**
         * A pixel format containing a depth value.
         *
         * Value - [WebGL2RenderingContext.DEPTH_COMPONENT]
         */
        val DEPTH_COMPONENT: PixelFormat

        /**
         * A pixel format containing a depth and stencil value, most often used with [PixelDatatype.UNSIGNED_INT_24_8].
         *
         * Value - [WebGL2RenderingContext.DEPTH_STENCIL]
         */
        val DEPTH_STENCIL: PixelFormat

        /**
         * A pixel format containing an alpha channel.
         *
         * Value - [WebGL2RenderingContext.ALPHA]
         */
        val ALPHA: PixelFormat

        /**
         * A pixel format containing a red channel
         *
         * Value - [WebGL2RenderingContext.RED]
         */
        val RED: PixelFormat

        /**
         * A pixel format containing red and green channels.
         *
         * Value - [WebGL2RenderingContext.RG]
         */
        val RG: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels.
         *
         * Value - [WebGL2RenderingContext.RGB]
         */
        val RGB: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels.
         *
         * Value - [WebGL2RenderingContext.RGBA]
         */
        val RGBA: PixelFormat

        /**
         * A pixel format containing a red channel as an integer.
         *
         * Value - [WebGL2RenderingContext.RED_INTEGER]
         */
        val RED_INTEGER: PixelFormat

        /**
         * A pixel format containing red and green channels as integers.
         *
         * Value - [WebGL2RenderingContext.RG_INTEGER]
         */
        val RG_INTEGER: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels as integers.
         *
         * Value - [WebGL2RenderingContext.RGB_INTEGER]
         */
        val RGB_INTEGER: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels as integers.
         *
         * Value - [WebGL2RenderingContext.RGBA_INTEGER]
         */
        val RGBA_INTEGER: PixelFormat

        /**
         * A pixel format containing a luminance (intensity) channel.
         *
         * Value - [WebGL2RenderingContext.LUMINANCE]
         */
        val LUMINANCE: PixelFormat

        /**
         * A pixel format containing luminance (intensity) and alpha channels.
         *
         * Value - [WebGL2RenderingContext.LUMINANCE_ALPHA]
         */
        val LUMINANCE_ALPHA: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is DXT1 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGB_S3TC_DXT1_EXT]
         */
        val RGB_DXT1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT1 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_S3TC_DXT1_EXT]
         */
        val RGBA_DXT1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT3 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_S3TC_DXT3_EXT]
         */
        val RGBA_DXT3: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT5 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_S3TC_DXT5_EXT]
         */
        val RGBA_DXT5: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is PVR 4bpp compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]
         */
        val RGB_PVRTC_4BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is PVR 2bpp compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]
         */
        val RGB_PVRTC_2BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is PVR 4bpp compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]
         */
        val RGBA_PVRTC_4BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is PVR 2bpp compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]
         */
        val RGBA_PVRTC_2BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is ASTC compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_ASTC_4x4_WEBGL]
         */
        val RGBA_ASTC: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is ETC1 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGB_ETC1_WEBGL]
         */
        val RGB_ETC1: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is ETC2 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGB8_ETC2]
         */
        val RGB8_ETC2: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is ETC2 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA8_ETC2_EAC]
         */
        val RGBA8_ETC2_EAC: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is BC7 compressed.
         *
         * Value - [WebGL2RenderingContext.COMPRESSED_RGBA_BPTC_UNORM]
         */
        val RGBA_BC7: PixelFormat
    }
}
