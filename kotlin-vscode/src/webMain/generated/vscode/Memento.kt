// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * A memento represents a storage utility. It can store and retrieve
 * values.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Memento)
 */
external interface Memento {
    /**
     * Returns the stored keys.
     *
     * @returns The stored keys.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Memento.keys)
     */
    fun keys(): ReadonlyArray<JsString>

    /**
     * Return a value.
     *
     * @param key A string.
     * @returns The stored value or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Memento.get)
     */
    fun <T : JsAny?> get(key: String): T?

    /**
     * Return a value.
     *
     * @param key A string.
     * @param defaultValue A value that should be returned when there is no
     * value (`undefined`) with the given key.
     * @returns The stored value or the defaultValue.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Memento.get)
     */
    fun <T : JsAny?> get(
        key: String,
        defaultValue: T,
    ): T

    /**
     * Store a value. The value must be JSON-stringifyable.
     *
     * *Note* that using `undefined` as value removes the key from the underlying
     * storage.
     *
     * @param key A string.
     * @param value A value. MUST not contain cyclic references.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Memento.update)
     */
    fun update(
        key: String,
        value: JsAny?,
    ): PromiseLike<Void>
}
