package wrappersgenerator.tanstack.virtual.core

import io.github.sgrishchenko.karakum.configuration.ConflictResolutionStrategy
import io.github.sgrishchenko.karakum.configuration.replace
import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import wrappersgenerator.tanstack.virtual.core.inheritanceModifiers.modifyVirtualizerInheritance
import wrappersgenerator.tanstack.virtual.core.mutabilityModifiers.modifyJsPlainObjectMutability
import wrappersgenerator.tanstack.virtual.core.nameResolvers.resolveItemRangeName
import wrappersgenerator.tanstack.virtual.core.nameResolvers.resolveScrollOptionsName
import wrappersgenerator.tanstack.virtual.core.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            NumberPlugin(defaultNumberType = "Int"),

            convertElementWindowUnion,
            convertFollowOnAppend,
            convertGenericFunctionVariable,
            convertValueOrGetterUnion,
            convertOffsetForIndexReturn,
            convertPick,
            convertSkippedGenerics,
            convertUnderscoredMember,
            convertUtilityTypes,
            convertWindowGlobalThisIntersection,
        )
        annotations = listOf(
            JsPlainObjectAnnotation(),
        )
        inheritanceModifiers = listOf(
            modifyVirtualizerInheritance,
        )
        mutabilityModifiers = listOf(
            modifyJsPlainObjectMutability,
        )
        nameResolvers = listOf(
            ::resolveItemRangeName,
            ::resolveScrollOptionsName,
        )
        conflictResolutionStrategy = mapOf(
            "ItemRange.kt" to ConflictResolutionStrategy.replace,
            "ScrollOptions.kt" to ConflictResolutionStrategy.replace,
        )

        input = listOf("dist/esm/index.d.ts")
        ignoreOutput = listOf(
            "**/index.kt",
            "**/Key.kt",
            "**/ScrollBehavior.kt",
            "**/_resetIOSDetectionForTests.kt",
        )
        packageNameMapper = mapOf(
            "dist/esm/" to "/",
        )

        val scrollBehaviorImports = listOf(
            "web.scroll.ScrollBehavior",
        )

        importInjector = mapOf(
            "ScrollToOptions.kt" to scrollBehaviorImports,
            "ScrollToEndOptions.kt" to scrollBehaviorImports,
            "ScrollOptions.kt" to scrollBehaviorImports,
        )
    }
}
