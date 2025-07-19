// Automatically generated - do not modify!

package web.locks

/**
 * The **`Lock`** interface of the Web Locks API provides the name and mode of a lock.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock)
 */
open external class Lock
private constructor() {
    /**
     * The **`mode`** read-only property of the Lock interface returns the access mode passed to LockManager.request() when the lock was requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode)
     */
    val mode: LockMode

    /**
     * The **`name`** read-only property of the Lock interface returns the _name_ passed to The name of a lock is passed by script when the lock is requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/name)
     */
    val name: String
}
