// Automatically generated - do not modify!

package web.locks

/**
 * The **`Lock`** interface of the Web Locks API provides the name and mode of a lock. This may be a newly requested lock that is received in the callback to LockManager.request(), or a record of an active or queued lock returned by LockManager.query().
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock)
 */
open external class Lock
private constructor() {
    /**
     * The **`mode`** read-only property of the Lock interface returns the access mode passed to LockManager.request() when the lock was requested. The mode is either "exclusive" (the default) or "shared".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode)
     */
    val mode: LockMode

    /**
     * The **`name`** read-only property of the Lock interface returns the name passed to LockManager.request selected when the lock was requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/name)
     */
    val name: String
}
