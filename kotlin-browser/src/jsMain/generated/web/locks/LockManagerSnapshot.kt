// Automatically generated - do not modify!

package web.locks

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface LockManagerSnapshot {
    var held: ReadonlyArray<LockInfo>?
    var pending: ReadonlyArray<LockInfo>?
}
