// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Enumerates the available input for interacting with the camera.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CameraEventType">Online Documentation</a>
 */
sealed external interface CameraEventType {
    companion object {

        /**
         * A left mouse button press followed by moving the mouse and releasing the button.
         */
        val LEFT_DRAG: CameraEventType

        /**
         * A right mouse button press followed by moving the mouse and releasing the button.
         */
        val RIGHT_DRAG: CameraEventType

        /**
         * A middle mouse button press followed by moving the mouse and releasing the button.
         */
        val MIDDLE_DRAG: CameraEventType

        /**
         * Scrolling the middle mouse button.
         */
        val WHEEL: CameraEventType

        /**
         * A two-finger touch on a touch surface.
         */
        val PINCH: CameraEventType
    }
}
