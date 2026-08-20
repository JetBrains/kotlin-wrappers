package tanstack.react.virtual.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import tanstack.react.virtual.karakum.annotations.createJsPlainObjectAnnotation
import tanstack.react.virtual.karakum.nameResolvers.resolveDirectDomUpdatesModeName
import tanstack.react.virtual.karakum.plugins.convertElementWindowUnion
import tanstack.react.virtual.karakum.plugins.convertInitialOffsetUnion
import tanstack.react.virtual.karakum.plugins.convertReactVirtualizer
import tanstack.react.virtual.karakum.plugins.convertUseVirtualizerOptions

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = listOf("dist/esm/index.d.ts")

        annotations = listOf(
            createJsPlainObjectAnnotation(),
        )

        plugins = listOf(
            convertElementWindowUnion,
            convertInitialOffsetUnion,
            convertReactVirtualizer,
            convertUseVirtualizerOptions,
        )

        nameResolvers = listOf(
            ::resolveDirectDomUpdatesModeName,
        )

        ignoreOutput = listOf(
            "**/index.kt",
            "**/memo.kt",
        )

        libraryNameOutputPrefix = true

        packageNameMapper = mapOf(
            "dist/esm/" to "/"
        )

        importMapper = mapOf(
            "@tanstack/react-virtual" to ruleOf(
                ".+" to "tanstack.react.virtual."
            ),
            "@tanstack/virtual-core" to ruleOf(
                ".+" to "tanstack.virtual.core."
            )
        )

        importInjector = mapOf(
            "UseVirtualizerOptions.kt" to listOf(
                "tanstack.virtual.core.*",
            ),
            "UseWindowVirtualizerOptions.kt" to listOf(
                "tanstack.virtual.core.*",
            ),
        )
    }
}
