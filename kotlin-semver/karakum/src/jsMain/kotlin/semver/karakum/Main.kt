package semver.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.loadExtensions
import io.github.sgrishchenko.karakum.extension.Annotation
import io.github.sgrishchenko.karakum.extension.InheritanceModifier
import io.github.sgrishchenko.karakum.extension.Injection
import io.github.sgrishchenko.karakum.extension.NameResolver
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.SimpleInjection
import io.github.sgrishchenko.karakum.extension.SimplePlugin
import io.github.sgrishchenko.karakum.extension.VarianceModifier
import io.github.sgrishchenko.karakum.extension.createInjection
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.path.path
import node.process.process
import node.url.fileURLToPath

suspend fun main() {
    val semverPackage = import.meta.resolve("@types/semver/package.json")
        .let { fileURLToPath(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    val cwd = process.cwd()

    val jsPlugins = loadExtensions(
        "Plugin",
        arrayOf("kotlin/plugins/*.js"),
        cwd
    ) { plugin ->
        if (plugin is Function<*>) {
            createPlugin(plugin.unsafeCast<SimplePlugin>())
        } else {
            plugin.unsafeCast<Plugin>()
        }
    }

    val jsInjections = loadExtensions(
        "Injection",
        arrayOf("kotlin/injections/*.js"),
        cwd
    ) { injection ->
        if (injection is Function<*>) {
            createInjection(injection.unsafeCast<SimpleInjection>())
        } else {
            injection.unsafeCast<Injection>()
        }
    }

    val jsAnnotations = loadExtensions<Annotation>(
        "Annotation",
        arrayOf("kotlin/annotations/*.js"),
        cwd,
    )

    val jsNameResolvers = loadExtensions<NameResolver>(
        "Name Resolver",
        arrayOf("kotlin/nameResolvers/*.js"),
        cwd,
    )

    val jsInheritanceModifiers = loadExtensions<InheritanceModifier>(
        "Inheritance Modifier",
        arrayOf("kotlin/inheritanceModifiers/*.js"),
        cwd,
    )

    val jsVarianceModifiers = loadExtensions<VarianceModifier>(
        "Variance Modifier",
        arrayOf("kotlin/varianceModifiers/*.js"),
        cwd,
    )

    generate {
        plugins = manyOf(values = jsPlugins + arrayOf())
        injections = manyOf(values = jsInjections + arrayOf())
        annotations = manyOf(values = jsAnnotations + arrayOf())
        nameResolvers = manyOf(values = jsNameResolvers + arrayOf())
        inheritanceModifiers = manyOf(values = jsInheritanceModifiers + arrayOf())
        varianceModifiers = manyOf(values = jsVarianceModifiers + arrayOf())

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
