// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Represents a group of tabs. A tab group itself consists of multiple tabs.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroup)
 */
@JsPlainObject
external interface TabGroup {
    /**
     * Whether or not the group is currently active.
     *
     * *Note* that only one tab group is active at a time, but that multiple tab
     * groups can have an [active tab][activeTab].
     *
     * @see [Tab.isActive]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroup.isActive)
     */
    val isActive: Boolean

    /**
     * The view column of the group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroup.viewColumn)
     */
    val viewColumn: ViewColumn

    /**
     * The active [tab][Tab] in the group. This is the tab whose contents are currently
     * being rendered.
     *
     * *Note* that there can be one active tab per group but there can only be one [active group][TabGroups.activeTabGroup].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroup.activeTab)
     */
    val activeTab: Tab?

    /**
     * The list of tabs contained within the group.
     * This can be empty if the group has no tabs open.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabGroup.tabs)
     */
    val tabs: ReadonlyArray<Tab>
}
