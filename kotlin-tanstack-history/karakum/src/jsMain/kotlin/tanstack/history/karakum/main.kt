package tanstack.history.karakum

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import tanstack.history.karakum.annotations.annotateJsPlainObject
import tanstack.history.karakum.plugins.convertRouterHistoryProperty
import typescript.Node

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
            ::annotateJsPlainObject
        )

        input = listOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
            "dist/esm/index" to "/"
        )
    }
}
