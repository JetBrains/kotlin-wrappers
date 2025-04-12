package karakum.table

import karakum.common.ConversionResult

private val EXCLUDED_ITEMS = setOf(
    "IfDefined",
    "memo",
    "Overwrite",

    "NoInfer",
    "NoInfer$1",

    "PartialKeys",
    "RequiredKeys",
    "UnionToIntersection",

    "Key",
    "Union",
    "Join",

    "isFunction",
    "makeStateUpdater",

    "AllowedIndexes",
    "ComputeRange",

    "Index40",
    "Index100",
    "IsAny",
    "IsKnown",
    "IsTuple",

    "DeepKeys",
    "DeepKeysPrefix",
    "DeepValue",

    "createColumnHelper",
    "ColumnHelper",

    "isNumberArray",

    "getMemoOptions",
    "_getVisibleLeafColumns",
)

internal fun convertDefinitions(
    source: String,
): Sequence<ConversionResult> =
    source
        .replace("\nexport declare ", "\nexport ")
        .replace("\ninterface ", "\nexport interface ")
        .replace("\ntype ", "\nexport type ")
        .splitToSequence("\nexport ")
        .drop(1)
        .map { it.removeSuffix(";") }
        .filter { " = keyof typeof " !in it }
        .plusColumnOrderPosition()
        .map { convertDefinition(it) }
        .filter { it.name !in EXCLUDED_ITEMS }

private fun Sequence<String>.plusColumnOrderPosition(): Sequence<String> =
    flatMap {
        if (it.startsWith("type ColumnPinningPosition = ")) {
            sequenceOf(
                it,
                it.replaceFirst("type ColumnPinningPosition = ", "type ColumnOrderPosition = ") + " | 'center'"
            )
        } else {
            sequenceOf(it)
        }
    }

private fun convertDefinition(
    value: String,
): ConversionResult {
    val source = value
        .replace(
            "interface TableMeta<TData extends RowData> {\n}",
            "type TableMeta = Record<PropertyKey, Any>"
        )

    val type = source.substringBefore(" ")
    val body = source.substringAfter(" ")

    return when (type) {
        "const" -> convertConst(body)
        "function" -> convertFunction(body)
        "type" -> convertType(body)
        "interface" -> convertInterface(body)
        else -> TODO("Unable to convert type '$type' with body:\n```\n$body\n```")
    }
}

