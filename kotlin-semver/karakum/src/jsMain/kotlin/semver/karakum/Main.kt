package semver.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.path.path
import node.process.process
import node.url.fileURLToPath
import semver.karakum.annotations.annotateJsPlainObject
import semver.karakum.inheritanceModifiers.modifyMethodInheritance
import semver.karakum.plugins.convertCoerceParameterType
import semver.karakum.plugins.convertComparisonResultType
import semver.karakum.plugins.convertIdentifierBasePackage
import semver.karakum.plugins.convertVersionPartTypes

suspend fun main() {
    val semverPackage = import.meta.resolve("@types/semver/package.json")
        .let { fileURLToPath(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    generate {
        plugins = manyOf(
            convertCoerceParameterType,
            convertComparisonResultType,
            convertIdentifierBasePackage,
            convertVersionPartTypes,
        )
        annotations = manyOf(
            ::annotateJsPlainObject
        )
        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("$semverPackage/**/*.d.ts")
        ignoreInput = manyOf("$semverPackage/internals/*")
        output = outputPath
        ignoreOutput = manyOf(
            "**/semver/range.kt",
            "**/semver/comparator.kt",
            "**/semver/semver.kt",
            "**/semver/ComparatorOperator.kt",
            "**/semver/OutsideHilo.kt",
            "**/semver/Operator.kt",
            "**/semver/preload.kt",
            "**/semver/valid.kt",
        )
        libraryName = "semver"
        libraryNameOutputPrefix = true
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            "^.*$" to "semver"
        )
        packageNameMapper = recordOf(
            "^.*/([^/]+\\.kt)$" to "semver/$1"
        )
        importInjector = recordOf(
            "^semver/(Range|SemVer|prerelease)\\.kt$" to arrayOf(
                "js.array.ReadonlyArray"
            )
        )
        namespaceStrategy = recordOf(
            "^inc$" to NamespaceStrategy.ignore
        )
    }
}
