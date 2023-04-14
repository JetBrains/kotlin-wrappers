// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

import js.core.jso
import web.cssom.MediaQuery

interface RuleBuilder<T : Any> : Rules {
    inline fun media(
        query: MediaQuery,
        block: T.() -> Unit,
    ) {
        set(Selector("@media $query"), jso(block))
    }

    inline fun media(
        query: String,
        block: T.() -> Unit,
    ) {
        set(Selector("@media $query"), jso(block))
    }

    inline fun fontFace(
        block: FontFace.() -> Unit,
    ) {
        set(Selector("@font-face"), jso(block))
    }

    inline operator fun Selector.invoke(
        block: T.() -> Unit,
    ) {
        set(this, jso(block))
    }

    inline operator fun ClassName.invoke(
        block: T.() -> Unit,
    ) {
        Selector(".$this")(block)
    }

    inline operator fun String.invoke(
        block: T.() -> Unit,
    ) {
        Selector(this)(block)
    }

    inline fun and(
        className: ClassName,
        block: T.() -> Unit,
    ) {
        Selector("&.$className")(block)
    }
}
