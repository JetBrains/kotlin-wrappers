package karakum.actions

import org.gradle.kotlin.dsl.support.uppercaseFirstChar

private val FIELDS = setOf(
    "findBy",
    "owner",
    "issue",
    "pull_request",
    "sender",
    "installation",
    "comment",
    "repo",
)

internal fun String.addInnerInterfaceFix(): String {
    return FIELDS.fold(this) { acc, name ->
        val className = name
            .uppercaseFirstChar()
            .replace("_r", "R")

        acc.replace(
            "$name?: {",
            """
                var $name: $className?
                
                @JsPlainObject
                interface $className {
                """.trimIndent(),
        )
            .replace(
                "$name: {",
                """
                var $name: $className
                
                @JsPlainObject
                interface $className {
                """.trimIndent(),
            )
            .replace(
                "get $name(): {",
                """
                val $name: $className
                
                @JsPlainObject
                interface $className {
                """.trimIndent(),
            )
    }
}
