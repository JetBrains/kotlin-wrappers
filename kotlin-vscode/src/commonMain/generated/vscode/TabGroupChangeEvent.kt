// Automatically generated - do not modify!

package vscode

/**
 * An event describing changes to tab groups.
 */
external interface TabGroupChangeEvent {
    /**
    // ORIGINAL SOURCE

    /**
     * Tab groups that have been opened.
    */
    readonly opened: readonly TabGroup[];
    /**
     * Tab groups that have been closed.
    */
    readonly closed: readonly TabGroup[];
    /**
     * Tab groups that have changed, e.g have changed
     * their {@link TabGroup.isActive active} state.
    */
    readonly changed: readonly TabGroup[];

    // ORIGINAL SOURCE
     **/
}
