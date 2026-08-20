package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isTypeAliasDeclaration

// `FollowOnAppend = boolean | ScrollBehavior`
val convertFollowOnAppend = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "FollowOnAppend")

        // language=kotlin
        """
        sealed external interface FollowOnAppend {
            companion object
        }

        inline val FollowOnAppend.Companion.`false`: FollowOnAppend
            get() = js.reflect.unsafeCast(false)

        inline val FollowOnAppend.Companion.`true`: FollowOnAppend
            get() = js.reflect.unsafeCast(true)

        inline val FollowOnAppend.Companion.auto: FollowOnAppend
            get() = js.reflect.unsafeCast("auto")

        inline val FollowOnAppend.Companion.smooth: FollowOnAppend
            get() = js.reflect.unsafeCast("smooth")

        inline val FollowOnAppend.Companion.instant: FollowOnAppend
            get() = js.reflect.unsafeCast("instant")
        """.trimIndent()
    }
}
