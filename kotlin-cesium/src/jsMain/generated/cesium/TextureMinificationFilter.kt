// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Enumerates all possible filters used when minifying WebGL textures.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TextureMinificationFilter">Online Documentation</a>
 */

external enum class TextureMinificationFilter {

    /**
     * Samples the texture by returning the closest pixel.
     */
    NEAREST,

    /**
     * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than `NEAREST` filtering.
     */
    LINEAR,

    /**
     * Selects the nearest mip level and applies nearest sampling within that level.
     *
     * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
     */
    NEAREST_MIPMAP_NEAREST,

    /**
     * Selects the nearest mip level and applies linear sampling within that level.
     *
     * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
     */
    LINEAR_MIPMAP_NEAREST,

    /**
     * Read texture values with nearest sampling from two adjacent mip levels and linearly interpolate the results.
     *
     * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
     *
     * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
     */
    NEAREST_MIPMAP_LINEAR,

    /**
     * Read texture values with linear sampling from two adjacent mip levels and linearly interpolate the results.
     *
     * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
     *
     * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
     */
    LINEAR_MIPMAP_LINEAR,

    ;

}
