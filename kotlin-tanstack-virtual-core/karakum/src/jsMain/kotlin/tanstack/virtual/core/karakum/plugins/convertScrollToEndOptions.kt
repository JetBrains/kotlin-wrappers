package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isTypeAliasDeclaration

// `ScrollToEndOptions = Pick<ScrollToOptions, 'behavior'>`
val convertScrollToEndOptions = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "ScrollToEndOptions")

        // language=kotlin
        """
        @kotlinx.js.JsPlainObject
        external interface ScrollToEndOptions {
            var behavior: web.scroll.ScrollBehavior?
        }
        """.trimIndent()
    }
}
