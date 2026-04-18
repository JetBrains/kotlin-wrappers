package wrappersgenerator.tanstack.history

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.extension.withName
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import typescript.Node
import typescript.isInterfaceDeclaration
import wrappersgenerator.tanstack.history.mutabilityModifiers.modifyRouterHistoryMutability
import wrappersgenerator.tanstack.history.plugins.convertRouterHistoryProperty

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            NumberPlugin(
                defaultNumberType = "Int",
                matchers = emptyArray<Pair<String, (Node, Context) -> Boolean>>()
            ),
            PromiseResultPlugin(),

            convertRouterHistoryProperty
        )
        annotations = listOf(
            JsPlainObjectAnnotation(
                ignore = match {
                    match(::isInterfaceDeclaration, withName("RouterHistory"))
                }
            ),
        )
        mutabilityModifiers = listOf(
            modifyRouterHistoryMutability,
        )

        input = listOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
            "dist/esm/index" to "/"
        )
    }
}
