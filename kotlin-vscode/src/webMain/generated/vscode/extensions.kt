// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.Void
import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * Namespace for dealing with installed extensions. Extensions are represented
 * by an [Extension]-interface which enables reflection on them.
 *
 * Extension writers can provide APIs to other extensions by returning their API public
 * surface from the `activate`-call.
 *
 * ```javascript
 * export function activate(context: vscode.ExtensionContext) {
 * 	let api = {
 * 		sum(a, b) {
 * 			return a + b;
 * 		},
 * 		mul(a, b) {
 * 			return a * b;
 * 		}
 * 	};
 * 	// 'export' public api-surface
 * 	return api;
 * }
 * ```
 * When depending on the API of another extension add an `extensionDependencies`-entry
 * to `package.json`, and use the [getExtension][extensions.getExtension]-function
 * and the [exports][Extension.exports]-property, like below:
 *
 * ```javascript
 * let mathExt = extensions.getExtension('genius.math');
 * let importedApi = mathExt.exports;
 *
 * console.log(importedApi.mul(42, 1));
 * ```
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#extensions)
 */
external object extensions {
    /**
     * Get an extension by its full identifier in the form of: `publisher.name`.
     *
     * @param extensionId An extension identifier.
     * @returns An extension or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#extensions.getExtension)
     */
    fun <T : JsAny?> getExtension(extensionId: String): Extension<T>?

    /**
     * All extensions currently known to the system.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#extensions.all)
     */
    val all: ReadonlyArray<Extension<*>>

    /**
     * An event which fires when `extensions.all` changes. This can happen when extensions are
     * installed, uninstalled, enabled or disabled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#extensions.onDidChange)
     */
    val onDidChange: Event<Void>
}
