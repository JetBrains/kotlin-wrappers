// Automatically generated - do not modify!

package web.messaging

import js.buffer.ArrayBuffer

/**
 * Union of:
 * - `OffscreenCanvas`
 * - `ImageBitmap`
 * - `MessagePort`
 * - `ReadableStream`
 * - `WritableStream`
 * - `TransformStream`
 * - `VideoFrame`
 * - `ArrayBuffer`
 */
external interface Transferable

inline fun ArrayBuffer.asTransferable(): Transferable =
    unsafeCast<Transferable>()

inline fun Transferable.asArrayBufferOrNull(): ArrayBuffer? =
    asDynamic() as? ArrayBuffer    
