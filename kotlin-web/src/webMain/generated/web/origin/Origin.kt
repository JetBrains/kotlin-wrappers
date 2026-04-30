// Automatically generated - do not modify!

package web.origin

open external class Origin :
    OriginSource {
    val opaque: Boolean
    fun isSameOrigin(other: Origin): Boolean
    fun isSameSite(other: Origin): Boolean

    companion object {
        fun from(value: OriginSource): Origin
        fun from(value: String): Origin
    }
}
