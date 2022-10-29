// Automatically generated - do not modify!

package web.storage

sealed external class Storage {
    /** Returns the number of key/value pairs. */
    val length: Int

    /**
     * Removes all key/value pairs, if there are any.
     *
     * Dispatches a storage event on Window objects holding an equivalent Storage object.
     */
    fun clear()

    /** Returns the current value associated with the given key, or null if the given key does not exist. */
    fun getItem(key: String): String?

    /** Returns the name of the nth key, or null if n is greater than or equal to the number of key/value pairs. */
    fun key(index: Number): String?

    /**
     * Removes the key/value pair with the given key, if a key/value pair with the given key exists.
     *
     * Dispatches a storage event on Window objects holding an equivalent Storage object.
     */
    fun removeItem(key: String)

    /**
     * Sets the value of the pair identified by key to value, creating a new key/value pair if none existed for key previously.
     *
     * Throws a "QuotaExceededError" DOMException exception if the new value couldn't be set. (Setting could fail if, e.g., the user has disabled storage for the site, or if the quota has been exceeded.)
     *
     * Dispatches a storage event on Window objects holding an equivalent Storage object.
     */
    fun setItem(
        key: String,
        value: String,
    )
    // [name: string]: any
}
