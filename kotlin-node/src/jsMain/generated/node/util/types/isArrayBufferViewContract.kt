// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isArrayBufferView(`object`: Any?): Boolean /* object is NodeJS.ArrayBufferView */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is js.buffer.ArrayBufferView)
    }

    return isArrayBufferViewRaw(`object`)
}