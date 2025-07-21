// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Content settings for a webview.
*/
export interface WebviewOptions {
/**
 * Controls whether scripts are enabled in the webview content or not.
 *
 * Defaults to false (scripts-disabled).
*/
readonly enableScripts?: boolean;

/**
 * Controls whether forms are enabled in the webview content or not.
 *
 * Defaults to true if {@link WebviewOptions.enableScripts scripts are enabled}. Otherwise defaults to false.
 * Explicitly setting this property to either true or false overrides the default.
*/
readonly enableForms?: boolean;

/**
 * Controls whether command uris are enabled in webview content or not.
 *
 * Defaults to `false` (command uris are disabled).
 *
 * If you pass in an array, only the commands in the array are allowed.
*/
readonly enableCommandUris?: boolean | readonly string[];

/**
 * Root paths from which the webview can load local (filesystem) resources using uris from `asWebviewUri`
 *
 * Default to the root folders of the current workspace plus the extension's install directory.
 *
 * Pass in an empty array to disallow access to any local resources.
*/
readonly localResourceRoots?: readonly Uri[];

/**
 * Mappings of localhost ports used inside the webview.
 *
 * Port mapping allow webviews to transparently define how localhost ports are resolved. This can be used
 * to allow using a static localhost port inside the webview that is resolved to random port that a service is
 * running on.
 *
 * If a webview accesses localhost content, we recommend that you specify port mappings even if
 * the `webviewPort` and `extensionHostPort` ports are the same.
 *
 * *Note* that port mappings only work for `http` or `https` urls. Websocket urls (e.g. `ws://localhost:3000`)
 * cannot be mapped to another port.
*/
readonly portMapping?: readonly WebviewPortMapping[];
}

// ORIGINAL SOURCE
 **/
