// Generated by Karakum - do not modify it manually!

package node.http

sealed external interface HttpStatusCodes {
    operator fun get(key: Number): String?

    operator fun set(
        key: Number,
        value: String?,
    )

    operator fun get(key: String): String?

    operator fun set(
        key: String,
        value: String?,
    )
}
