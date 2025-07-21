// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Additional data for entries of a workspace edit. Supports to label entries and marks entries
 * as needing confirmation by the user. The editor groups edits with equal labels into tree nodes,
 * for instance all edits labelled with "Changes in Strings" would be a tree node.
*/
export interface WorkspaceEditEntryMetadata {

/**
 * A flag which indicates that user confirmation is needed.
*/
needsConfirmation: boolean;

/**
 * A human-readable string which is rendered prominent.
*/
label: string;

/**
 * A human-readable string which is rendered less prominent on the same line.
*/
description?: string;

/**
 * The icon path or {@link ThemeIcon} for the edit.
*/
iconPath?: IconPath;
}

// ORIGINAL SOURCE
 **/
