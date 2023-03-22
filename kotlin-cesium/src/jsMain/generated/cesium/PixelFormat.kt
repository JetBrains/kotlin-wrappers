// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The format of a pixel, i.e., the number of components it has and what they represent.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PixelFormat">Online Documentation</a>
 */

sealed external interface PixelFormat {
    companion object {

        /**
         * A pixel format containing a depth value.
         */
        val DEPTH_COMPONENT: PixelFormat

        /**
         * A pixel format containing a depth and stencil value, most often used with [PixelDatatype.UNSIGNED_INT_24_8].
         */
        val DEPTH_STENCIL: PixelFormat

        /**
         * A pixel format containing an alpha channel.
         */
        val ALPHA: PixelFormat

        /**
         * A pixel format containing a red channel
         */
        val RED: PixelFormat

        /**
         * A pixel format containing red and green channels.
         */
        val RG: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels.
         */
        val RGB: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels.
         */
        val RGBA: PixelFormat

        /**
         * A pixel format containing a luminance (intensity) channel.
         */
        val LUMINANCE: PixelFormat

        /**
         * A pixel format containing luminance (intensity) and alpha channels.
         */
        val LUMINANCE_ALPHA: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is DXT1 compressed.
         */
        val RGB_DXT1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT1 compressed.
         */
        val RGBA_DXT1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT3 compressed.
         */
        val RGBA_DXT3: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is DXT5 compressed.
         */
        val RGBA_DXT5: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is PVR 4bpp compressed.
         */
        val RGB_PVRTC_4BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is PVR 2bpp compressed.
         */
        val RGB_PVRTC_2BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is PVR 4bpp compressed.
         */
        val RGBA_PVRTC_4BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is PVR 2bpp compressed.
         */
        val RGBA_PVRTC_2BPPV1: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is ASTC compressed.
         */
        val RGBA_ASTC: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is ETC1 compressed.
         */
        val RGB_ETC1: PixelFormat

        /**
         * A pixel format containing red, green, and blue channels that is ETC2 compressed.
         */
        val RGB8_ETC2: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is ETC2 compressed.
         */
        val RGBA8_ETC2_EAC: PixelFormat

        /**
         * A pixel format containing red, green, blue, and alpha channels that is BC7 compressed.
         */
        val RGBA_BC7: PixelFormat
    }
}
