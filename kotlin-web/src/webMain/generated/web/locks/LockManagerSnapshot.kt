// Automatically generated - do not modify!

package web.locks

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query#return_value)
 */
@JsPlainObject
external interface LockManagerSnapshot {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query#held)
     */
    var held: ReadonlyArray<LockInfo>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LockManager/query#pending)
     */
    var pending: ReadonlyArray<LockInfo>?
}
