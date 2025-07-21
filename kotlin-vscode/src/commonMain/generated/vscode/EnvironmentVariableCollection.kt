// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A collection of mutations that an extension can apply to a process environment.
*/
export interface EnvironmentVariableCollection extends Iterable<[variable: string, mutator: EnvironmentVariableMutator]> {
/**
 * Whether the collection should be cached for the workspace and applied to the terminal
 * across window reloads. When true the collection will be active immediately such when the
 * window reloads. Additionally, this API will return the cached version if it exists. The
 * collection will be invalidated when the extension is uninstalled or when the collection
 * is cleared. Defaults to true.
*/
persistent: boolean;

/**
 * A description for the environment variable collection, this will be used to describe the
 * changes in the UI.
*/
description: string | MarkdownString | undefined;

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
replace(variable: string, value: string, options?: EnvironmentVariableMutatorOptions): void;

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
append(variable: string, value: string, options?: EnvironmentVariableMutatorOptions): void;

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
prepend(variable: string, value: string, options?: EnvironmentVariableMutatorOptions): void;

/**
 * Gets the mutator that this collection applies to a variable, if any.
 *
 * @param variable The variable to get the mutator for.
*/
get(variable: string): EnvironmentVariableMutator | undefined;

/**
 * Iterate over each mutator in this collection.
 *
 * @param callback Function to execute for each entry.
 * @param thisArg The `this` context used when invoking the handler function.
*/
forEach(callback: (variable: string, mutator: EnvironmentVariableMutator, collection: EnvironmentVariableCollection) => any, thisArg?: any): void;

/**
 * Deletes this collection's mutator for a variable.
 *
 * @param variable The variable to delete the mutator for.
*/
delete(variable: string): void;

/**
 * Clears all mutators from this collection.
*/
clear(): void;
}

// ORIGINAL SOURCE
 **/
