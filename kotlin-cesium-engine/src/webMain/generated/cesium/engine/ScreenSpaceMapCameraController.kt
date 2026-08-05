// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.html.HTMLElement

/**
 * Creates an instance of a ScreenSpaceMapCameraController.
 * ```
 * viewer.scene.screenSpaceCameraController.enableInputs = false;
 *
 * const mapCameraController = new ScreenSpaceMapCameraController();
 * viewer.addController(mapCameraController);
 * ```
 * ```
 * // Configure the controller to use the right mouse button for panning instead of the default left mouse button.
 * const mapCameraController = new ScreenSpaceMapCameraController({
 *  dragInputs: [{ button: MouseButton.RIGHT}]
 * });
 * viewer.addController(mapCameraController);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] The options for configuring the controller.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html">Online Documentation</a>
 */
open external class ScreenSpaceMapCameraController(
    options: ControllerOptions? = definedExternally,
) : Controller {
    /**
     * The drag input bindings that map panning. Each binding is a combination of the mouse button
     * and an optional keyboard modifier.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#dragInputs">Online Documentation</a>
     */
    var dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>

    /**
     * A callback function used to pick the world position from which to pan. The function is called with [Scene], the [Cartesian2] screen space position, and a [Cartesian3] instance to store the result. The function should return the [Cartesian3] world position from which to pan, or `undefined` if no position could be picked. If `undefined` is returned, the camera will pan relative to the ellipsoid surface below the camera.
     * ```
     * const mapCameraController = new ScreenSpaceMapCameraController();
     * mapCameraController.pickWorldPosition = function (scene, windowPosition, result) {
     *   // Pick the world position from the depth buffer
     *   return scene.pickPosition(windowPosition, result);
     * };
     * viewer.addController(mapCameraController);
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#pickWorldPosition">Online Documentation</a>
     */
    var pickWorldPosition: Function<*>

    /**
     * The speed in meters per pixel at which the camera pans.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#panSpeed">Online Documentation</a>
     */
    var panSpeed: Double

    /**
     * Enable or disable inertia when panning. When enabled, the camera will continue to move after the user stops dragging, gradually slowing down based on [ScreenSpaceMapCameraController.inertialDecay].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#inertiaEnabled">Online Documentation</a>
     */
    var inertiaEnabled: Boolean

    /**
     * The rate at which the camera's pan velocity decays over time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#inertialDecay">Online Documentation</a>
     */
    var inertialDecay: Double

    /**
     * A parameter in the range `[0, 1)` used to limit the range
     * of inputs to a percentage of the window width/height per animation frame.
     * This helps keep the camera under control in low-frame-rate situations.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#maximumMovementRatio">Online Documentation</a>
     */
    var maximumMovementRatio: Double

    /**
     * Determines if the controller is enabled and should be updated by the host scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#enabled">Online Documentation</a>
     */
    override var enabled: Boolean

    /**
     * Invoked when the controller is added to the DOM. Implement `connectedCallback` to set up any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#connectedCallback">Online Documentation</a>
     */
    override fun connectedCallback(element: HTMLElement)

    /**
     * Invoked when the controller is removed from the DOM. Implement `disconnectedCallback` to tear down any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#disconnectedCallback">Online Documentation</a>
     */
    override fun disconnectedCallback(element: HTMLElement)

    /**
     * Invoked once per frame. Implement `update` to modify the camera or other parts of the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#update">Online Documentation</a>
     */
    override fun update(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * Invoked when the controller is being updated the first time, immediately before `update` is called. Implement `firstUpdate` to perform one-time work after the relevant scene has begun its render loop. Some examples might include initializing simulation time values or adding a primitive to the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#firstUpdate">Online Documentation</a>
     */
    override fun firstUpdate(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * @property [dragInputs] The drag input bindings that control panning.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ScreenSpaceMapCameraController.html#.ControllerOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ControllerOptions {
        val dragInputs: ReadonlyArray<ScreenSpaceInputBindings.InputBinding>?
    }
}
