package karakum.query

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress
import karakum.common.writeCode
import java.io.File

private val DEFAULT_IMPORTS = listOf(
    "web.time.EpochTimeStamp",
    "js.array.Tuple2",
    "js.array.Tuple3",
    "js.array.ReadonlyArray",
    "js.errors.JsError",
    "js.objects.Record",
    "js.reflect.unsafeCast",
    "js.symbol.Symbol",
    "js.core.Void",

    "js.promise.Promise",
    "js.promise.PromiseResult",

    "js.collections.JsSet",

    "js.iterable.JsIterator",
    "js.iterable.AsyncIterable",

    "js.objects.JsPlainObject",

    "web.abort.AbortController",
    "web.abort.AbortSignal",

    "seskar.js.JsRawValue",
    "seskar.js.JsValue",
).map { it.substringAfterLast(".") to it }

fun generateKotlinDeclarations(
    coreTypesDir: File,
    reactTypesDir: File,
    sourceDir: File,
) {
    val coreTargetDir = sourceDir.resolve(Package.CORE.path)
        .also { it.mkdirs() }

    val reactTargetDir = sourceDir.resolve(Package.REACT.path)
        .also { it.mkdirs() }

    coreTargetDir.resolve("aliases.kt")
        .writeText(ALIASES_BODY)

    generate(coreTypesDir, coreTargetDir, Package.CORE)
    generate(reactTypesDir, reactTargetDir, Package.REACT)
}

private fun moduleDeclaration(
    pkg: Package,
): String =
    "@file:JsModule(\"${pkg.module}\")"

private fun generate(
    definitionsDir: File,
    targetDir: File,
    pkg: Package,
) {
    val files = definitionsDir
        .listFiles { file ->
            val name = file.name
                .takeIf { it.endsWith(".d.ts") }
                ?.removeSuffix(".d.ts")

            name != null
                    && name != "index"
                    && !name.endsWith(".native")
                    && name != "useSyncExternalStore"
                    && name != "reactBatchedUpdates"
                    && name != "queryClient-89a8a2bf"
                    && name != "utils"
                    && name != "queryOptions"
                    && name != "mutationOptions"
                    && name != "infiniteQueryOptions"
                    && !(name == "QueryStatus" && pkg == Package.REACT)
                    // TEMP
                    && name != "suspense"
                    && name != "useQueries"
                    && name != "useSuspenseQueries"
                    && name != "errorBoundaryUtils"
                    && name != "thenable"
        }
        ?: return

    val fileMap = files
        .asSequence()
        .map { file ->
            val name = file.name.removeSuffix(".d.ts") + ".kt"
            val declarations = toDeclarations(file)
            name to declarations
        }
        .filter { (_, declarations) -> declarations.isNotEmpty() }
        .flatMap { (name, declarations) ->
            val enums = declarations.filter { it is Type && it.enumMode }

            enums.asSequence()
                .map { "${it.name}.kt" to listOf(it) }
                .plus(name to (declarations - enums))
        }
        .toList()

    TypeRegistry(
        fileMap.asSequence()
            .flatMap { (_, declarations) -> declarations }
            .filterIsInstance<TypeBase>()
            .toList()
    )

    for ((name, declarations) in fileMap) {
        generate(targetDir.resolve(name), declarations, pkg)
    }
}

private fun generate(
    file: File,
    declarations: List<Declaration>,
    pkg: Package,
) {
    val suggestedName = file.name.removeSuffix(".kt")
    if (!declarations.all { it.name == suggestedName }) {
        for (group in declarations.groupBy { it.name }.values) {
            group.first().name

            generate(
                file = file.parentFile.resolve(group.first().name + ".kt"),
                declarations = group,
                pkg = pkg,
            )
        }
        return
    }

    val body = declarations.asSequence()
        .map { it.toCode() }
        .filter { "UndefinedInitialDataOptions" !in it }
        .filter { "DefinedInitialDataOptions" !in it }
        .filter { "UndefinedInitialDataInfiniteOptions" !in it }
        .filter { "DefinedInitialDataInfiniteOptions" !in it }
        .filter { "ensureQueryFn" !in it }
        .filter { it.isNotEmpty() }
        .joinToString("\n\n")
        .ifEmpty { return }

    val moduleRequired = "external object " in body
            || "external class " in body
            || "external fun " in body
            || "external val " in body
    val annotations = if (moduleRequired) {
        moduleDeclaration(pkg)
    } else ""

    val suppresses: String = run {
        val types = mutableListOf<Suppress>()
        if ("> = Union" in body || "> = Any" in body || "> = Function<" in body)
            types.add(Suppress.UNUSED_TYPEALIAS_PARAMETER)

        if (moduleRequired && "typealias " in body)
            types.add(Suppress.NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE)

        if (types.isNotEmpty()) {
            types.asSequence()
                .map { "\"${it.name}\",\n" }
                .joinToString("", "@file:Suppress(\n", ")")
        } else ""
    }

    val coreImport = sequenceOf(Package.CORE)
        .minus(pkg)
        .map {
            """
            import tanstack.query.core.InfiniteQueryObserverOptions
            import tanstack.query.core.InfiniteQueryObserverResult
            import tanstack.query.core.DefinedInfiniteQueryObserverResult
            import tanstack.query.core.DefinedQueryObserverResult
            import tanstack.query.core.FetchInfiniteQueryOptions
            import tanstack.query.core.FetchQueryOptions
            import tanstack.query.core.DehydratedState
            import tanstack.query.core.HydrateOptions
            import tanstack.query.core.QueryClient
            import tanstack.query.core.QueryFunction
            import tanstack.query.core.QueryKey
            import tanstack.query.core.QueryObserver
            import tanstack.query.core.QueryObserverOptions
            import tanstack.query.core.QueryObserverResult
            import tanstack.query.core.QueryStatus
            import tanstack.query.core.MutationObserverOptions
            import tanstack.query.core.MutationFilters
            import tanstack.query.core.MutationFunction
            import tanstack.query.core.MutationKey
            import tanstack.query.core.MutateFunction
            import tanstack.query.core.MutationObserverResult
            import tanstack.query.core.QueryFilters

            import tanstack.query.core.False
            import tanstack.query.core.True
            """.trimIndent()
        }

    val defaultImports = DEFAULT_IMPORTS
        .filter { it.first in body }
        .map { "import ${it.second}" }
        .plus(coreImport)
        .joinToString("\n")

    val text = sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        suppresses,
        pkg.pkg,
        defaultImports,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    val singleConst = declarations.singleOrNull() as? Const
    val targetFile = if (singleConst != null) {
        file.parentFile.resolve(singleConst.name + ".val.kt")
    } else file

    targetFile.writeCode(text)
}
