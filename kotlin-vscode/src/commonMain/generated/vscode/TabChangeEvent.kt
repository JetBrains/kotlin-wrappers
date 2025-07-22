// Automatically generated - do not modify!

package vscode

/**
 * An event describing change to tabs.
 */
external interface TabChangeEvent {
    /**
    // ORIGINAL SOURCE

    /**
     * The tabs that have been opened.
    */
    readonly opened: readonly Tab[];
    /**
     * The tabs that have been closed.
    */
    readonly closed: readonly Tab[];
    /**
     * Tabs that have changed, e.g have changed
     * their {@link Tab.isActive active} state.
    */
    readonly changed: readonly Tab[];

    // ORIGINAL SOURCE
     **/
}
