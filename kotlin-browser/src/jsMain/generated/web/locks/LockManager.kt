// Automatically generated - do not modify!

package web.locks

import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager)
 */
sealed external class LockManager {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query) */
    fun query(): Promise<LockManagerSnapshot>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/request) */
    fun request(
        name: String,
        callback: LockGrantedCallback,
    ): Promise<Void>

    fun request(
        name: String,
        options: LockOptions,
        callback: LockGrantedCallback,
    ): Promise<Void>
}
