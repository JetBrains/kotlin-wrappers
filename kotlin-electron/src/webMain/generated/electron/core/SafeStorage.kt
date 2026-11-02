// Automatically generated - do not modify!

package electron.core

import node.buffer.Buffer

external interface SafeStorage {
    /**
     * Resolve with an object containing the following:
     *
     * * `shouldReEncrypt` boolean - whether data that has just been returned from the
     * decrypt operation should be re-encrypted, as the key has been rotated or a new
     * key is available that provides a different security level. If `true`, you should
     * call `decryptStringAsync` again to receive the new decrypted string.
     * * `result` string - the decrypted string.
     */
    fun decryptStringAsync(encrypted: Buffer<*>): js.promise.Promise<DecryptStringAsyncReturnValue>

    /**
     * An array of bytes representing the encrypted string.
     */
    fun encryptStringAsync(plainText: String): js.promise.Promise<Buffer<*>>

    /**
     * User friendly name of the password manager selected on Linux.
     *
     * This function will return one of the following values:
     *
     * * `basic_text` - When the desktop environment is not recognised or if the
     * following command line flag is provided `--password-store="basic"`.
     * * `gnome_libsecret` - When the desktop environment is `X-Cinnamon`, `Deepin`,
     * `GNOME`, `Pantheon`, `XFCE`, `UKUI`, `unity` or if the following command line
     * flag is provided `--password-store="gnome-libsecret"`.
     * * `kwallet` - When the desktop session is `kde4` or if the following command
     * line flag is provided `--password-store="kwallet"`.
     * * `kwallet5` - When the desktop session is `kde5` or if the following command
     * line flag is provided `--password-store="kwallet5"`.
     * * `kwallet6` - When the desktop session is `kde6` or if the following command
     * line flag is provided `--password-store="kwallet6"`.
     * * `unknown` - When the function is called before app has emitted the `ready`
     * event.
     *
     * @platform linux
     */
    fun getSelectedStorageBackend(): (SafeStorageGetSelectedStorageBackendResult)

    /**
     * Resolves with whether encryption is available for asynchronous safeStorage
     * operations.
     *
     * The asynchronous encryptor is initialized lazily the first time this method,
     * `encryptStringAsync`, or `decryptStringAsync` is called after the app is ready.
     * The returned promise resolves once initialization completes.
     */
    fun isAsyncEncryptionAvailable(): js.promise.Promise<Boolean>

    /**
     * This function on Linux will force the module to use an in memory password for
     * creating symmetric key that is used for encrypt/decrypt functions when a valid
     * OS password manager cannot be determined for the current active desktop
     * environment. This function is a no-op on Windows and MacOS.
     */
    fun setUsePlainTextEncryption(usePlainText: Boolean)
}
