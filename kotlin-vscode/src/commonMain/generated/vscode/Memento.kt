// Automatically generated - do not modify!

package vscode

/**
 * A memento represents a storage utility. It can store and retrieve
 * values.
 */
external interface Memento {
    /**
     * Returns the stored keys.
     *
     * @returns The stored keys.
     */
//  keys(): readonly string[]

    /**
     * Return a value.
     *
     * @param key A string.
     * @returns The stored value or `undefined`.
     */
//  get<T>(key: string): T | undefined

    /**
     * Return a value.
     *
     * @param key A string.
     * @param defaultValue A value that should be returned when there is no
     * value (`undefined`) with the given key.
     * @returns The stored value or the defaultValue.
     */
//  get<T>(key: string, defaultValue: T): T

    /**
     * Store a value. The value must be JSON-stringifyable.
     *
     * *Note* that using `undefined` as value removes the key from the underlying
     * storage.
     *
     * @param key A string.
     * @param value A value. MUST not contain cyclic references.
     */
//  update(key: string, value: any): Thenable<void>
}
