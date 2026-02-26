package testing.library.react.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import js.objects.recordOf
import js.objects.unsafeJso
import testing.library.react.karakum.inheritanceModifiers.modifyMethodInheritance
import testing.library.react.karakum.injections.injectBoundFunction
import testing.library.react.karakum.plugins.convertBaseRenderOptions
import testing.library.react.karakum.plugins.convertQueriesGenerics
import testing.library.react.karakum.plugins.convertExoticReactTypeReferences
import testing.library.react.karakum.plugins.convertPrettyFormatOptionsReceived
import testing.library.react.karakum.plugins.convertReactQualifiedName
import testing.library.react.karakum.plugins.convertSkippedGenerics
import testing.library.react.karakum.plugins.convertUtilityTypes

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        injections

        plugins = manyOf(
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

        injections = manyOf(
            injectBoundFunction
        )

        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("types/**/*.d.ts")
        ignoreInput = manyOf("types/pure.d.ts")
        ignoreOutput = manyOf(
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
        packageNameMapper = recordOf(
            "types/index/" to "/"
        )
        importMapper = recordOf(
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
