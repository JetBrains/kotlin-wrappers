// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * A location in the editor at which progress information can be shown. It depends on the
 * location how progress is visually represented.
*/
export enum ProgressLocation {

/**
 * Show progress for the source control viewlet, as overlay for the icon and as progress bar
 * inside the viewlet (when visible). Neither supports cancellation nor discrete progress nor
 * a label to describe the operation.
*/
SourceControl = 1,

/**
 * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
 * Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax in the progress label.
*/
Window = 10,

/**
 * Show progress as notification with an optional cancel button. Supports to show infinite and discrete
 * progress but does not support rendering of icons.
*/
Notification = 15
}

// ORIGINAL SOURCE
 **/
