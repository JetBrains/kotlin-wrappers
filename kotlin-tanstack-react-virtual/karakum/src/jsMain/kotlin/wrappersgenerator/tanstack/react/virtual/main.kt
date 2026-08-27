package wrappersgenerator.tanstack.react.virtual

import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import wrappersgenerator.tanstack.react.virtual.annotations.annotateInterfaceWithSuperclass
import wrappersgenerator.tanstack.react.virtual.mutabilityModifiers.modifyJsPlainObjectMutability
import wrappersgenerator.tanstack.react.virtual.nameResolvers.resolveDirectDomUpdatesModeName
import wrappersgenerator.tanstack.react.virtual.nameResolvers.resolveScrollOptionsName
import wrappersgenerator.tanstack.react.virtual.plugins.convertElementWindowUnion
import wrappersgenerator.tanstack.react.virtual.plugins.convertUseVirtualizerOptions
import wrappersgenerator.tanstack.react.virtual.plugins.convertValueOrGetterUnion

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            NumberPlugin(defaultNumberType = "Int"),

            convertElementWindowUnion,
            convertValueOrGetterUnion,
            convertUseVirtualizerOptions,
        )
        annotations = listOf(
            JsPlainObjectAnnotation(),

            ::annotateInterfaceWithSuperclass,
        )
        mutabilityModifiers = listOf(
            modifyJsPlainObjectMutability,
        )
        nameResolvers = listOf(
            ::resolveDirectDomUpdatesModeName,
            ::resolveScrollOptionsName,
        )

        input = listOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        ignoreOutput = listOf(
            "**/module.kt",
            "**/ScrollOptions.kt",
        )
        packageNameMapper = mapOf(
            "dist/esm/index" to "/",
        )
        importMapper = mapOf(
            "@tanstack/virtual-core" to ruleOf("tanstack.virtual.core"),
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
