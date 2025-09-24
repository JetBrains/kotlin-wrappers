package nullwritable.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.module.findPackageJSON
import node.path.path
import node.process.process
import nullwritable.karakum.inheritanceModifiers.modifyMethodInheritance
import nullwritable.karakum.plugins.convertChunksItem
import nullwritable.karakum.plugins.convertErrorType
import nullwritable.karakum.plugins.convertParameterNames

suspend fun main() {
    val nullWritablePackage = findPackageJSON("null-writable", import.meta.url)
        .let { requireNotNull(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    generate {
        plugins = manyOf(
            convertChunksItem,
            convertErrorType,
            convertParameterNames
        )
        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("$nullWritablePackage/**/*.d.ts")
        output = outputPath
        ignoreOutput = manyOf(
            "**/nullwritable/nullWritable.kt",
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
