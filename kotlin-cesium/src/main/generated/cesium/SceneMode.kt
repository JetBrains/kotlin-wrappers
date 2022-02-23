// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Indicates if the scene is viewed in 3D, 2D, or 2.5D Columbus view.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#SceneMode">Online Documentation</a>
 */

external enum class SceneMode {

    /**
     * Morphing between mode, e.g., 3D to 2D.
     */
    MORPHING,

    /**
     * Columbus View mode.  A 2.5D perspective view where the map is laid out
     * flat and objects with non-zero height are drawn above it.
     */
    COLUMBUS_VIEW,

    /**
     * 2D mode.  The map is viewed top-down with an orthographic projection.
     */
    SCENE2D,

    /**
     * 3D mode.  A traditional 3D perspective view of the globe.
     */
    SCENE3D,

    ;

}
