// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNativeError(`object`: Any?): Boolean /* object is Error */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Throwable /* JsError */)
    }

    return isNativeErrorRaw(`object`)
}