private fun convertConst(
    source: String,
): ConversionResult {
    val name = source.substringBefore(":")
    if (name == "createRow") {
        val newSource = source
            .replaceFirst(": ", "")
            .replace(" => ", ": ")

        return convertFunction(newSource)
    }

    val type = if (": {" in source) "object" else "val"

    val body = source.replace(": {", " {")
        .replace("\n    ", "\n    val ")
        .replace("<any>", "<*>")
        .replace("number", "Int")
        .replace("TableFeature", "TableFeature<*>")

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

    var body = source.removePrefix(name)
        .replaceFirst("(", " $name(")
        .replace(" extends unknown", "")
        .replace(" extends ", " : ")
        .replace("?: {\n    initialSync: boolean;\n}", ": Any = definedExternally /* { initialSync: boolean } */")
        .replace(
            "headerFamily?: 'center' | 'left' | 'right'",
            "headerFamily: String = definedExternally /* 'center' | 'left' | 'right' */"
        )
        .replace(": boolean | 'some' | 'all'", ": Any /* Boolean | 'some' | 'all' */")
        .replace("Record<string, boolean>", "ReadonlyRecord<String, Boolean>")
        .replace("Map<any, number>", "JsMap<Any, Int>")
        .replace(" => any", " -> Boolean /* Any? */")
        .replace(" => void", " -> Unit")
        .replace(" => ", " -> ")
        .replace(": string[]", ": ReadonlyArray<String>")
        .replace(" TNode[]", " ReadonlyArray<TNode>")
        .replace(": Column<TData, unknown>[]", ": ReadonlyArray<Column<TData, *>>")
        .replace(": HeaderGroup<TData>[]", ": ReadonlyArray<HeaderGroup<TData>>")
        .replace("undefined | [number, number]", "JsTuple2<Int, Int>?")
        .replace("?: Column<TData, unknown>", ": Column<TData, *> = definedExternally")
        .replace("?: Column<TData, TValue>", ": Column<TData, TValue> = definedExternally")
        .replace(": ColumnDef<TData>", ": ColumnDef<TData, *>")
        .replace(": TData | undefined", ": TData?")
        .replace("?: Row<TData>[],", ": ReadonlyArray<Row<TData>>? = definedExternally,")
        .replace(": Row<TData>[],", ": ReadonlyArray<Row<TData>>,")
        .replace(" -> Row<TData>[],", " -> ReadonlyArray<Row<TData>>,")
        .replace("?: string)", ": String? = definedExternally)")
        .replace(": string", ": String")
        .replace(": number", ": Int")
        .replace(": boolean", ": Boolean")
        .replace("?: GroupingColumnMode", ": GroupingColumnMode = definedExternally")
        .replace("?: FilterFn<TData>", ": FilterFn<TData> = definedExternally")
        .replace("?: any", ": Any = definedExternally")
        .replace(": void", "")

    // TODO: use result interface instead
    if ("): {" in body)
        body = body.replace("): {", "): Any /* {") + " */"

    if (name == "createRow")
        body = body.replaceFirst("<TData>", "<TData : RowData>")

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

    var declaration = source
        .replace(" = unknown>", ">")
        .substringBefore(" = ")
        .replace(" extends ", " : ")

    var body = source
        .replace(" = unknown>", ">")
        .substringAfter(" = ")
        .replace(" => ", " -> ")

    when (name) {
        "ResolvedAggregationFns",
        "ResolvedFilterFns",
        "ResolvedSortingFns",
            -> return ConversionResult(name, "external interface $name {\n/*\n$body\n*/\n}")
    }

    if (body == "{}")
        return ConversionResult(name, "@JsPlainObject\nexternal interface $declaration")

    if (body.startsWith("'") && !body.startsWith("'auto'") || body.startsWith("false | '"))
        return convertUnion(name, body)

    if (name == "RowData")
        return ConversionResult(name, "typealias $declaration = Any /* $body */")

    if (name == "Getter")
        body = "() -> TValue /* $body */"

    if (body.startsWith("Pick<ColumnSizingOptions,")) {
        return ConversionResult(
            name,
            "@JsPlainObject\nexternal interface $declaration : ColumnSizingOptions /* $body */"
        )
    }

    if (body.startsWith("Pick<VisibilityOptions,")) {
        return ConversionResult(
            name,
            "@JsPlainObject\nexternal interface $declaration : VisibilityOptions  /* $body */"
        )
    }

    if (" | " in body) {
        when (name) {
            "ColumnDef",
            "ColumnIdentifiers",
            "AccessorColumnDef",
                -> {
                body = body
                    .splitToSequence(" | ")
                    .joinToString(",\n", "\n")
                    .replace(",\nStringHeaderIdentifier", "\n    /* StringHeaderIdentifier */")

                return ConversionResult(name, "external interface $declaration : $body")
            }
        }

        declaration = declaration
            .replace(": object>", ": Any>")

        if (name == "StringOrTemplateHeader")
            declaration = declaration.replace("<TData,", "<TData : RowData,")

        val typeParameters = declaration.removePrefix(name)
        val factoryType = declaration
            .replace(": RowData", "")
            .replace(": Any", "")
        val factories = body.splitToSequence(" | ")
            .filter { !it.startsWith("keyof ") }
            .map { it.removeSurrounding("(", ")") }
            .filter { !it.startsWith("BuiltIn") }
            .map { type ->
                when (type) {
                    "true" -> "Boolean /* $type */"
                    "'auto'" -> "String /* $type */"
                    else -> type
                        .replace("Record<", "ReadonlyRecord<")
                        .replace("string", "String")
                        .replace("number", "Number")
                        .replace("symbol", "Symbol")
                        .replace("boolean", "Boolean")
                        .replace("any", "Any?") // No element
                }
            }
            .joinToString("\n\n") { type ->
                val modifier = if (type.startsWith("(") || type.startsWith("AggregationFn<")) "noinline" else ""
                val castFn =
                    if (typeParameters.isEmpty() || typeParameters.contains(":")) "unsafeCast" else "unsafeSpecialCast"

                """
                inline fun $typeParameters $name(
                    $modifier source: $type,
                ): $factoryType =
                    $castFn(source)
                """.trimIndent()
            }

        return ConversionResult(name, "sealed external interface $declaration /* $body */\n\n$factories")
    }

    if ("&" in body) {
        if (body.startsWith("ColumnDefBase<TData, TValue> & {\n") ||
            body.startsWith("ColumnDefBase<TData, TValue> & ColumnIdentifiers<TData, TValue> & {\n") ||
            "\n} & Partial<ColumnIdentifiers<TData, TValue>> & ColumnDefBase<TData, TValue> & {" in body
        ) {
            val members = body
                .removePrefix("ColumnDefBase<TData, TValue> & {\n")
                .removePrefix("ColumnDefBase<TData, TValue> & ColumnIdentifiers<TData, TValue> & {\n")
                .replace("\n} & Partial<ColumnIdentifiers<TData, TValue>> & ColumnDefBase<TData, TValue> & {", "")
                .removePrefix("{\n")
                .let { convertMembers(it) }

            val parentTypes = mutableListOf("ColumnDefBase<TData, TValue>")
            if ("ColumnIdentifiers<TData, TValue>" in body)
                parentTypes.add("ColumnIdentifiers<TData, TValue>")

            return ConversionResult(
                name,
                "@JsPlainObject\nexternal interface $declaration : ${parentTypes.joinToString(",")} {\n${members}\n}"
            )
        }

        declaration = declaration.replace(" : any", " : Any")

        if (name == "ColumnDef")
            declaration = declaration.replace("TValue : Any", "TValue")

        val interfaceBody = when (name) {
            "ColumnDefResolved",
                -> "ColumnDef<TData, TValue> /* $body */"

            else -> body
                .removeSurrounding("Partial<", ">")
                .splitToSequence(" & ")
                .map { it.removeSurrounding("Partial<", ">") }
                .joinToString(",\n") { parentType ->
                    when (parentType) {
                        "GroupingOptions",
                        "PaginationOptions",
                            -> parentType + "<TData>"

                        else -> parentType
                    }
                }
        }

        return ConversionResult(name, "@JsPlainObject\nexternal interface $declaration :\n$interfaceBody")
    }

    declaration = declaration
        .replace(": RowData>", "/* : RowData */>")
        .replace(": RowData, ", "/* : RowData */, ")

    body = body
        .replace("(...args: any) -> any", "Function<Unit>")
        .replace("Record<", "ReadonlyRecord<")
        .replace("string[]", "ReadonlyArray<String>")
        .replace("ColumnFilter[]", "ReadonlyArray<ColumnFilter>")
        .replace("ColumnSort[]", "ReadonlyArray<ColumnSort>")
        .replace("Row<TData>[]", "ReadonlyArray<Row<TData>>")
        .replace("column?: Column<TData, TValue>", "column: Column<TData, TValue>?")
        .replace("column?: Column<TData, unknown>", "column: Column<TData, *>?")
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

private fun convertInterface(
    source: String,
): ConversionResult {
    var declaration = source.substringBefore(" {")
        .replace(" = unknown>", ">")
        .replace(" = any>", ">")
        .removeSuffix(" =")
        .let { line ->
            val main = if (">" in line) {
                if ("> extends " in line) {
                    line.substringBeforeLast("> extends ") + ">"
                } else line
            } else line.substringBefore(" extends ")

            val mainDeclaration = main.replace(" extends ", " : ")
            if (main == line)
                return@let mainDeclaration

            val parents = line
                .removePrefix(main)
                .removePrefix(" extends ")
                .replace(Regex("<.+?>")) { it.value.replace(", ", ",") }
                .replace(", '", ",'")
                .replace(", ", ",\n")
                .replace(Regex("<.+?>")) { it.value.replace(",", ", ") }
                .replace(",'", ", '")

            "$mainDeclaration :\n$parents"
        }

    val name = declaration
        .substringBefore("<")
        .substringBefore(" ")

    when (name) {
        "GroupingOptions",
            -> declaration = declaration
            .replaceFirst(name, "$name<TData : RowData>")
            .replaceFirst("GroupingOptionsBase,", "GroupingOptionsBase<TData>,")

        "GroupingOptionsBase",
        "PaginationOptions",
        "SortingOptionsBase",
            -> declaration += "<TData : RowData>"

        "SortingOptions",
            -> declaration = declaration
            .replace("SortingOptionsBase,", "SortingOptionsBase<TData>,")

        "FeatureOptions",
            -> declaration = declaration
            .replace("GroupingOptions,", "GroupingOptions<TData>,")
            .replace("PaginationOptions,", "PaginationOptions<TData>,")

        "HeaderContext",
            -> declaration = declaration.replace("<TData,", "<TData : RowData,")

        "InitialTableState",
            -> declaration = declaration.replace(
            "Partial<CompleteInitialTableState>",
            "CompleteInitialTableState"
        )
    }

    var members = convertMembers(source.substringAfter(" {"))
    if (name == "AccessorKeyColumnDefBase")
        members = members.replace("var id: String?", "    /* var id: String? */")

    val body = "{\n$members\n}\n"
    return ConversionResult(name, "@JsPlainObject\nexternal interface $declaration$body")
}

private val TOGGLE_SELECTED_OLD = """
    toggleSelected: (value?: boolean, opts?: {
        selectChildren?: boolean;
    }) => void;
""".trim()

private val TOGGLE_SELECTED_NEW = """
    toggleSelected: (value?: boolean, opts?: ToggleSelectedOptions) => void;
""".trim()

private fun convertMembers(
    source: String,
): String {
    if (TOGGLE_SELECTED_OLD in source) {
        return convertMembers(source.replace(TOGGLE_SELECTED_OLD, TOGGLE_SELECTED_NEW)) +
                "\n\n" +
                """
                @JsPlainObject
                interface ToggleSelectedOptions {
                    val selectChildren: Boolean?
                }    
                """.trimIndent()
    }

    val content = source
        .removeSuffix("\n")
        .substringBefore(" & (keyof ")
        .substringBeforeLast("\n}")
        .replace("     * @link ", "     * ")
        .replace("      * @link ", "     * ")
        .trimIndent()

    if (content == "")
        return ""

    return content
        .splitToSequence("\n")
        .filter { !it.startsWith("_") }
        .map { it.removeSuffix(";") }
        .map { line ->
            when {
                line.startsWith("/") -> line
                line.startsWith(" *") -> line
                line.startsWith("    - ") -> line
                else -> convertMember(line)
            }
        }
        .joinToString("\n")
}

private fun convertMember(
    source: String,
): String {
    if (source.startsWith("("))
        return "    // TODO: support invoke\n    /* $source */"

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
