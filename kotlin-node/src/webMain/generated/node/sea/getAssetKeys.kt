// Automatically generated - do not modify!

@file:JsModule("node:sea")

package node.sea

/**
 * This method can be used to retrieve an array of all the keys of assets
 * embedded into the single-executable application.
 * An error is thrown when not running inside a single-executable application.
 * @since v24.8.0
 * @returns An array containing all the keys of the assets
 * embedded in the executable. If no assets are embedded, returns an empty array.
 */
external fun getAssetKeys(): js.array.ReadonlyArray<String>
