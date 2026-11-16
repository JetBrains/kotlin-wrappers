// Automatically generated - do not modify!

package web.origin

open external class Origin :
    OriginSource {
    open val opaque: Boolean
    open fun isSameOrigin(other: Origin): Boolean
    open fun isSameSite(other: Origin): Boolean

    companion object {
        fun from(value: OriginSource): Origin
        fun from(value: String): Origin
    }
}
