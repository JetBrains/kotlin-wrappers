// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.promise.PromiseLike

/**
 * Represents a storage utility for secrets (or any information that is sensitive)
 * that will be stored encrypted. The implementation of the secret storage will
 * be different on each platform and the secrets will not be synced across
 * machines.
 */
external interface SecretStorage {
    /**
     * Retrieve a secret that was stored with key. Returns undefined if there
     * is no password matching that key.
     * @param key The key the secret was stored under.
     * @returns The stored value or `undefined`.
     */
    fun get(key: String): PromiseLike<String?>

    /**
     * Store a secret under a given key.
     * @param key The key to store the secret under.
     * @param value The secret.
     */
    fun store(
        key: String,
        value: String,
    ): PromiseLike<Void>

    /**
     * Remove a secret from storage.
     * @param key The key the secret was stored under.
     */
    fun delete(key: String): PromiseLike<Void>

    /**
     * Fires when a secret is stored or deleted.
     */
    var onDidChange: Event<SecretStorageChangeEvent>
}
