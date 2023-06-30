package electron.core

import node.buffer.Buffer


external interface SafeStorage : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/safe-storage
    /**
     * the decrypted string. Decrypts the encrypted buffer obtained  with
     * `safeStorage.encryptString` back into a string.
     *
     * This function will throw an error if decryption fails.
     */
    fun decryptString(encrypted: Buffer): String

    /**
     * An array of bytes representing the encrypted string.
     *
     * This function will throw an error if encryption fails.
     */
    fun encryptString(plainText: String): Buffer

    /**
     * Whether encryption is available.
     *
     * On Linux, returns true if the app has emitted the `ready` event and the secret
     * key is available. On MacOS, returns true if Keychain is available. On Windows,
     * returns true once the app has emitted the `ready` event.
     */
    fun isEncryptionAvailable(): Boolean
}
