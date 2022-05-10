// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A Command is a function with an extra `canExecute` observable property to determine
 * whether the command can be executed.  When executed, a Command function will check the
 * value of `canExecute` and throw if false.
 *
 * This type describes an interface and is not intended to be instantiated directly.
 * See [createCommand] to create a command from a function.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Command.html">Online Documentation</a>
 */
abstract external class Command {
    /**
     * Gets whether this command can currently be executed.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Command.html#canExecute">Online Documentation</a>
     */
    abstract var canExecute: Boolean

    /**
     * Gets an event which is raised before the command executes, the event
     * is raised with an object containing two properties: a `cancel` property,
     * which if set to false by the listener will prevent the command from being executed, and
     * an `args` property, which is the array of arguments being passed to the command.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Command.html#beforeExecute">Online Documentation</a>
     */
    abstract var beforeExecute: DefaultEvent

    /**
     * Gets an event which is raised after the command executes, the event
     * is raised with the return value of the command as its only parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Command.html#afterExecute">Online Documentation</a>
     */
    abstract var afterExecute: DefaultEvent
}
