// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Enumerates all possible filters used when magnifying WebGL textures.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TextureMagnificationFilter">Online Documentation</a>
 */

sealed external interface TextureMagnificationFilter {
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
