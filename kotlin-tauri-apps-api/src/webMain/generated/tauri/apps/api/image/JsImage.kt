// Automatically generated - do not modify!

package tauri.apps.api.image

/**
 * A type that can be passed to Rust side as [`tauri::image::JsImage`](https://docs.rs/tauri/2/tauri/image/enum.JsImage.html) through {@linkcode transformImage}
 *
 * Values of this type must go through {@linkcode transformImage} before being placed in `invoke` arguments;
 * an {@linkcode Image} instance is not serializable on its own.
 *
 * ## Variants
 *
 * - **string:** Path to an image in the filesystem. Maps to [`JsImage::Path`](https://docs.rs/tauri/2/tauri/image/enum.JsImage.html#variant.Path)
 * - **Uint8Array | ArrayBuffer | number[]:** ICO or PNG image in raw bytes. Maps to [`JsImage::Bytes`](https://docs.rs/tauri/2/tauri/image/enum.JsImage.html#variant.Bytes)
 * - **Image:** An image that was previously loaded with the API and is stored in the resource table. Maps to [`JsImage::Resource`](https://docs.rs/tauri/2/tauri/image/enum.JsImage.html#variant.Resource)
 *
 * The `string` and bytes variants require the `image-ico` or `image-png` Cargo features.
 * To enable them, change your Cargo.toml file:
 * ```toml
 * [dependencies]
 * tauri = { version = "...", features = ["...", "image-png"] }
 * ```
 *
 * The Rust [`JsImage::Rgba`](https://docs.rs/tauri/2/tauri/image/enum.JsImage.html#variant.Rgba) variant is intentionally not exposed here;
 * use {@linkcode Image.new} to create an image from raw RGBA data instead.
 */
typealias JsImage = Any /* string | Uint8Array | ArrayBuffer | number[] | Image */
