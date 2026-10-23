// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/image")

package tauri.apps.api.image

import tauri.apps.api.core.Resource

/**
 * An RGBA Image in row-major order from top to bottom.
 *
 * Instances are created with {@linkcode Image.new}, {@linkcode Image.fromBytes} or
 * {@linkcode Image.fromPath} and can be passed wherever a {@linkcode JsImage} is
 * accepted, such as `Window.setIcon`, `TrayIcon.setIcon` or an icon menu item.
 *
 * @example
 * ```typescript
 * import { Image } from '@tauri-apps/api/image';
 * import { getCurrentWindow } from '@tauri-apps/api/window';
 *
 * const icon = await Image.fromPath('icons/icon.png');
 * await getCurrentWindow().setIcon(icon);
 * await icon.close();
 * ```
 *
 * @since 2.0.0
 */
external class Image : Resource {
    /**
     * Creates an Image from a resource ID. For internal use only.
     *
     * @ignore
     */
    constructor (rid: Double)

    /**
     * Returns the RGBA data for this image, in row-major order from top to bottom.
     *
     * The returned buffer has `width * height * 4` bytes, see {@linkcode Image.size}.
     *
     * @example
     * ```typescript
     * import { Image } from '@tauri-apps/api/image';
     *
     * const image = await Image.fromPath('icons/icon.png');
     * const rgba = await image.rgba();
     * ```
     *
     * @since 2.0.0
     */
    fun rgba(): js.promise.Promise<js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>>

    /**
     * Returns the size of this image, in pixels.
     *
     * @example
     * ```typescript
     * import { Image } from '@tauri-apps/api/image';
     *
     * const image = await Image.fromPath('icons/icon.png');
     * const { width, height } = await image.size();
     * ```
     *
     * @since 2.0.0
     */
    fun size(): js.promise.Promise<ImageSize>

    companion object {
        /**
         * Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height.
         *
         * The buffer must contain exactly `width * height * 4` bytes.
         * Unlike {@linkcode Image.fromBytes} and {@linkcode Image.fromPath} this does not
         * decode an image format, so it requires no extra Cargo feature.
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * // a 1x1 opaque red image
         * const image = await Image.new(new Uint8Array([255, 0, 0, 255]), 1, 1);
         * ```
         *
         * @since 2.0.0
         */
        fun new(
            rgba: js.array.ReadonlyArray<Double>,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /**
         * Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height.
         *
         * The buffer must contain exactly `width * height * 4` bytes.
         * Unlike {@linkcode Image.fromBytes} and {@linkcode Image.fromPath} this does not
         * decode an image format, so it requires no extra Cargo feature.
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * // a 1x1 opaque red image
         * const image = await Image.new(new Uint8Array([255, 0, 0, 255]), 1, 1);
         * ```
         *
         * @since 2.0.0
         */
        fun new(
            rgba: js.typedarrays.Uint8Array<*>,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /**
         * Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height.
         *
         * The buffer must contain exactly `width * height * 4` bytes.
         * Unlike {@linkcode Image.fromBytes} and {@linkcode Image.fromPath} this does not
         * decode an image format, so it requires no extra Cargo feature.
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * // a 1x1 opaque red image
         * const image = await Image.new(new Uint8Array([255, 0, 0, 255]), 1, 1);
         * ```
         *
         * @since 2.0.0
         */
        fun new(
            rgba: js.buffer.ArrayBuffer,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * const bytes = await fetch('/icon.png').then((r) => r.arrayBuffer());
         * const image = await Image.fromBytes(bytes);
         * ```
         *
         * @since 2.0.0
         */
        fun fromBytes(bytes: js.array.ReadonlyArray<Double>): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * const bytes = await fetch('/icon.png').then((r) => r.arrayBuffer());
         * const image = await Image.fromBytes(bytes);
         * ```
         *
         * @since 2.0.0
         */
        fun fromBytes(bytes: js.typedarrays.Uint8Array<*>): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         *
         * const bytes = await fetch('/icon.png').then((r) => r.arrayBuffer());
         * const image = await Image.fromBytes(bytes);
         * ```
         *
         * @since 2.0.0
         */
        fun fromBytes(bytes: js.buffer.ArrayBuffer): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided path.
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         *
         * The path is resolved on the Rust side, so it must be a path on the user's
         * machine (for example one returned by the path APIs or a bundled resource
         * resolved with `resolveResource`), not a frontend asset URL.
         *
         * @example
         * ```typescript
         * import { Image } from '@tauri-apps/api/image';
         * import { resolveResource } from '@tauri-apps/api/path';
         *
         * const image = await Image.fromPath(await resolveResource('icons/icon.png'));
         * ```
         *
         * @since 2.0.0
         */
        fun fromPath(path: String): js.promise.Promise<Image>
    }
}
