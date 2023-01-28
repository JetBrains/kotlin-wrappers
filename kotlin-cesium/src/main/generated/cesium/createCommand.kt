// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Create a Command from a given function, for use with ViewModels.
 *
 * A Command is a function with an extra `canExecute` observable property to determine
 * whether the command can be executed.  When executed, a Command function will check the
 * value of `canExecute` and throw if false.  It also provides events for when
 * a command has been or is about to be executed.
 * @param [func] The function to execute.
 * @param [canExecute] A boolean indicating whether the function can currently be executed.
 *   Default value - `true`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/createCommand.html">Online Documentation</a>
 */
external fun createCommand(
    func: Function<*>,
    canExecute: Boolean? = definedExternally,
)
