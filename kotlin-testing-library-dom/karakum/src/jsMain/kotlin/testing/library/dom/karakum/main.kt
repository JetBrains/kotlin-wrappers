package testing.library.dom.karakum

import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseFunctionPlugin
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import js.objects.unsafeJso
import testing.library.dom.karakum.annotations.annotateWaitFor
import testing.library.dom.karakum.inheritanceModifiers.modifyMethodInheritance
import testing.library.dom.karakum.plugins.BoundQueriesPlugin
import testing.library.dom.karakum.plugins.QueriesPlugin
import testing.library.dom.karakum.plugins.convertFunctionInterfaces
import testing.library.dom.karakum.plugins.convertOptionalType
import testing.library.dom.karakum.plugins.convertPrettyFormatOptionsReceived
import testing.library.dom.karakum.plugins.convertQueriesGenerics
import testing.library.dom.karakum.plugins.convertSecondFindArgumentType
import testing.library.dom.karakum.plugins.convertTypealiasParameterBounds
import testing.library.dom.karakum.plugins.convertUtilityTypes
import testing.library.dom.karakum.plugins.convertWaitForName
import typescript.isFunctionDeclaration

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            PromiseResultPlugin(),
            PromiseFunctionPlugin(
                ignore = match {
                    match(::isFunctionDeclaration, "waitFor")
                }
            ),

            QueriesPlugin(),
            BoundQueriesPlugin,

            convertFunctionInterfaces,
            convertOptionalType,
            convertPrettyFormatOptionsReceived,
            convertQueriesGenerics,
            convertSecondFindArgumentType,
            convertTypealiasParameterBounds,
            convertUtilityTypes,
            convertWaitForName,
        )

        annotations = manyOf(
            ::annotateWaitFor,
        )

        inheritanceModifiers = manyOf(
            ::modifyMethodInheritance,
        )

        input = manyOf("types/**/*.d.ts")
        isolatedOutputPackage = true
        packageNameMapper = recordOf(
            "types/([^/]+)/([^/]+)\\.kt" to "$2.kt",

            "createEvent.kt" to "createEvent.fun.kt",
            "fireEvent.kt" to "fireEvent.fun.kt",

            "queryByAttribute.kt" to "queryByAttribute.fun.kt",

            "QueryByText.kt" to "QueryByText.type.kt",
            "QueryByRole.kt" to "QueryByRole.type.kt",

            "FindAllByText.kt" to "FindAllByText.type.kt",
            "FindAllByRole.kt" to "FindAllByRole.type.kt",

            "FindByText.kt" to "FindByText.type.kt",
            "FindByRole.kt" to "FindByRole.type.kt",

            "GetByText.kt" to "GetByText.type.kt",
            "GetByRole.kt" to "GetByRole.type.kt",

            "screen.kt" to "screen.val.kt",
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
