// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface DecryptStringAsyncReturnValue {
    /**
     * whether data that has just been returned from the decrypt operation should be
     * re-encrypted, as the key has been rotated or a new  key is available that
     * provides a different security level. If `true`, you should call
     * `decryptStringAsync` again to receive the new decrypted string.
     */
    var shouldReEncrypt: Boolean

    /**
     * the decrypted string.
     */
    var result: String
}
