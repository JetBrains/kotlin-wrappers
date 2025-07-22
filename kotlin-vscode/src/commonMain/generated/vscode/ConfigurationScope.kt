// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The configuration scope which can be:
 * - a {@link Uri} representing a resource
 * - a {@link TextDocument} representing an open text document
 * - a {@link WorkspaceFolder} representing a workspace folder
 * - an object containing:
 *   - `uri`: an optional {@link Uri} of a text document
 *   - `languageId`: the language identifier of a text document
*/
export type ConfigurationScope = Uri | TextDocument | WorkspaceFolder | {
/**
 * The uri of a {@link TextDocument text document}
*/
uri?: Uri;
/**
 * The language of a text document
*/
languageId: string;
};

// ORIGINAL SOURCE
 **/
