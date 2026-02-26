val generate by tasks.registering {
    doLast {
        generateApiReport()
    }
}

fun generateApiReport() {
    val files = fileTree("../..") {
        include("kotlin-js-core/src/webMain/**/*.kt")
        include("kotlin-js/src/webMain/**/*.kt")
        include("kotlin-web/src/webMain/**/*.kt")
        include("kotlin-browser/src/webMain/**/*.kt")
    }

    val content = files.files.asSequence()
        .onEach { println("Processing ${it.name}") }
        .flatMap { getApiItems(it) }
        .sortedBy { it.jsName }
        .joinToString(",\n", "{\n", "\n}\n") { (jsName, kotlinFqn) ->
            """    "$jsName": "$kotlinFqn""""
        }

    file("browser-api.json")
        .writeText(content)
}

data class ApiItem(
    val jsName: String,
    val kotlinFqn: String,
)

val EXCLUDED_NAMES = setOf(
    "JsClass",
    "JsErrorLike",
    "JsErrorName",
    "JsCloseable",
    "Object",
    "ObjectLike",
    "Serializable",

    "AsyncMapLike",

    "PromiseReject",
    "PromiseResolve",

    "VariadicTuple",

    "Abortable",
    "AbortableLike",

    "Ed25519Algorithm",
    "X25519Algorithm",
)

fun getApiItems(
    source: File,
): Sequence<ApiItem> {
    val content = source.readText()
    val pkg = content
        .substringAfter("package ", "")
        .substringBefore("\n")
        .trim()

    if (pkg == "js.array"
        || pkg == "js.atomic"
        || pkg == "js.core"
        || pkg == "js.function"
        || pkg.endsWith(".internal")
        || pkg.startsWith("kotlin.")
    ) {
        return emptySequence()
    }

    return content
        .splitToSequence(
            "external interface ",
            "external class ",
            "\ntypealias ",
        )
        .drop(1)
        .map { it.substringBefore("\n") }
        .map { it.replace("/* class */ ", "") }
        .map { it.substringBefore(" ") }
        .map { it.substringBefore("<") }
        .map { it.substringBefore("(") }
        .filter { !it.startsWith("Tuple") }
        .filter { it !in EXCLUDED_NAMES }
        .map { name ->
            val jsName = when {
                pkg == "js.intl" -> "Intl.$name"
                pkg == "js.temporal" -> "Temporal.$name"
                pkg == "web.assembly" -> "WebAssembly.$name"

                name == "JsError" -> "Error"
                name == "JsIterator" -> "Iterator"
                name == "JsIterable" -> "Iterable"
                name == "JsIteratorLike" -> "IteratorLike"
                name == "JsMap" -> "Map"
                name == "JsSet" -> "Set"

                else -> name
            }

            ApiItem(jsName, "$pkg.$name")
        }
}
