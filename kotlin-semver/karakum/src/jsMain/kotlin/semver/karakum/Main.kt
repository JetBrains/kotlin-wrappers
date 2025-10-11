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
import semver.karakum.plugins.convertConflictingOverloads
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

        input = manyOf("$semverPackage/**/*.d.ts")
        ignoreInput = manyOf("$semverPackage/internals/*")
        output = outputPath
        ignoreOutput = manyOf(
            "**/semver/ComparatorOperator.kt",
            "**/semver/OutsideHilo.kt",
            "**/semver/Operator.kt",
            "**/semver/preload.kt",
        )
        libraryName = "semver"
        libraryNameOutputPrefix = true
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            "^.*$" to "semver"
        )
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
