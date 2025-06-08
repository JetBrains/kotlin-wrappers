package nullwritable.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.configuration.loadExtensions
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.module.findPackageJSON
import node.path.path
import node.process.process
import nullwritable.karakum.plugins.convertParameterNames

suspend fun main() {
    val nullWritablePackage = findPackageJSON("null-writable", import.meta.url)
        .let { requireNotNull(it) }
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
        plugins = manyOf(values = jsPlugins + arrayOf(
            convertParameterNames
        ))
        injections = manyOf(values = jsInjections + arrayOf())
        annotations = manyOf(values = jsAnnotations + arrayOf())
        nameResolvers = manyOf(values = jsNameResolvers + arrayOf())
        inheritanceModifiers = manyOf(values = jsInheritanceModifiers + arrayOf())
        varianceModifiers = manyOf(values = jsVarianceModifiers + arrayOf())

        input = manyOf("$nullWritablePackage/**/*.d.ts")
        output = outputPath
        ignoreOutput = manyOf(
            "**/nullwritable/nullWritable.kt",
            "**/nullwritable/node.stream.WritableWritevChunksItem.kt",
        )
        libraryName = "null-writable"
        libraryNameOutputPrefix = true
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            "^.*$" to "null-writable"
        )
        packageNameMapper = recordOf(
            "^null/writable/" to "nullwritable/"
        )
        importInjector = recordOf(
            "^nullwritable/NullWritable\\.kt$" to arrayOf(
                "node.buffer.BufferEncoding",
                "node.stream.Writable",
            )
        )
    }
}
