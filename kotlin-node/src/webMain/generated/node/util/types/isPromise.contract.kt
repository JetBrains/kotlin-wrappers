// Automatically generated - do not modify!

package node.util.types

import kotlin.contracts.contract

@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPromise(value: Any?): Boolean /* object is Promise<unknown> */ {
    contract {
        returns(true) implies (value is js.promise.Promise<Any?>)
    }

    return isPromiseRaw(value)
}
