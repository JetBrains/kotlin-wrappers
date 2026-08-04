// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.html.HTMLElement

/**
 * A contextual camera controller that combines screenspace map panning and screenspace elevator panning. The controller automatically switches between the two based on the camera's angle relative to nadir. If the camera is looking mostly down (within angleThreshold of nadir), `ScreenSpaceMapCameraController` is used.
 * If the camera is looking towards the horizon (beyond angleThreshold from nadir), the `ScreenSpaceElevatorCameraController` is used.
 * ```
 * viewer.scene.screenSpaceCameraController.enableInputs = false;
 * viewer.scene.screenSpaceCameraController.enableCollisionDetection = false;
 *
 * const hybridController = new HybridScreenSpacePanCameraController();
 * viewer.addController(hybridController);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html">Online Documentation</a>
 */
open external class HybridScreenSpacePanCameraController :
    Controller {
    /**
     * The angle threshold in radians that determines which controller is used. If the camera is looking within this angle of nadir, the map controller is used. Otherwise, the elevator controller is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#angleThreshold">Online Documentation</a>
     */
    var angleThreshold: Double

    /**
     * The controller that is used when the camera is looking more horizontally (beyond angleThreshold from nadir).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#elevatorController">Online Documentation</a>
     */
    val elevatorController: ScreenSpaceElevatorCameraController

    /**
     * The controller that is used when the camera is looking mostly down (within angleThreshold of nadir).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#mapController">Online Documentation</a>
     */
    val mapController: ScreenSpaceMapCameraController

    /**
     * Determines if the controller is enabled and should be updated by the host scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#enabled">Online Documentation</a>
     */
    override var enabled: Boolean

    /**
     * Invoked when the controller is added to the DOM. Implement `connectedCallback` to set up any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#connectedCallback">Online Documentation</a>
     */
    override fun connectedCallback(element: HTMLElement)

    /**
     * Invoked when the controller is removed from the DOM. Implement `disconnectedCallback` to tear down any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#disconnectedCallback">Online Documentation</a>
     */
    override fun disconnectedCallback(element: HTMLElement)

    /**
     * Invoked once per frame. Implement `update` to modify the camera or other parts of the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#update">Online Documentation</a>
     */
    override fun update(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * Invoked when the controller is being updated the first time, immediately before `update` is called. Implement `firstUpdate` to perform one-time work after the relevant scene has begun its render loop. Some examples might include initializing simulation time values or adding a primitive to the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/HybridScreenSpacePanCameraController.html#firstUpdate">Online Documentation</a>
     */
    override fun firstUpdate(
        scene: Scene,
        time: JulianDate,
    )
}
