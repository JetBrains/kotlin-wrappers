// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Convert a device file path to a URL that can be loaded by the webview.
 *
 * The asset protocol must be enabled and the files you want to expose must be
 * included in its scope. The protocol origins must also be allowed by the
 * relevant [`app.security.csp`](https://v2.tauri.app/reference/config/#csp-1)
 * directive. For example, this configuration allows images from the user's
 * downloads directory:
 *
 * ```json
 * {
 *   "app": {
 *     "security": {
 *       "assetProtocol": {
 *         "enable": true,
 *         "scope": ["$DOWNLOAD&#47;**"]
 *       },
 *       "csp": "default-src 'self'; img-src 'self' asset: http://asset.localhost"
 *     }
 *   }
 * }
 * ```
 *
 * See [`assetProtocol`](https://v2.tauri.app/reference/config/#assetprotocolconfig)
 * for the available scope variables and platform-specific protocol details.
 *
 * @param filePath The file path.
 * @param protocol The protocol to use. Defaults to `asset`. You only need to set this when using a custom protocol.
 * @example
 * ```typescript
 * import { downloadDir, join } from '@tauri-apps/api/path';
 * import { convertFileSrc } from '@tauri-apps/api/core';
 * const downloads = await downloadDir();
 * const filePath = await join(downloads, 'photo.png');
 * const assetUrl = convertFileSrc(filePath);
 *
 * const image = document.getElementById('my-image') as HTMLImageElement;
 * image.src = assetUrl;
 * ```
 *
 * @return the URL that can be used as source on the webview.
 *
 * @since 1.0.0
 */
external fun convertFileSrc(
    filePath: String,
    protocol: String = definedExternally,
): String
