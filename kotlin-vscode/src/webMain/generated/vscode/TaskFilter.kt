// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * A task filter denotes tasks by their version and types
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskFilter)
 */
@JsPlainObject
external interface TaskFilter {
    /**
     * The task version as used in the tasks.json file.
     * The string support the package.json semver notation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskFilter.version)
     */
    var version: String?

    /**
     * The task type to return;
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskFilter.type)
     */
    var type: String?
}
