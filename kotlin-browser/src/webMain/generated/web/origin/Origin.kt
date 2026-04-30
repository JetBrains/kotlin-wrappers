// Automatically generated - do not modify!

package web.origin

import kotlin.js.JsAny

open external class Origin {
    val opaque: Boolean
    fun isSameOrigin(other: Origin): Boolean
    fun isSameSite(other: Origin): Boolean

    companion object {
        fun from(value: JsAny?): Origin
    }
}
