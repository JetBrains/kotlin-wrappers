// Automatically generated - do not modify!

package web.locks

import js.core.ReadonlyArray

sealed external interface LockManagerSnapshot {
    var held: ReadonlyArray<LockInfo>?
    var pending: ReadonlyArray<LockInfo>?
}
