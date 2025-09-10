// Automatically generated - do not modify!

package vscode

import kotlin.js.JsAny

/**
 * The configuration scope which can be:
 * - a [Uri] representing a resource
 * - a [TextDocument] representing an open text document
 * - a [WorkspaceFolder] representing a workspace folder
 * - an object containing:
 *   - `uri`: an optional [Uri] of a text document
 *   - `languageId`: the language identifier of a text document
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ConfigurationScope)
 */
typealias ConfigurationScope = JsAny /* Uri | TextDocument | WorkspaceFolder | {
	/**
	 * The uri of a {@link TextDocument text document}
	 */
	uri?: Uri;
	/**
	 * The language of a text document
	 */
	languageId: string;
} */
