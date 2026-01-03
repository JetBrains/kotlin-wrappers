package karakum.virtual

import karakum.common.ConversionResult
import java.io.File

private val EXCLUDED = setOf(
    "memo",
    "NoInfer",
    "PartialKeys",

    // browser type used instead
    "ScrollBehavior",
)

internal fun convertDefinitions(
    definitionFile: File,
): Sequence<ConversionResult> =
    definitionFile.readText()
        .substringAfter(";")
        .replace("export declare ", "declare ")
        .replace("export interface ", "declare interface ")
        .replace("\ninterface ", "\ndeclare interface ")
        .replace("\ntype ", "\ndeclare type ")
        .replace("{ adjustments, behavior, }: $SCROLL_OPTIONS_BODY", "options: $SCROLL_OPTIONS")
        .replace(
            SCROLL_OPTIONS_BODY
                .replace("\n", "\n    ")
                .replace(" | undefined", ""),
            SCROLL_OPTIONS,
        )
        .replace(
            ITEM_RANGE_BODY
                .replace("\n", "\n    "),
            ITEM_RANGE,
        )
        .replace("align?: ScrollAlignment)", "align: ScrollAlignment?)")
        .replace(
            """readonly [number, "start" | "center" | "end"]""".trimIndent(),
            "Tuple2<Double, ScrollAlignment>"
        )
        .replace("{ align, behavior }?: ScrollToOffsetOptions", "options: ScrollToOffsetOptions?")
        .replace("{ align: initialAlign, behavior }?: ScrollToIndexOptions", "options: ScrollToIndexOptions?")
        .replace("{ behavior }?: ScrollToOffsetOptions", "options: ScrollToOffsetOptions?")
        .splitToSequence("\ndeclare ")
        .drop(1)
        .map { it.removeSuffix(";") }
        .map { convertDefinition(it) }
        .plus(convertInterface("$SCROLL_OPTIONS $SCROLL_OPTIONS_BODY"))
        .plus(convertInterface("$ITEM_RANGE $ITEM_RANGE_BODY"))
        .plus(UPDATABLE)
        .filter { it.name !in EXCLUDED }

private fun convertDefinition(
    source: String,
): ConversionResult {
    val type = source.substringBefore(" ")
    val body = source.substringAfter(" ")

    return when (type) {
        "const" -> convertConst(body)
        "function" -> convertFunction(body)
        "type" -> convertType(body)
        "interface" -> convertInterface(body)
        "class" -> convertClass(body)
        else -> TODO()
    }
}

private fun convertConst(
    source: String,
): ConversionResult {
    val name = source.substringBefore(":")
    val type = if (": {" in source) "object" else "val"

    var body = source.replace(": {", " {")
        .replace("\n    ", "\n    val ")
        .replace("Virtualizer<Window, any>", "Virtualizer<Window, *>")
        .replace("Virtualizer<T, any>", "Virtualizer<*, *>")
        .replace("Virtualizer<any, TItemElement>", "Virtualizer<*, Element>")
        .replace(": TItemElement", ": Element")
        .replace("number[]", "ReadonlyArray<Int>")
        .replace("<any>", "<*>")
        .replace("number", "Int")
        .replace(": boolean", ": Boolean")
        .replace(": unknown", ": Any")
        .replace(" => void", " -> Unit")
        .replace(" => ", " -> ")
        .replace(" | undefined", "?")

    if (">(" in body)
        body = body.substringBefore("<") + body.substringAfter(">")

    val content = "external $type $body"
    return ConversionResult(name, content)
}

private fun convertFunction(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore(" ")
        .substringBefore(":")
        .substringBefore("<")
        .substringBefore("(")

    val body = source.removePrefix(name)
        .replaceFirst("(", " $name(")
        .replace(" extends ", " : ")
        .replace(" => void", " -> Unit")
        .replace(" => ", " -> ")
        .replace(": string", ": String")
        .replace(": number", ": Int")
        .replace(": boolean", ": Boolean")
        .replace("?: any", ": Any = definedExternally")
        .replace(": void", "")

    return ConversionResult(name, "external fun " + body)
}

private fun convertType(
    source: String,
): ConversionResult =
    if (" = {\n" in source) {
        convertInterface(source)
    } else {
        convertTypealias(source)
    }

