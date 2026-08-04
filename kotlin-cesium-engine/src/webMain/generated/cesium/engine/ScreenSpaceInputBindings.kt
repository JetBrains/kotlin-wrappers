// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject


external object ScreenSpaceInputBindings {
    /**
     * @property [button] The mouse button used for drag start/stop.
     * @property [modifier] The optional keyboard modifier to register.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceInputBindings.html#.InputBinding">Online Documentation</a>
     */
    @JsPlainObject
    interface InputBinding {
        val button: MouseButton
        val modifier: Double?
    }

    /**
     * @property [start] Called on drag start.
     * @property [end] Called on drag stop.
     * @property [change] Called on drag move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceInputBindings.html#.DragInputActions">Online Documentation</a>
     */
    @JsPlainObject
    interface DragInputActions {
        val start: Function<*>?
        val end: Function<*>?
        val change: Function<*>?
    }

    /**
     * @property [isDragging] True if a drag is in progress, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceInputBindings.html#.DragInputState">Online Documentation</a>
     */
    @JsPlainObject
    interface DragInputState {
        val isDragging: Boolean
    }

    /**
     * Registers drag input bindings on a screen space event handler.
     * @param [handler] The screen space event handler.
     * @param [inputBindings] The drag bindings to register.
     * @param [dragInputActions] The callbacks to invoke for drag actions.
     * @return The drag input state.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceInputBindings.html#.registerDragInputBindings">Online Documentation</a>
     */
    fun registerDragInputBindings(
        handler: ScreenSpaceEventHandler,
        inputBindings: ReadonlyArray<InputBinding>,
        dragInputActions: DragInputActions,
    ): DragInputState
}
