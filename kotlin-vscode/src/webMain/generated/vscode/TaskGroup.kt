// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A grouping for tasks. The editor by default supports the
 * 'Clean', 'Build', 'RebuildAll' and 'Test' group.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup)
 */
open external class TaskGroup {
    /**
     * Whether the task that is part of this group is the default for the group.
     * This property cannot be set through API, and is controlled by a user's task configurations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.isDefault)
     */
    val isDefault: Boolean?

    /**
     * The ID of the task group. Is one of TaskGroup.Clean.id, TaskGroup.Build.id, TaskGroup.Rebuild.id, or TaskGroup.Test.id.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.id)
     */
    val id: String

    /**
     * Private constructor
     *
     * @param id Identifier of a task group.
     * @param label The human-readable name of a task group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.constructor)
     */
    private constructor(
        id: String,
        label: String,
    )

    companion object {
        /**
         * The clean task group;
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.Clean)
         */
        var Clean: TaskGroup

        /**
         * The build task group;
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.Build)
         */
        var Build: TaskGroup

        /**
         * The rebuild all task group;
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.Rebuild)
         */
        var Rebuild: TaskGroup

        /**
         * The test all task group;
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TaskGroup.Test)
         */
        var Test: TaskGroup
    }
}
