// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/** An RGBA Image in row-major order from top to bottom. */
external class Image : Resource {
    /**
     * Creates an Image from a resource ID. For internal use only.
     *
     * @ignore
     */
    constructor (rid: Double)

    /** Returns the RGBA data for this image, in row-major order from top to bottom.  */
    fun rgba(): js.promise.Promise<js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>>

    /** Returns the size of this image.  */
    fun size(): js.promise.Promise<ImageSize>

    companion object {
        /** Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height. */
        fun new(
            rgba: js.array.ReadonlyArray<Double>,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /** Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height. */
        fun new(
            rgba: js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /** Creates a new Image using RGBA data, in row-major order from top to bottom, and with specified width and height. */
        fun new(
            rgba: js.buffer.ArrayBuffer,
            width: Double,
            height: Double,
        ): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         * If the format is known, prefer [@link Image.fromPngBytes] or [@link Image.fromIcoBytes].
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         */
        fun fromBytes(bytes: js.array.ReadonlyArray<Double>): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         * If the format is known, prefer [@link Image.fromPngBytes] or [@link Image.fromIcoBytes].
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
         */
        fun fromBytes(bytes: js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>): js.promise.Promise<Image>

        /**
         * Creates a new image using the provided bytes by inferring the file format.
         * If the format is known, prefer [@link Image.fromPngBytes] or [@link Image.fromIcoBytes].
         *
         * Only `ico` and `png` are supported (based on activated feature flag).
         *
         * Note that you need the `image-ico` or `image-png` Cargo features to use this API.
         * To enable it, change your Cargo.toml file:
         * ```toml
         * [dependencies]
         * tauri = { version = "...", features = ["...", "image-png"] }
         * ```
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
         */
        fun fromPath(path: String): js.promise.Promise<Image>
    }
}
