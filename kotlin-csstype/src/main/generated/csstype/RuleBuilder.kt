// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

import kotlinx.js.jso

interface RuleBuilder<T : Any> {
    inline operator fun Selector.invoke(
        block: T.() -> Unit,
    ) {
        this@RuleBuilder.unsafeCast<Rules>()[this] = jso(block)
    }

    inline operator fun String.invoke(
        block: T.() -> Unit,
    ) {
        Selector(this)(block)
    }
}
