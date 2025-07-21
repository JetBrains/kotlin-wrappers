// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents the main editor area which consists of multiple groups which contain tabs.
*/
export interface TabGroups {
/**
 * All the groups within the group container.
*/
readonly all: readonly TabGroup[];

/**
 * The currently active group.
*/
readonly activeTabGroup: TabGroup;

/**
 * An {@link Event event} which fires when {@link TabGroup tab groups} have changed.
*/
readonly onDidChangeTabGroups: Event<TabGroupChangeEvent>;

/**
 * An {@link Event event} which fires when {@link Tab tabs} have changed.
*/
readonly onDidChangeTabs: Event<TabChangeEvent>;

/**
 * Closes the tab. This makes the tab object invalid and the tab
 * should no longer be used for further actions.
 * Note: In the case of a dirty tab, a confirmation dialog will be shown which may be cancelled. If cancelled the tab is still valid
 *
 * @param tab The tab to close.
 * @param preserveFocus When `true` focus will remain in its current position. If `false` it will jump to the next tab.
 * @returns A promise that resolves to `true` when all tabs have been closed.
*/
close(tab: Tab | readonly Tab[], preserveFocus?: boolean): Thenable<boolean>;

/**
 * Closes the tab group. This makes the tab group object invalid and the tab group
 * should no longer be used for further actions.
 * @param tabGroup The tab group to close.
 * @param preserveFocus When `true` focus will remain in its current position.
 * @returns A promise that resolves to `true` when all tab groups have been closed.
*/
close(tabGroup: TabGroup | readonly TabGroup[], preserveFocus?: boolean): Thenable<boolean>;
}

// ORIGINAL SOURCE
 **/
