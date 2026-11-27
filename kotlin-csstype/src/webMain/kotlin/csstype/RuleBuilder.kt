package csstype

import js.objects.unsafeJso
import web.cssom.*

external interface RuleBuilder<T : Any> :
    Rules

context(builder: RuleBuilder<T>)
inline fun <T : Any> `@container`(
    query: ContainerQuery,
    block: T.() -> Unit,
) {
    builder[Selector("@container $query")] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline fun <T : Any> `@container`(
    containerName: ContainerName,
    query: ContainerQuery,
    block: T.() -> Unit,
) {
    builder[Selector("@container $containerName $query")] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline fun <T : Any> `@font-face`(
    block: FontFace.() -> Unit,
) {
    builder[Selector("@font-face")] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline fun <T : Any> `@media`(
    query: MediaQuery,
    block: T.() -> Unit,
) {
    builder[Selector("@media $query")] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline fun <T : Any> `@view-transition`(
    block: ViewTransition.() -> Unit,
) {
    builder[Selector("@view-transition")] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline operator fun <T : Any> Selector.invoke(
    block: T.() -> Unit,
) {
    builder[this] = unsafeJso(block)
}

context(builder: RuleBuilder<T>)
inline operator fun <T : Any> ClassName.invoke(
    block: T.() -> Unit,
) {
    Selector(".$this")(block)
}

context(builder: RuleBuilder<T>)
inline operator fun <T : Any> String.invoke(
    block: T.() -> Unit,
) {
    Selector(this)(block)
}

context(builder: RuleBuilder<T>)
inline fun <T : Any> and(
    className: ClassName,
    block: T.() -> Unit,
) {
    Selector("&.$className")(block)
}
