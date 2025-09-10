// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * Represents a tab within a [group of tabs][TabGroup].
 * Tabs are merely the graphical representation within the editor area.
 * A backing editor is not a guarantee.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab)
 */
@JsPlainObject
external interface Tab {
    /**
     * The text displayed on the tab.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.label)
     */
    val label: String

    /**
     * The group which the tab belongs to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.group)
     */
    val group: TabGroup

    /**
     * Defines the structure of the tab i.e. text, notebook, custom, etc.
     * Resource and other useful properties are defined on the tab kind.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.input)
     */
    val input: JsAny /* TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | unknown */

    /**
     * Whether or not the tab is currently active.
     * This is dictated by being the selected tab in the group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.isActive)
     */
    val isActive: Boolean

    /**
     * Whether or not the dirty indicator is present on the tab.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.isDirty)
     */
    val isDirty: Boolean

    /**
     * Whether or not the tab is pinned (pin icon is present).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.isPinned)
     */
    val isPinned: Boolean

    /**
     * Whether or not the tab is in preview mode.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Tab.isPreview)
     */
    val isPreview: Boolean
}
