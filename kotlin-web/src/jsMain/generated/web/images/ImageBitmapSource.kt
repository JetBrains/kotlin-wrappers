// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.images

import web.blob.Blob

/**
 * Union of:
 * - `CanvasImageSource`
 * - `Blob`
 * - `ImageData`
 */
external interface ImageBitmapSource

inline fun Blob.asImageBitmapSource(): ImageBitmapSource =
    unsafeCast<ImageBitmapSource>()

inline fun ImageBitmapSource.asBlobOrNull(): Blob? =
    asDynamic() as? Blob    
