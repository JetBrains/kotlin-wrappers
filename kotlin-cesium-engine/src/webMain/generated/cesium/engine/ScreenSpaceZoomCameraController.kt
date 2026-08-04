// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.html.HTMLElement

/**
 * Creates a new instance of `ScreenSpaceZoomCameraController`.
 * ```
 * viewer.scene.screenSpaceCameraController.enableInputs = false;
 * viewer.scene.screenSpaceCameraController.enableCollisionDetection = false;
 *
 * const zoomCameraController = new ScreenSpaceZoomCameraController();
 * viewer.addController(zoomCameraController);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] The options for configuring the controller.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html">Online Documentation</a>
 */
open external class ScreenSpaceZoomCameraController(
    options: ControllerOptions? = definedExternally,
) : Controller {
    /**
     * If false, the camera will zoom to the position at the center of the screen. If true, the camera will zoom to the position under the cursor or tap when dragging starts or when scrolling with the scroll wheel.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#usePointerPosition">Online Documentation</a>
     */
    var usePointerPosition: Boolean

    /**
     * The drag input bindings that control zooming. Each binding is a combination of the mouse button
     * and an optional keyboard modifier.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#dragInputs">Online Documentation</a>
     */
    var dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>

    /**
     * The scroll input bindings that control zooming.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#scrollInputs">Online Documentation</a>
     */
    var scrollInputs: ReadonlyArray<ScreenSpaceEventType>

    /**
     * The rate at which the camera zooms in and out based on the mouse wheel delta.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#zoomSensitivity">Online Documentation</a>
     */
    var zoomSensitivity: Double

    /**
     * A callback function used to pick the world position from which to zoom. The function is called with [Scene], the [Cartesian2] screen space position, and a [Cartesian3] instance to store the result. The function should return the [Cartesian3] world position from which to zoom, or `undefined` if no position could be picked.
     * ```
     * const zoomCameraController = new ScreenSpaceZoomCameraController();
     * zoomCameraController.pickWorldPosition = function (scene, windowPosition, result) {
     *   // Pick the world position from the depth buffer
     *   return scene.pickPosition(windowPosition, result);
     * };
     * viewer.addController(zoomCameraController);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#pickWorldPosition">Online Documentation</a>
     */
    var pickWorldPosition: Function<*>

    /**
     * The ratio of the camera's distance to the zoom target that defines how much the camera zooms in and out per second.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#zoomDistanceRatio">Online Documentation</a>
     */
    var zoomDistanceRatio: Double

    /**
     * Enable or disable inertia when zooming. When enabled, the camera will continue to move after the user input stops, gradually slowing down based on [ScreenSpaceZoomCameraController.inertialDecay].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#inertiaEnabled">Online Documentation</a>
     */
    var inertiaEnabled: Boolean

    /**
     * The rate at which the camera's zoom velocity decays over time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#inertialDecay">Online Documentation</a>
     */
    var inertialDecay: Double

    /**
     * Maximum distance from the zoom target that the camera can move away.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#maximumZoomDistance">Online Documentation</a>
     */
    var maximumZoomDistance: Double

    /**
     * The maximum zoom velocity in meters per second. This limits the speed at which the camera can zoom in and out.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#maximumZoomVelocity">Online Documentation</a>
     */
    var maximumZoomVelocity: Double

    /**
     * Enables or disables damping for zooming. Damping smooths out the camera movement and makes it feel more natural or weighty, but it can also introduce a slight delay in the camera response. If damping is disabled, the camera will respond immediately to user input.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#dampingEnabled">Online Documentation</a>
     */
    var dampingEnabled: Boolean

    /**
     * Specifies the length of time in seconds in which a single zoom animation is targeted to complete.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#zoomAnimationDuration">Online Documentation</a>
     */
    var zoomAnimationDuration: Double

    /**
     * Determines if the controller is enabled and should be updated by the host scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#enabled">Online Documentation</a>
     */
    override var enabled: Boolean

    /**
     * Invoked when the controller is added to the DOM. Implement `connectedCallback` to set up any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#connectedCallback">Online Documentation</a>
     */
    override fun connectedCallback(element: HTMLElement)

    /**
     * Invoked when the controller is removed from the DOM. Implement `disconnectedCallback` to tear down any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#disconnectedCallback">Online Documentation</a>
     */
    override fun disconnectedCallback(element: HTMLElement)

    /**
     * Invoked once per frame. Implement `update` to modify the camera or other parts of the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#update">Online Documentation</a>
     */
    override fun update(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * Invoked when the controller is being updated the first time, immediately before `update` is called. Implement `firstUpdate` to perform one-time work after the relevant scene has begun its render loop. Some examples might include initializing simulation time values or adding a primitive to the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#firstUpdate">Online Documentation</a>
     */
    override fun firstUpdate(
        scene: Scene,
        time: JulianDate,
    )

    companion object {
        /**
         * @property [dragInputs] The drag input bindings that control zooming.
         * @property [scrollInputs] The scroll input bindings that control zooming.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceZoomCameraController.html#.ControllerOptions">Online Documentation</a>
         */
        @JsPlainObject
        interface ControllerOptions {
            val dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>?
            val scrollInputs: ReadonlyArray<ScreenSpaceEventType>?
        }
    }
}
