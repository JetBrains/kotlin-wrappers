// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A grouping for tasks. The editor by default supports the
 * 'Clean', 'Build', 'RebuildAll' and 'Test' group.
 */
open external class TaskGroup {
    /**
     * The clean task group;
     */
//  static Clean: TaskGroup

    /**
     * The build task group;
     */
//  static Build: TaskGroup

    /**
     * The rebuild all task group;
     */
//  static Rebuild: TaskGroup

    /**
     * The test all task group;
     */
//  static Test: TaskGroup

    /**
     * Whether the task that is part of this group is the default for the group.
     * This property cannot be set through API, and is controlled by a user's task configurations.
     */
    val isDefault: Boolean

    /**
     * The ID of the task group. Is one of TaskGroup.Clean.id, TaskGroup.Build.id, TaskGroup.Rebuild.id, or TaskGroup.Test.id.
     */
    val id: String

    /**
     * Private constructor
     *
     * @param id Identifier of a task group.
     * @param label The human-readable name of a task group.
     */
//  private constructor(id: string, label: string)
}
