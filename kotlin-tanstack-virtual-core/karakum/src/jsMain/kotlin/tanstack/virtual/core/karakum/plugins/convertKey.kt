package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isTypeAliasDeclaration

// `Key = number | string | bigint`
val convertKey = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "Key")

        // language=kotlin
        """
        @SubclassOptInRequired(js.internal.InternalApi::class)
        external interface Key

        inline fun Key(
            value: String,
        ): Key =
            js.reflect.unsafeCast(value)

        inline fun Key(
            value: Int,
        ): Key =
            js.reflect.unsafeCast(value)

        inline fun Key(
            value: js.numbers.BigInt,
        ): Key =
            js.reflect.unsafeCast(value)
        """.trimIndent()
    }
}
