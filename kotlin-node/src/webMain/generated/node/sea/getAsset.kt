// Automatically generated - do not modify!

@file:JsModule("node:sea")

package node.sea

/**
 * This method can be used to retrieve the assets configured to be bundled into the
 * single-executable application at build time.
 * An error is thrown when no matching asset can be found.
 * @since v20.12.0
 */
external fun getAsset(key: AssetKey): js.buffer.ArrayBuffer

external fun getAsset(
    key: AssetKey,
    encoding: String,
): String
