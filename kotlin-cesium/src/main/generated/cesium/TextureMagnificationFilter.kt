// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Enumerates all possible filters used when magnifying WebGL textures.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TextureMagnificationFilter">Online Documentation</a>
 */

external enum class TextureMagnificationFilter {

    /**
     * Samples the texture by returning the closest pixel.
     */
    NEAREST,

    /**
     * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than `NEAREST` filtering.
     */
    LINEAR,

    ;

}
