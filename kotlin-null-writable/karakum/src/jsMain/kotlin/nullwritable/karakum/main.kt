package nullwritable.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import nullwritable.karakum.inheritanceModifiers.modifyMethodInheritance
import nullwritable.karakum.plugins.convertChunksItem
import nullwritable.karakum.plugins.convertErrorType
import nullwritable.karakum.plugins.convertParameterNames

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertChunksItem,
            convertErrorType,
            convertParameterNames
        )
        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance
        )

        input = manyOf("**/*.d.ts")
        ignoreOutput = manyOf(
            "**/nullWritable.kt",
        )
        libraryNameOutputPrefix = true
        packageNameMapper = recordOf(
            "^null/writable/lib/" to "nullwritable/"
        )
        importInjector = recordOf(
            "^nullwritable/NullWritable\\.kt$" to arrayOf(
                "node.buffer.BufferEncoding",
                "node.stream.Writable",
            )
        )
    }
}
