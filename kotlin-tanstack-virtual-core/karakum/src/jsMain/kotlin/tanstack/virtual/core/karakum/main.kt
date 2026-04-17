package tanstack.virtual.core.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import tanstack.virtual.core.karakum.annotations.createJsPlainObjectAnnotation
import tanstack.virtual.core.karakum.plugins.convertSkippedGenerics
import tanstack.virtual.core.karakum.plugins.convertUtilityTypes

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = listOf("dist/esm/index.d.ts")

        annotations = listOf(
            createJsPlainObjectAnnotation(),
        )

        plugins = listOf(
            convertSkippedGenerics,
            convertUtilityTypes,
        )

        ignoreOutput = listOf(
            "**/index.kt",
            "**/memo.kt",
            "**/NoInfer.kt",
            "**/PartialKeys.kt",
            "**/ScrollBehavior.kt",
        )

        libraryNameOutputPrefix = true

        packageNameMapper = mapOf(
            "dist/esm/" to "/"
        )

        importMapper = mapOf(
            "@tanstack/virtual-core" to ruleOf(
                ".+" to "tanstack.virtual.core."
            )
        )

        importInjector = mapOf(
            "ScrollToOptions.kt" to listOf(
                "web.scroll.ScrollBehavior",
            ),
            "VirtualizerOptionsScrollToFnOptions.kt" to listOf(
                "web.scroll.ScrollBehavior",
            ),
        )
    }
}
