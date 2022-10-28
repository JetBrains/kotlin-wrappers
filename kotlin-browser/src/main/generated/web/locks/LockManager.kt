// Automatically generated - do not modify!

package web.locks

import kotlinx.js.Void
import kotlin.js.Promise

sealed external class LockManager {
    fun query(): Promise<LockManagerSnapshot>
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
