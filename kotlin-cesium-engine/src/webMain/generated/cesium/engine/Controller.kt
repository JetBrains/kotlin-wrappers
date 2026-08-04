// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.html.HTMLElement

/**
 * An interface for a camera controller that can be registered with the scene to handle input events, camera animations, and other interactions. Implementations of this interface are expected to be registered with the scene via a [ControllerHost].
 * This type describes an
 * interface and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html">Online Documentation</a>
 */
abstract external class Controller {
    /**
     * Determines if the controller is enabled and should be updated by the host scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html#enabled">Online Documentation</a>
     */
    abstract var enabled: Boolean

    /**
     * Invoked when the controller is added to the DOM. Implement `connectedCallback` to set up any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html#connectedCallback">Online Documentation</a>
     */
    abstract fun connectedCallback(element: HTMLElement)

    /**
     * Invoked when the controller is removed from the DOM. Implement `disconnectedCallback` to tear down any DOM event listeners.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html#disconnectedCallback">Online Documentation</a>
     */
    abstract fun disconnectedCallback(element: HTMLElement)

    /**
     * Invoked once per frame. Implement `update` to modify the camera or other parts of the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html#update">Online Documentation</a>
     */
    abstract fun update(
        scene: Scene,
        time: JulianDate,
    )

    /**
     * Invoked when the controller is being updated the first time, immediately before `update` is called. Implement `firstUpdate` to perform one-time work after the relevant scene has begun its render loop. Some examples might include initializing simulation time values or adding a primitive to the scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Controller.html#firstUpdate">Online Documentation</a>
     */
    abstract fun firstUpdate(
        scene: Scene,
        time: JulianDate,
    )
}
