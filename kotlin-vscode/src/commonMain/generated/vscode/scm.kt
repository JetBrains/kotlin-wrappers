// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Namespace for source control management.
*/
export namespace scm {

/**
 * The {@link SourceControlInputBox input box} for the last source control
 * created by the extension.
 *
 * @deprecated Use SourceControl.inputBox instead
*/
export const inputBox: SourceControlInputBox;

/**
 * Creates a new {@link SourceControl source control} instance.
 *
 * @param id An `id` for the source control. Something short, e.g.: `git`.
 * @param label A human-readable string for the source control. E.g.: `Git`.
 * @param rootUri An optional Uri of the root of the source control. E.g.: `Uri.parse(workspaceRoot)`.
 * @returns An instance of {@link SourceControl source control}.
*/
export function createSourceControl(id: string, label: string, rootUri?: Uri): SourceControl;
}

// ORIGINAL SOURCE
 **/
