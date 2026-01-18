package karakum.tanstack.history

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf

private val DEFAULT_IMPORTS = arrayOf(
    "js.array.ReadonlyArray",
    "js.collections.ReadonlySet",
    "js.promise.Promise",
    "js.promise.PromiseResult",
)

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = manyOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "dist/esm/index" to "/"
        )
        importInjector = recordOf(
            "BlockerFn.kt" to DEFAULT_IMPORTS,
            "CreateHistoryOpts.kt" to DEFAULT_IMPORTS,
            "CreateMemoryHistoryOpts.kt" to DEFAULT_IMPORTS,
            "RouterHistory.kt" to DEFAULT_IMPORTS,
        )
    }
}
