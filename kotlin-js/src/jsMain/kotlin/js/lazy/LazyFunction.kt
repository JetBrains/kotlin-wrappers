@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.lazy

import js.lazy.internal.invokeLazyFunction

sealed external interface LazyFunction<out R> {
    suspend inline operator fun invoke(): R =
        invokeLazyFunction(this)
}

fun <R> LazyFunction(
    value: LazyFunctionSource<R>,
): LazyFunction<R> =
    value.unsafeCast<LazyFunction<R>>()
