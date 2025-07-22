// Automatically generated - do not modify!

package vscode

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
//  get(key: string): Thenable<string | undefined>;

    /**
     * Store a secret under a given key.
     * @param key The key to store the secret under.
     * @param value The secret.
     */
//  store(key: string, value: string): Thenable<void>;

    /**
     * Remove a secret from storage.
     * @param key The key the secret was stored under.
     */
//  delete(key: string): Thenable<void>;

    /**
     * Fires when a secret is stored or deleted.
     */
//  onDidChange: Event<SecretStorageChangeEvent>;
}
