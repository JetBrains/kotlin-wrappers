package testing.library.user.event.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import js.objects.unsafeJso
import testing.library.user.event.karakum.plugins.convertGlobalPatches

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertGlobalPatches,
        )

        input = manyOf("dist/types/**/*.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "dist/types/" to "/",

            "event/behavior/registry/Behavior.kt" to "event/behavior/registry/Behavior.interface.kt",
            "event/eventMap/EventMap.kt" to "event/eventMap/EventMap.interface.kt",
            "setup/api/UserEventApi.kt" to "setup/api/UserEventApi.interface.kt",
            "setup/index/UserEvent.kt" to "setup/index/UserEvent.interface.kt",

            "index/" to "/",
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