private fun convertTypealias(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore(" ")
        .substringBefore(":")
        .substringBefore("<")
        .substringBefore("(")

    var declaration = source.substringBefore(" = ")
        .replace(" extends ", " : ")

    var body = source.substringAfter(" = ")
        .replace(" => ", " -> ")

    if (body.startsWith("'"))
        return convertUnion(name, body)

    if (body == "number | string | bigint")
        body = "String"

    if (" | " in body) {
        declaration = declaration.replace(": object>", "/* : Any */>")

        return ConversionResult(name, "external interface $declaration /* $body */")
    }

    body = body
        .replace("(...args: any) -> any", "Function<Unit>")
        .replace("string[]", "ReadonlyArray<String>")
        .replace("string", "String")
        .replace("boolean", "Boolean")
        .replace("number", "Int")
        .replace(": any", ": Any")
        .replace(" -> any", " -> Any")
        .replace(" -> unknown", " -> Any")
        .replace("<any>", "<*>")
        .replace(" -> void", " -> Unit")

    return ConversionResult(name, "typealias $declaration = $body")
}

private fun convertClass(
    source: String,
): ConversionResult {
    val content = source
        .replace("\n" + " ".repeat(4), "\n")
        .replace(
            """
            calculateRange: {
                (): {
                    startIndex: number;
                    endIndex: number;
                } | null;
                updateDeps(newDeps: [VirtualItem[], number, number, number]): void;
            };
            """.trimIndent(),
            """
            calculateRange: Updatable<ItemRange?, Tuple4<ReadonlyArray<VirtualItem>, Int, Int, Int>>;
            """.trimIndent(),
        )
        .replace(
            """
            getVirtualIndexes: {
                (): number[];
                updateDeps(newDeps: [(range: Range) => number[], number, number, number | null, number | null]): void;
            };
            """.trimIndent(),
            """
            getVirtualIndexes: Updatable<ReadonlyArray<Int>, Tuple5<(range: Range) -> ReadonlyArray<Int>, Int, Int, Int?, Int?>>;
            """.trimIndent(),
        )
        .replace(
            """
            getVirtualItems: {
                (): VirtualItem[];
                updateDeps(newDeps: [number[], VirtualItem[]]): void;
            };
            """.trimIndent(),
            """
            getVirtualItems: Updatable<ReadonlyArray<VirtualItem>, Tuple2<ReadonlyArray<Int>, ReadonlyArray<VirtualItem>>>;
            """.trimIndent(),
        )

    val result = convertInterface(content)
    val newBody = result.body.replace("external interface ", "external class ")
    return result.copy(body = newBody)
}

private fun convertInterface(
    source: String,
): ConversionResult {
    val declaration = source.substringBefore(" {")
        .replace(" extends ", " : ")
        .replace(" : Element | Window", " : EventTarget /* Element | Window */")
        .replace(" = unknown", "")
    val name = declaration.substringBefore("<")
    var body = "external interface $declaration {\n" +
            convertMembers(source.substringAfter(" {")) +
            "\n}\n"
    if (name != "Virtualizer") {
        body = "@JsPlainObject\n" + body.replace("var ", "val ")
    }
    return ConversionResult(name, body)
}

private fun convertMembers(
    source: String,
): String =
    source
        .removeSuffix("\n")
        .substringBeforeLast("\n}")
        .trimIndent()
        .splitToSequence("\n")
        .filter { !it.startsWith("private ") }
        .filter { !it.startsWith("_") }
        .map { it.removeSuffix(";") }
        .map { convertMember(it) }
        .joinToString("\n")

private fun convertMember(
    source: String,
): String {
    if (source.startsWith("("))
        return "    // TODO: support invoke\n    /* $source */"

    if (source.startsWith("constructor("))
        return source

    val optional = source.substringBefore(": ")
        .endsWith("?")

    val name = source.substringBefore(": ")
        .removeSuffix("?")

    var type = source.substringAfter(": ")
        .let { kotlinType(it, name) }

    if (optional) {
        type = if (type.startsWith("(")) {
            "($type)?"
        } else "$type?"
    }

    return "var $name: $type"
}
