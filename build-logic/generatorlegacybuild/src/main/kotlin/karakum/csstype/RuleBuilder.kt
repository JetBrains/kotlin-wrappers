package karakum.csstype

import karakum.common.ConversionResult

internal const val RULE_BUILDER = "RuleBuilder"

// language=Kotlin
private val BODY = """
import js.objects.unsafeJso
import web.cssom.ContainerName
import web.cssom.ContainerQuery
import web.cssom.MediaQuery

interface $RULE_BUILDER<T : Any> : $RULES {
    inline fun media(
        query: $MEDIA_QUERY,
        block: T.() -> Unit,
    ) {
        set($SELECTOR("@media ${'$'}query"), jso(block))
    }

    inline fun container(
        query: $CONTAINER_QUERY,
        block: T.() -> Unit,
    ) {
        set($SELECTOR("@container ${'$'}query"), jso(block))
    }

    inline fun container(
        containerName: $CONTAINER_NAME,
        query: $CONTAINER_QUERY,
        block: T.() -> Unit,
    ) {
        set($SELECTOR("@container ${'$'}containerName ${'$'}query"), jso(block))
    }

    inline fun fontFace(
        block: FontFace.() -> Unit,
    ) {
        set($SELECTOR("@font-face"), jso(block))
    }

    inline operator fun $SELECTOR.invoke(
        block: T.() -> Unit,
    ) {
        set(this, jso(block))
    }

    inline operator fun $CLASS_NAME.invoke(
        block: T.() -> Unit,
    ) {
        $SELECTOR(".${'$'}this")(block)
    }

    inline operator fun String.invoke(
        block: T.() -> Unit,
    ) {
        $SELECTOR(this)(block)
    }

    inline fun and(
        className: ClassName,
        block: T.() -> Unit,
    ) {
        $SELECTOR("&.${'$'}className")(block)
    }
}
""".trimIndent()

internal fun RuleBuilder(): ConversionResult =
    ConversionResult(RULE_BUILDER, BODY)
