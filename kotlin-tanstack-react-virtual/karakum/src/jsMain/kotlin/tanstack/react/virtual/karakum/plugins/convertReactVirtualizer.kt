package tanstack.react.virtual.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isTypeAliasDeclaration

// `ReactVirtualizer = Virtualizer & { containerRef }`
val convertReactVirtualizer = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "ReactVirtualizer")

        // language=kotlin
        """
        typealias ReactVirtualizer<TScrollElement, TItemElement> = Virtualizer<TScrollElement, TItemElement>

        /**
         * Ref callback for the inner size container element. Only meaningful when
         * `directDomUpdates: true` - the virtualizer writes the container's
         * main-axis size (`height` or `width`) directly to skip React re-renders.
         */
        inline val Virtualizer<*, *>.containerRef: (node: web.html.HTMLElement?) -> Unit
            get() = asDynamic().containerRef
        """.trimIndent()
    }
}
