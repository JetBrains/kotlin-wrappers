package karakum.tanstack.history

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = manyOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "dist/esm/index" to "/"
        )
    }
}
