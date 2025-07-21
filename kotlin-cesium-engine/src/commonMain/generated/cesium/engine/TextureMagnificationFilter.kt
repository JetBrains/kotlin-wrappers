// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Enumerates all possible filters used when magnifying WebGL textures.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TextureMagnificationFilter">Online Documentation</a>
 */
external class TextureMagnificationFilter
private constructor() {
    companion object {

        /**
         * Samples the texture by returning the closest pixel.
         */
        val NEAREST: TextureMagnificationFilter

        /**
         * Samples the texture through bi-linear interpolation of the four nearest pixels. This produces smoother results than `NEAREST` filtering.
         */
        val LINEAR: TextureMagnificationFilter
    }
}
