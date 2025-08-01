// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * A structure that defines a task kind in the system.
 * The value must be JSON-stringifyable.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskDefinition)
 */
@JsPlainObject
external interface TaskDefinition {
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskDefinition.type)
     */
    val type: String

    /**
     * Additional attributes of a concrete task definition.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskDefinition.[name)
     */
    // [name: string]: any
}
