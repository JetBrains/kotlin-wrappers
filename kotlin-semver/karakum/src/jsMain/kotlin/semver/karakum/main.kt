package semver.karakum

import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.`package`
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import semver.karakum.annotations.annotateJsPlainObject
import semver.karakum.inheritanceModifiers.modifyMethodInheritance
import semver.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertCoerceParameterType,
            convertComparisonResultType,
            convertConflictingOverloads,
            convertIdentifierBasePackage,
            convertVersionPartTypes,
        )
        annotations = manyOf(
            ::annotateJsPlainObject
        )
        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("**/*.d.ts")
        ignoreInput = manyOf("**/internals/*")
        ignoreOutput = manyOf(
            "**/semver/ComparatorOperator.kt",
            "**/semver/OutsideHilo.kt",
            "**/semver/Operator.kt",
            "**/semver/preload.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "^.*/([^/]+\\.kt)$" to "semver/$1",
            "semver/(Range|SemVer|Comparator)\\.kt" to "semver/$1.class.kt",
        )
        importInjector = recordOf(
            "^semver/(Range\\.class|SemVer\\.class|prerelease)\\.kt$" to arrayOf(
                "js.array.ReadonlyArray"
            )
        )
        namespaceStrategy = recordOf(
            "^inc$" to NamespaceStrategy.`package`
        )
    }
}
