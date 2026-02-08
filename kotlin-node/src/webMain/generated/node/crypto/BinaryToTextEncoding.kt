// Automatically generated - do not modify!

package node.crypto

// https://nodejs.org/api/buffer.html#buffer_buffers_and_character_encodings
sealed external interface BinaryToTextEncoding {
    companion object
}

inline val BinaryToTextEncoding.Companion.base64: BinaryToTextEncoding
    get() = js.reflect.unsafeCast("base64")

inline val BinaryToTextEncoding.Companion.base64url: BinaryToTextEncoding
    get() = js.reflect.unsafeCast("base64url")

inline val BinaryToTextEncoding.Companion.hex: BinaryToTextEncoding
    get() = js.reflect.unsafeCast("hex")

inline val BinaryToTextEncoding.Companion.binary: BinaryToTextEncoding
    get() = js.reflect.unsafeCast("binary")
