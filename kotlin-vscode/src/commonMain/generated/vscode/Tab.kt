// Automatically generated - do not modify!

package vscode

/**
 * Represents a tab within a {@link TabGroup group of tabs}.
 * Tabs are merely the graphical representation within the editor area.
 * A backing editor is not a guarantee.
 */
external interface Tab {
    /**
    // ORIGINAL SOURCE


    /**
     * The text displayed on the tab.
    */
    readonly label: string;

    /**
     * The group which the tab belongs to.
    */
    readonly group: TabGroup;

    /**
     * Defines the structure of the tab i.e. text, notebook, custom, etc.
     * Resource and other useful properties are defined on the tab kind.
    */
    readonly input: TabInputText | TabInputTextDiff | TabInputCustom | TabInputWebview | TabInputNotebook | TabInputNotebookDiff | TabInputTerminal | unknown;

    /**
     * Whether or not the tab is currently active.
     * This is dictated by being the selected tab in the group.
    */
    readonly isActive: boolean;

    /**
     * Whether or not the dirty indicator is present on the tab.
    */
    readonly isDirty: boolean;

    /**
     * Whether or not the tab is pinned (pin icon is present).
    */
    readonly isPinned: boolean;

    /**
     * Whether or not the tab is in preview mode.
    */
    readonly isPreview: boolean;

    // ORIGINAL SOURCE
     **/
}
