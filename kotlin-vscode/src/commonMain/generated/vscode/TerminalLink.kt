// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * A link on a terminal line.
*/
export class TerminalLink {
/**
 * The start index of the link on {@link TerminalLinkContext.line}.
*/
startIndex: number;

/**
 * The length of the link on {@link TerminalLinkContext.line}.
*/
length: number;

/**
 * The tooltip text when you hover over this link.
 *
 * If a tooltip is provided, is will be displayed in a string that includes instructions on
 * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
 * depending on OS, user settings, and localization.
*/
tooltip?: string;

/**
 * Creates a new terminal link.
 * @param startIndex The start index of the link on {@link TerminalLinkContext.line}.
 * @param length The length of the link on {@link TerminalLinkContext.line}.
 * @param tooltip The tooltip text when you hover over this link.
 *
 * If a tooltip is provided, is will be displayed in a string that includes instructions on
 * how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
 * depending on OS, user settings, and localization.
*/
constructor(startIndex: number, length: number, tooltip?: string);
}

// ORIGINAL SOURCE
 **/
