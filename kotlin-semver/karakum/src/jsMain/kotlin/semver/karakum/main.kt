package semver.karakum

import io.github.sgrishchenko.karakum.configuration.InputResolutionStrategy
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.ignore
import io.github.sgrishchenko.karakum.configuration.plain
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.import.import
import js.objects.recordOf
import node.module.findPackageJSON
import node.path.path
import semver.karakum.annotations.annotateJsPlainObject
import semver.karakum.inheritanceModifiers.modifyMethodInheritance
import semver.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    val semverPackage = findPackageJSON("@types/semver", import.meta.url)
        .let { requireNotNull(it) }
        .let { path.dirname(it) }

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

        inputResolutionStrategy = InputResolutionStrategy.plain
        input = manyOf("$semverPackage/**/*.d.ts")
        ignoreInput = manyOf("$semverPackage/internals/*")
        ignoreOutput = manyOf(
            "**/semver/ComparatorOperator.kt",
            "**/semver/OutsideHilo.kt",
            "**/semver/Operator.kt",
            "**/semver/preload.kt",
        )
        libraryName = "semver"
        libraryNameOutputPrefix = true
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
            "^inc$" to NamespaceStrategy.ignore
        )
    }
}
