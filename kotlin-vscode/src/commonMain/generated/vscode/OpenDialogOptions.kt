// Automatically generated - do not modify!

package vscode

/**
 * Options to configure the behaviour of a file open dialog.
 *
 * * Note 1: On Windows and Linux, a file dialog cannot be both a file selector and a folder selector, so if you
 * set both `canSelectFiles` and `canSelectFolders` to `true` on these platforms, a folder selector will be shown.
 * * Note 2: Explicitly setting `canSelectFiles` and `canSelectFolders` to `false` is futile
 * and the editor then silently adjusts the options to select files.
 */
external interface OpenDialogOptions {
    /**
     * The resource the dialog shows when opened.
     */
//  defaultUri?: Uri;

    /**
     * A human-readable string for the open button.
     */
//  openLabel?: string;

    /**
     * Allow to select files, defaults to `true`.
     */
//  canSelectFiles?: boolean;

    /**
     * Allow to select folders, defaults to `false`.
     */
//  canSelectFolders?: boolean;

    /**
     * Allow to select many files or folders.
     */
//  canSelectMany?: boolean;

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
//  filters?: { [name: string]: string[] };

    /**
     * Dialog title.
     *
     * This parameter might be ignored, as not all operating systems display a title on open dialogs
     * (for example, macOS).
     */
//  title?: string;
}
