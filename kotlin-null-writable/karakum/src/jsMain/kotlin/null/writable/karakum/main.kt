package `null`.writable.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import `null`.writable.karakum.inheritanceModifiers.modifyMethodInheritance
import `null`.writable.karakum.plugins.convertChunksItem
import `null`.writable.karakum.plugins.convertParameterNames

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertChunksItem,
            convertParameterNames
        )
        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("**/*.d.ts")
        ignoreOutput = manyOf(
            "**/module.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "lib/nullWritable/" to "/"
        )
        importInjector = recordOf(
            "^null/writable/NullWritable\\.kt$" to arrayOf(
                "node.buffer.BufferEncoding",
                "node.stream.Writable",
            )
        )
    }
}
