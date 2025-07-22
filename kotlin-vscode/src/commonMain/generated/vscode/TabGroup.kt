// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents a group of tabs. A tab group itself consists of multiple tabs.
 */
external interface TabGroup {
    /**
     * Whether or not the group is currently active.
     *
     * *Note* that only one tab group is active at a time, but that multiple tab
     * groups can have an {@link activeTab active tab}.
     *
     * @see {@link Tab.isActive}
     */
    val isActive: Boolean

    /**
     * The view column of the group.
     */
    val viewColumn: ViewColumn

    /**
     * The active {@link Tab tab} in the group. This is the tab whose contents are currently
     * being rendered.
     *
     * *Note* that there can be one active tab per group but there can only be one {@link TabGroups.activeTabGroup active group}.
     */
    val activeTab: Tab

    /**
     * The list of tabs contained within the group.
     * This can be empty if the group has no tabs open.
     */
    val tabs: ReadonlyArray<Tab>
}
