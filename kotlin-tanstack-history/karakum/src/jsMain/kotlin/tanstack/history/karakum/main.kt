package tanstack.history.karakum

import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            PromiseResultPlugin()
        )

        input = manyOf("dist/esm/index.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "dist/esm/index" to "/"
        )
    }
}
