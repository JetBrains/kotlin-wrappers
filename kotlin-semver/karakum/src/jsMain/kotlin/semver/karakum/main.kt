package semver.karakum

import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.`package`
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import semver.karakum.annotations.annotateJsPlainObject
import semver.karakum.inheritanceModifiers.modifyMethodInheritance
import semver.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            convertCoerceParameterType,
            convertComparisonResultType,
            convertConflictingOverloads,
            convertIdentifierBasePackage,
            convertVersionPartTypes,
        )
        annotations = listOf(
            ::annotateJsPlainObject
        )
        inheritanceModifiers = listOf(
            ::modifyMethodInheritance
        )

        input = listOf("**/*.d.ts")
        ignoreInput = listOf("**/internals/*")
        ignoreOutput = listOf(
            "**/semver/ComparatorOperator.kt",
            "**/semver/OutsideHilo.kt",
            "**/semver/Operator.kt",
            "**/semver/preload.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
            "^.*/([^/]+\\.kt)$" to "semver/$1",
            "semver/(Range|SemVer|Comparator)\\.kt" to "semver/$1.class.kt",
        )
        namespaceStrategy = mapOf(
            "^inc$" to NamespaceStrategy.`package`
        )
    }
}
