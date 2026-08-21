package tanstack.virtual.core.karakum

import io.github.sgrishchenko.karakum.configuration.ConflictResolutionStrategy
import io.github.sgrishchenko.karakum.configuration.replace
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import tanstack.virtual.core.karakum.annotations.createJsPlainObjectAnnotation
import tanstack.virtual.core.karakum.nameResolvers.resolveItemRangeName
import tanstack.virtual.core.karakum.nameResolvers.resolveScrollOptionsName
import tanstack.virtual.core.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = listOf("dist/esm/index.d.ts")

        annotations = listOf(
            createJsPlainObjectAnnotation(),
        )

        plugins = listOf(
            convertConstFunctionTypeGenerics,
            convertElementWindowUnion,
            convertFollowOnAppend,
            convertInitialOffsetUnion,
            convertKey,
            convertOffsetForIndexReturn,
            convertScrollToEndOptions,
            convertSkippedGenerics,
            convertTypeParameterReferences,
            convertUtilityTypes,
            convertVoidCleanupUnion,
            convertWindowGlobalThisIntersection,
        )

        nameResolvers = listOf(
            ::resolveItemRangeName,
            ::resolveScrollOptionsName,
        )

        conflictResolutionStrategy = mapOf(
            "ItemRange.kt" to ConflictResolutionStrategy.replace,
            "ScrollOptions.kt" to ConflictResolutionStrategy.replace,
        )

        ignoreOutput = listOf(
            "**/index.kt",
            "**/memo.kt",
            "**/NoInfer.kt",
            "**/PartialKeys.kt",
            "**/ScrollBehavior.kt",
            "**/_resetIOSDetectionForTests.kt",
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
            "ScrollOptions.kt" to listOf(
                "web.scroll.ScrollBehavior",
            ),
        )
    }
}
