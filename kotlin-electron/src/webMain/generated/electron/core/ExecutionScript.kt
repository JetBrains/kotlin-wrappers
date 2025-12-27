// Automatically generated - do not modify!

package electron.core

external interface ExecutionScript {
    /**
     * A JavaScript function to execute. This function will be serialized which means
     * that any bound parameters and execution context will be lost.
     */
    var func: Function<Any?> // (...args: any[]) => any

    /**
     * An array of arguments to pass to the provided function. These arguments will be
     * copied between worlds in accordance with the table of supported types.
     */
    var args: js.array.ReadonlyArray<Any?>?
}
