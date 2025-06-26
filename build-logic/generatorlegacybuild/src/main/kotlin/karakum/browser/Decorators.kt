package karakum.browser

import karakum.common.CommonUnionConverter.objectUnionBody
import karakum.common.unionConstant
import karakum.common.unionName
import karakum.common.withDefaultLineBreaks
import java.io.File

private val DECORATOR_CONTEXT_KIND = "DecoratorContextKind"

private val KIND_REGEX = Regex("""kind: "(\w+)";""")

private val EXCLUDED = setOf(
    "ClassAccessorDecoratorResult",
    "ClassAccessorDecoratorTarget",
)

private val TYPE_PARAMETER_MAP = mapOf(
    "This = unknown" to "This: JsAny",
    "Value = unknown" to "Value: JsAny",
    "Value extends (this: This, ...args: any) => any = (this: This, ...args: any) => any" to "Value: JsFunction<*, *> /* generic function */",
    "Class extends abstract new (...args: any) => any = abstract new (...args: any) => any" to "Class: JsClass<*>",
)

internal fun decoratorsDeclarations(
    definitionsDir: File,
): Sequence<ConversionResult> {
    val rawContent = decoratorsContent(definitionsDir)

    val kinds = KIND_REGEX
        .findAll(rawContent)
        .map { it.groupValues[1] }
        .toList()

    val content = KIND_REGEX.replace(rawContent) {
        "kind: $DECORATOR_CONTEXT_KIND." + unionName(it.groupValues[1])
    }

    return content.splitToSequence("\n/**\n")
        .drop(1)
        .map { "/**\n$it".trim() }
        .filter { "\ninterface " in it }
        .mapNotNull { decoratorInterface(it) }
        .plus(
            ConversionResult(
                name = "DecoratorMetadata",
                body = "typealias DecoratorMetadata = ReadonlyRecord<PropertyKey, *>",
                pkg = "js.decorators",
            )
        )
        .plus(
            ConversionResult(
                name = DECORATOR_CONTEXT_KIND,
                body = objectUnionBody(DECORATOR_CONTEXT_KIND, kinds.map(::unionConstant)),
                pkg = "js.decorators",
            )
        )
}

private fun decoratorInterface(
    source: String,
): ConversionResult? {
    val (comment, bodySource) = source.split("\ninterface ")
    val name = bodySource
        .substringBefore(" ")
        .substringBefore("<")

    if (name in EXCLUDED)
        return null

    val typeParameters = bodySource
        .substringAfter("<\n    ")
        .substringBefore(",\n>")
        .splitToSequence(",\n    ")
        .map { TYPE_PARAMETER_MAP.getValue(it) }
        .joinToString(", ", "<", ">")

    val members = bodySource
        .substringAfter("{\n")
        .substringBefore("\n}")
        .replace(
            "    readonly access: {\n",
            "    val access: Access<This, Value>" +
                    "\n\n" +
                    "interface Access$typeParameters {",
        )
        .replace("    readonly ", "    val ")
        .replace(": boolean;\n", ": Boolean\n")
        .replace(": string | symbol;\n", ": PropertyKey\n")
        .replace(": string | undefined;\n", ": String?\n")
        .replace(Regex("""(\n\s+)(\w+\()"""), "$1fun $2")
        .replace("): void;", ")")
        .replace(": (this: This) => void", ": (/* this: This */) -> Unit")
        .replace(": (this: Class) => void", ": (/* this: Class */) -> Unit")
        .replace("(object: ", "(o: ")

    val body = comment +
            "\nsealed external interface $name$typeParameters {\n" +
            members +
            "\n}"

    return ConversionResult(
        name = name,
        body = body,
        pkg = "js.decorators",
    )
}

private fun decoratorsContent(
    definitionsDir: File,
): String =
    definitionsDir
        .resolve("lib.decorators.d.ts")
        .readText()
        .withDefaultLineBreaks()
        .substringAfter("""/// <reference no-default-lib="true"/>""")
