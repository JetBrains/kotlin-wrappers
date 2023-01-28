// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * The format of a pixel, i.e., the number of components it has and what they represent.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PixelFormat">Online Documentation</a>
 */

external enum class PixelFormat {

    /**
     * A pixel format containing a depth value.
     */
    DEPTH_COMPONENT,

    /**
     * A pixel format containing a depth and stencil value, most often used with [PixelDatatype.UNSIGNED_INT_24_8].
     */
    DEPTH_STENCIL,

    /**
     * A pixel format containing an alpha channel.
     */
    ALPHA,

    /**
     * A pixel format containing red, green, and blue channels.
     */
    RGB,

    /**
     * A pixel format containing red, green, blue, and alpha channels.
     */
    RGBA,

    /**
     * A pixel format containing a luminance (intensity) channel.
     */
    LUMINANCE,

    /**
     * A pixel format containing luminance (intensity) and alpha channels.
     */
    LUMINANCE_ALPHA,

    /**
     * A pixel format containing red, green, and blue channels that is DXT1 compressed.
     */
    RGB_DXT1,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is DXT1 compressed.
     */
    RGBA_DXT1,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is DXT3 compressed.
     */
    RGBA_DXT3,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is DXT5 compressed.
     */
    RGBA_DXT5,

    /**
     * A pixel format containing red, green, and blue channels that is PVR 4bpp compressed.
     */
    RGB_PVRTC_4BPPV1,

    /**
     * A pixel format containing red, green, and blue channels that is PVR 2bpp compressed.
     */
    RGB_PVRTC_2BPPV1,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is PVR 4bpp compressed.
     */
    RGBA_PVRTC_4BPPV1,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is PVR 2bpp compressed.
     */
    RGBA_PVRTC_2BPPV1,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is ASTC compressed.
     */
    RGBA_ASTC,

    /**
     * A pixel format containing red, green, and blue channels that is ETC1 compressed.
     */
    RGB_ETC1,

    /**
     * A pixel format containing red, green, and blue channels that is ETC2 compressed.
     */
    RGB8_ETC2,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is ETC2 compressed.
     */
    RGBA8_ETC2_EAC,

    /**
     * A pixel format containing red, green, blue, and alpha channels that is BC7 compressed.
     */
    RGBA_BC7,

    ;

}
