// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determine how translucent surfaces will be handled.
 *
 * When OIT is enabled, then this will delegate to OIT.executeCommands.
 * Otherwise, it will just be executeTranslucentCommandsBackToFront
 * for render passes, or executeTranslucentCommandsFrontToBack for
 * other passes.
 * @param [scene] The scene.
 * @return A function to execute translucent commands.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#obtainTranslucentCommandExecutionFunction">Online Documentation</a>
 */
external fun obtainTranslucentCommandExecutionFunction(scene: Scene): Function<*>
