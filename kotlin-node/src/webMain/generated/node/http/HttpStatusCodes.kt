// Automatically generated - do not modify!

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
