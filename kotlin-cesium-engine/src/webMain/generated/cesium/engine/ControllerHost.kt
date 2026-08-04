// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.html.HTMLElement

/**
 * Creates an instance of a `ControllerHost`. Typically, a `ControllerHost` is created by the Scene constructor and accessed via [Scene.controllerHost].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ControllerHost.html">Online Documentation</a>
 */
open external class ControllerHost {
    /**
     * The number of controllers registered to this host.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ControllerHost.html#controllerCount">Online Documentation</a>
     */
    val controllerCount: Double

    /**
     * Registers a controller implementation with this host.
     * @param [controller] An implementation of the Controller interface to register with this host.
     * @param [element] The DOM element containing the Cesium scene.
     * @param [priority] An index, less than or equal to the current count of registed controllers, that defines the precedence of the new controller relative to those previously registered. A priority of `0` would mean the new controller would apply its updates before any other controller. As subsequent controllers are updated, their effects are applied on top of any previous update effects. If omitted, the new controller becomes the highest priority, i.e., its updates are applied after all other controllers.
     *   Default value - `0`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ControllerHost.html#registerController">Online Documentation</a>
     */
    fun registerController(
        controller: Controller,
        element: HTMLElement,
        priority: Double? = definedExternally,
    )

    /**
     * Unregisters a controller implementation from this host.
     * @param [controller] An implementation of the Controller interface to unregister from this host.
     * @param [element] The DOM element containing the Cesium scene.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ControllerHost.html#unregisterController">Online Documentation</a>
     */
    fun unregisterController(
        controller: Controller,
        element: HTMLElement,
    )

    /**
     * Invoked once per frame by the host scene. Updates all registered controllers in order of their priority.
     * @param [scene] The host scene.
     * @param [time] The current simulation time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ControllerHost.html#update">Online Documentation</a>
     */
    fun update(
        scene: Scene,
        time: JulianDate,
    )
}
