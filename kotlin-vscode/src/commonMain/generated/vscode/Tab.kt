// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Represents a tab within a {@link TabGroup group of tabs}.
 * Tabs are merely the graphical representation within the editor area.
 * A backing editor is not a guarantee.
 */
external interface Tab {
    /**
     * The text displayed on the tab.
     */
    val label: String

    /**
     * The group which the tab belongs to.
     */
    val group: TabGroup

    /**
     * Defines the structure of the tab i.e. text, notebook, custom, etc.
     * Resource and other useful properties are defined on the tab kind.
     */
    val input: JsAny /* TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | unknown */

    /**
     * Whether or not the tab is currently active.
     * This is dictated by being the selected tab in the group.
     */
    val isActive: Boolean

    /**
     * Whether or not the dirty indicator is present on the tab.
     */
    val isDirty: Boolean

    /**
     * Whether or not the tab is pinned (pin icon is present).
     */
    val isPinned: Boolean

    /**
     * Whether or not the tab is in preview mode.
     */
    val isPreview: Boolean
}
