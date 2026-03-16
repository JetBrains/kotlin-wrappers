package wrappersgenerator.testing.library.react

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import js.objects.unsafeJso
import wrappersgenerator.testing.library.react.inheritanceModifiers.modifyMethodInheritance
import wrappersgenerator.testing.library.react.injections.injectBoundFunction
import wrappersgenerator.testing.library.react.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        injections

        plugins = listOf(
            convertBaseRenderOptions,

            // should be applied before removing of queries generics
            convertSkippedGenerics,
            convertQueriesGenerics,

            convertPrettyFormatOptionsReceived,

            // should be applied before providing of React qualified names references
            convertExoticReactTypeReferences,
            convertReactQualifiedName,

            convertUtilityTypes,
        )

        injections = listOf(
            injectBoundFunction
        )

        inheritanceModifiers = listOf(
            ::modifyMethodInheritance
        )

        input = listOf("types/**/*.d.ts")
        ignoreInput = listOf("types/pure.d.ts")
        ignoreOutput = listOf(
            // provided by React
            "**/act.kt",
            // deprecated
            "**/BaseRenderOptions.kt",
            "**/BaseRenderHookOptions.kt",
            "**/ClientRenderOptions.kt",
            "**/ClientRenderHookOptions.kt",
            "**/HydrateOptions.kt",
            "**/HydrateHookOptions.kt",
            // metaprogramming
            "**/Omit.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
            "types/index/" to "/"
        )
        importMapper = mapOf(
            "@testing-library/dom" to ruleOf(
                "prettyFormat" to "",
                "queries" to "",
                ".+" to "testing.library.dom."
            ),
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
