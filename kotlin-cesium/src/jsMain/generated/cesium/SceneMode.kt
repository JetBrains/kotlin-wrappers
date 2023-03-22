// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Indicates if the scene is viewed in 3D, 2D, or 2.5D Columbus view.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#SceneMode">Online Documentation</a>
 */

sealed external interface SceneMode {
    companion object {

        /**
         * Morphing between mode, e.g., 3D to 2D.
         */
        val MORPHING: SceneMode

        /**
         * Columbus View mode.  A 2.5D perspective view where the map is laid out
         * flat and objects with non-zero height are drawn above it.
         */
        val COLUMBUS_VIEW: SceneMode

        /**
         * 2D mode.  The map is viewed top-down with an orthographic projection.
         */
        val SCENE2D: SceneMode

        /**
         * 3D mode.  A traditional 3D perspective view of the globe.
         */
        val SCENE3D: SceneMode
    }
}
