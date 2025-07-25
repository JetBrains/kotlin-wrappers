// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsName

/**
 * Represents a storage utility for secrets (or any information that is sensitive)
 * that will be stored encrypted. The implementation of the secret storage will
 * be different on each platform and the secrets will not be synced across
 * machines.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage)
 */
external interface SecretStorage {
    /**
     * Retrieve a secret that was stored with key. Returns undefined if there
     * is no password matching that key.
     * @param key The key the secret was stored under.
     * @returns The stored value or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.get)
     */
    @JsName("get")
    fun getAsync(key: String): PromiseLike<JsString?>

    /**
     * Store a secret under a given key.
     * @param key The key to store the secret under.
     * @param value The secret.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.store)
     */
    @JsName("store")
    fun storeAsync(
        key: String,
        value: String,
    ): PromiseLike<Void>

    /**
     * Remove a secret from storage.
     * @param key The key the secret was stored under.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.delete)
     */
    @JsName("delete")
    fun deleteAsync(key: String): PromiseLike<Void>

    /**
     * Fires when a secret is stored or deleted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.onDidChange)
     */
    var onDidChange: Event<SecretStorageChangeEvent>
}
