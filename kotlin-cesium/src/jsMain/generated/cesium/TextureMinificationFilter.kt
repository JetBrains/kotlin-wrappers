// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Enumerates all possible filters used when minifying WebGL textures.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TextureMinificationFilter">Online Documentation</a>
 */
sealed external interface TextureMinificationFilter {
    companion object {

        /**
         * Samples the texture by returning the closest pixel.
         */
        val NEAREST: TextureMinificationFilter

        /**
         * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than `NEAREST` filtering.
         */
        val LINEAR: TextureMinificationFilter

        /**
         * Selects the nearest mip level and applies nearest sampling within that level.
         *
         * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
         */
        val NEAREST_MIPMAP_NEAREST: TextureMinificationFilter

        /**
         * Selects the nearest mip level and applies linear sampling within that level.
         *
         * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
         */
        val LINEAR_MIPMAP_NEAREST: TextureMinificationFilter

        /**
         * Read texture values with nearest sampling from two adjacent mip levels and linearly interpolate the results.
         *
         * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
         *
         * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
         */
        val NEAREST_MIPMAP_LINEAR: TextureMinificationFilter

        /**
         * Read texture values with linear sampling from two adjacent mip levels and linearly interpolate the results.
         *
         * This option provides a good balance of visual quality and speed when sampling from a mipmapped texture.
         *
         * Requires that the texture has a mipmap. The mip level is chosen by the view angle and screen-space size of the texture.
         */
        val LINEAR_MIPMAP_LINEAR: TextureMinificationFilter
    }
}
