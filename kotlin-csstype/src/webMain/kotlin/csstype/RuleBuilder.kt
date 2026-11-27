@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

import js.objects.unsafeJso
import web.cssom.*

interface RuleBuilder<T : Any> : Rules {
    inline fun `@container`(
        query: ContainerQuery,
        block: T.() -> Unit,
    ) {
        set(Selector("@container $query"), unsafeJso(block))
    }

    inline fun `@container`(
        containerName: ContainerName,
        query: ContainerQuery,
        block: T.() -> Unit,
    ) {
        set(Selector("@container $containerName $query"), unsafeJso(block))
    }

    inline fun `@font-face`(
        block: FontFace.() -> Unit,
    ) {
        set(Selector("@font-face"), unsafeJso(block))
    }

    inline fun `@media`(
        query: MediaQuery,
        block: T.() -> Unit,
    ) {
        set(Selector("@media $query"), unsafeJso(block))
    }

    inline fun `@view-transition`(
        block: ViewTransition.() -> Unit,
    ) {
        set(Selector("@view-transition"), unsafeJso(block))
    }

    inline operator fun Selector.invoke(
        block: T.() -> Unit,
    ) {
        set(this, unsafeJso(block))
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
