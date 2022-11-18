// Automatically generated - do not modify!

package web.http

external class Headers(
    init: HeadersInit = definedExternally,
) {
    fun append(
        name: String,
        value: String,
    )

    fun delete(name: String)
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(
        name: String,
        value: String,
    )

    fun forEach(action: (item: String) -> Unit)
}
