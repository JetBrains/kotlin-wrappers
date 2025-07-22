// Automatically generated - do not modify!

package vscode

/**
 * A task filter denotes tasks by their version and types
 */
external interface TaskFilter {
    /**
     * The task version as used in the tasks.json file.
     * The string support the package.json semver notation.
     */
    var version: String?

    /**
     * The task type to return;
     */
    var type: String?
}
