// Automatically generated - do not modify!

@file:Suppress(
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
)

package web.cssom

external interface VariableRecord {
    @nativeGetter
    @Suppress("DEPRECATION")
    operator fun <T : Any> get(
        name: Variable<T>,
    ): T?

    @nativeSetter
    @Suppress("DEPRECATION")
    operator fun <T : Any> set(
        name: Variable<T>,
        value: T?,
    )
}
