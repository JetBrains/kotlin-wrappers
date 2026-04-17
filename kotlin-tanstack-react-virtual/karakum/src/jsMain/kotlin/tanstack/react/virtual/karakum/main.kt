package tanstack.react.virtual.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = listOf("dist/esm/index.d.ts")

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
    }
}
