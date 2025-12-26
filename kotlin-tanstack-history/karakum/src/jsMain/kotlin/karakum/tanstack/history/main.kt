package karakum.tanstack.history

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.path.path
import node.process.process
import node.url.fileURLToPath

suspend fun main() {
    val packageDirectory = import.meta.resolve("@tanstack/history/package.json")
        .let { fileURLToPath(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    generate {
        input = manyOf("$packageDirectory/dist/esm/index.d.ts")
        output = outputPath
        libraryName = "@tanstack/history"
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            "^.*$" to "@tanstack/history",
        )
        disclaimer = "// Automatically generated - do not modify!"
    }
}
