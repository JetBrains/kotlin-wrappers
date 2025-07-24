// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.Void

/**
 * Namespace for dealing with installed extensions. Extensions are represented
 * by an {@link Extension}-interface which enables reflection on them.
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
 * to `package.json`, and use the {@link extensions.getExtension getExtension}-function
 * and the {@link Extension.exports exports}-property, like below:
 *
 * ```javascript
 * let mathExt = extensions.getExtension('genius.math');
 * let importedApi = mathExt.exports;
 *
 * console.log(importedApi.mul(42, 1));
 * ```
 */
external object extensions {
    /**
     * Get an extension by its full identifier in the form of: `publisher.name`.
     *
     * @param extensionId An extension identifier.
     * @returns An extension or `undefined`.
     */
    fun <T : JsAny?> getExtension(extensionId: String): Extension<T>?

    /**
     * All extensions currently known to the system.
     */
    val all: ReadonlyArray<Extension<*>>

    /**
     * An event which fires when `extensions.all` changes. This can happen when extensions are
     * installed, uninstalled, enabled or disabled.
     */
    val onDidChange: Event<Void>
}
