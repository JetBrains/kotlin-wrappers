// Automatically generated - do not modify!

@file:JsModule("node:sea")

package node.sea

/**
 * Similar to `sea.getAsset()`, but returns the result in a [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob).
 * An error is thrown when no matching asset can be found.
 * @since v20.12.0
 */
external fun getAssetAsBlob(
    key: AssetKey,
    options: GetAssetAsBlobOptions = definedExternally,
): web.blob.Blob
