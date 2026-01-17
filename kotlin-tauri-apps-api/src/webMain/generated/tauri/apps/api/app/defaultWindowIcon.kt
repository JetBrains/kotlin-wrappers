// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

import tauri.apps.api.image.Image

/**
 * Gets the default window icon.
 *
 * @example
 * ```typescript
 * import { defaultWindowIcon } from '@tauri-apps/api/app';
 * const icon = await defaultWindowIcon();
 * ```
 *
 * @since 2.0.0
 */
external fun defaultWindowIcon(): js.promise.Promise<Image?>
