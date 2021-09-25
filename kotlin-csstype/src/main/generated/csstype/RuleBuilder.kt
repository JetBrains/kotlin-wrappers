// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

interface RuleBuilder<T : Any> {
    inline operator fun String.invoke(
        block: T.() -> Unit,
    ) {
        this@RuleBuilder.asDynamic()[this] = block(js("({})"))
    }
}
