// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsString

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
     * Retrieve the keys of all the secrets stored by this extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.keys)
     */
    fun keys(): PromiseLike<ReadonlyArray<JsString>>

    /**
     * Retrieve a secret that was stored with key. Returns undefined if there
     * is no password matching that key.
     * @param key The key the secret was stored under.
     * @returns The stored value or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.get)
     */
    fun get(key: String): PromiseLike<JsString?>

    /**
     * Store a secret under a given key.
     * @param key The key to store the secret under.
     * @param value The secret.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.store)
     */
    fun store(
        key: String,
        value: String,
    ): PromiseLike<Void>

    /**
     * Remove a secret from storage.
     * @param key The key the secret was stored under.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.delete)
     */
    fun delete(key: String): PromiseLike<Void>

    /**
     * Fires when a secret is stored or deleted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SecretStorage.onDidChange)
     */
    val onDidChange: Event<SecretStorageChangeEvent>
}
