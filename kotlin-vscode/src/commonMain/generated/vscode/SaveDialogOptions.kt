// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Options to configure the behaviour of a file save dialog.
*/
export interface SaveDialogOptions {
/**
 * The resource the dialog shows when opened.
*/
defaultUri?: Uri;

/**
 * A human-readable string for the save button.
*/
saveLabel?: string;

/**
 * A set of file filters that are used by the dialog. Each entry is a human-readable label,
 * like "TypeScript", and an array of extensions, for example:
 * ```ts
 * {
 * 	'Images': ['png', 'jpg'],
 * 	'TypeScript': ['ts', 'tsx']
 * }
 * ```
*/
filters?: { [name: string]: string[] };

/**
 * Dialog title.
 *
 * This parameter might be ignored, as not all operating systems display a title on save dialogs
 * (for example, macOS).
*/
title?: string;
}

// ORIGINAL SOURCE
 **/
