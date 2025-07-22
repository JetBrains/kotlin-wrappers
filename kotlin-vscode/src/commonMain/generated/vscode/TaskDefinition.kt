// Automatically generated - do not modify!

package vscode

/**
 * A structure that defines a task kind in the system.
 * The value must be JSON-stringifyable.
 */
external interface TaskDefinition {
    /**
    // ORIGINAL SOURCE

    /**
     * The task definition describing the task provided by an extension.
     * Usually a task provider defines more properties to identify
     * a task. They need to be defined in the package.json of the
     * extension under the 'taskDefinitions' extension point. The npm
     * task definition for example looks like this
     * ```typescript
     * interface NpmTaskDefinition extends TaskDefinition {
     *     script: string;
     * }
     * ```
     *
     * Note that type identifier starting with a '$' are reserved for internal
     * usages and shouldn't be used by extensions.
    */
    readonly type: string;

    /**
     * Additional attributes of a concrete task definition.
    */
    [name: string]: any;

    // ORIGINAL SOURCE
     **/
}
