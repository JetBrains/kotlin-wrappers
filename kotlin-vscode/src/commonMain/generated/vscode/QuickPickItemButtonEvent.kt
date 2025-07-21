// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * An event signaling when a button in a particular {@link QuickPickItem} was triggered.
 * This event does not fire for buttons in the title bar.
*/
export interface QuickPickItemButtonEvent<T extends QuickPickItem> {
/**
 * The button that was clicked.
*/
readonly button: QuickInputButton;
/**
 * The item that the button belongs to.
*/
readonly item: T;
}

// ORIGINAL SOURCE
 **/
