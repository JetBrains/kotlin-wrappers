// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A collection of key-value pairs that is stored as a hash for easy
 * lookup but also provides an array for fast iteration.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html">Online Documentation</a>
 */
external class AssociativeArray {
    /**
     * Gets the number of items in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#length">Online Documentation</a>
     */
    var length: Int

    /**
     * Gets an unordered array of all values in the collection.
     * This is a live array that will automatically reflect the values in the collection,
     * it should not be modified directly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#values">Online Documentation</a>
     */
    var values: Array<out Any>

    /**
     * Determines if the provided key is in the array.
     * @param [key] The key to check.
     * @return `true` if the key is in the array, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#contains">Online Documentation</a>
     */
    fun contains(key: String): Boolean

    fun contains(key: Int): Boolean

    /**
     * Associates the provided key with the provided value.  If the key already
     * exists, it is overwritten with the new value.
     * @param [key] A unique identifier.
     * @param [value] The value to associate with the provided key.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#set">Online Documentation</a>
     */
    fun set(
        key: String,
        value: Any,
    )

    fun set(
        key: Int,
        value: Any,
    )

    /**
     * Retrieves the value associated with the provided key.
     * @param [key] The key whose value is to be retrieved.
     * @return The associated value, or undefined if the key does not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#get">Online Documentation</a>
     */
    fun get(key: String): Any

    fun get(key: Int): Any

    /**
     * Removes a key-value pair from the collection.
     * @param [key] The key to be removed.
     * @return True if it was removed, false if the key was not in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#remove">Online Documentation</a>
     */
    fun remove(key: String): Boolean

    fun remove(key: Int): Boolean

    /**
     * Clears the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AssociativeArray.html#removeAll">Online Documentation</a>
     */
    fun removeAll()
}
