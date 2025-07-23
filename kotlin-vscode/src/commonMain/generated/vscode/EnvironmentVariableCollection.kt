// Automatically generated - do not modify!

package vscode

import js.array.Tuple2
import js.iterable.JsIterable

/**
 * A collection of mutations that an extension can apply to a process environment.
 */
external interface EnvironmentVariableCollection :
    JsIterable<Tuple2</* variable: */ String, /* mutator: */ EnvironmentVariableMutator>> {
    /**
     * Whether the collection should be cached for the workspace and applied to the terminal
     * across window reloads. When true the collection will be active immediately such when the
     * window reloads. Additionally, this API will return the cached version if it exists. The
     * collection will be invalidated when the extension is uninstalled or when the collection
     * is cleared. Defaults to true.
     */
    var persistent: Boolean

    /**
     * A description for the environment variable collection, this will be used to describe the
     * changes in the UI.
     */
    var description: Any /* string | MarkdownString */?

    /**
     * Replace an environment variable with a value.
     *
     * Note that an extension can only make a single change to any one variable, so this will
     * overwrite any previous calls to replace, append or prepend.
     *
     * @param variable The variable to replace.
     * @param value The value to replace the variable with.
     * @param options Options applied to the mutator, when no options are provided this will
     * default to `{ applyAtProcessCreation: true }`.
     */
    fun replace(
        variable: String,
        value: String,
        options: EnvironmentVariableMutatorOptions = definedExternally,
    )

    /**
     * Append a value to an environment variable.
     *
     * Note that an extension can only make a single change to any one variable, so this will
     * overwrite any previous calls to replace, append or prepend.
     *
     * @param variable The variable to append to.
     * @param value The value to append to the variable.
     * @param options Options applied to the mutator, when no options are provided this will
     * default to `{ applyAtProcessCreation: true }`.
     */
    fun append(
        variable: String,
        value: String,
        options: EnvironmentVariableMutatorOptions = definedExternally,
    )

    /**
     * Prepend a value to an environment variable.
     *
     * Note that an extension can only make a single change to any one variable, so this will
     * overwrite any previous calls to replace, append or prepend.
     *
     * @param variable The variable to prepend.
     * @param value The value to prepend to the variable.
     * @param options Options applied to the mutator, when no options are provided this will
     * default to `{ applyAtProcessCreation: true }`.
     */
    fun prepend(
        variable: String,
        value: String,
        options: EnvironmentVariableMutatorOptions = definedExternally,
    )

    /**
     * Gets the mutator that this collection applies to a variable, if any.
     *
     * @param variable The variable to get the mutator for.
     */
    fun get(variable: String): EnvironmentVariableMutator?

    /**
     * Iterate over each mutator in this collection.
     *
     * @param callback Function to execute for each entry.
     * @param thisArg The `this` context used when invoking the handler function.
     */
    fun forEach(
        callback: (
            variable: String,
            mutator: EnvironmentVariableMutator,
            collection: EnvironmentVariableCollection,
        ) -> Unit,
        thisArg: Any? = definedExternally,
    )

    /**
     * Deletes this collection's mutator for a variable.
     *
     * @param variable The variable to delete the mutator for.
     */
    fun delete(variable: String)

    /**
     * Clears all mutators from this collection.
     */
    fun clear()
}
