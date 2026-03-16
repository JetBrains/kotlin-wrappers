package testing.library.dom.karakum

import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseFunctionPlugin
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.extension.withName
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import js.objects.unsafeJso
import testing.library.dom.karakum.annotations.annotateFireEvent
import testing.library.dom.karakum.annotations.annotateWaitFor
import testing.library.dom.karakum.inheritanceModifiers.modifyMethodInheritance
import testing.library.dom.karakum.plugins.*
import typescript.isFunctionDeclaration

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            PromiseResultPlugin(),
            PromiseFunctionPlugin(
                ignore = match {
                    match(::isFunctionDeclaration, withName("waitFor"))
                }
            ),

            QueriesPlugin(),
            BoundQueriesPlugin,

            convertFireEvent,
            convertFunctionInterfaces,
            convertGetQueriesForElement,
            convertHtmlElementGenerics,
            convertOptionalType,
            convertPrettyFormatOptionsReceived,
            convertQueriesGenerics,
            convertSecondFindArgumentType,
            convertTypealiasParameterBounds,
            convertUtilityTypes,
            convertWaitForName,
        )

        annotations = listOf(
            ::annotateFireEvent,
            ::annotateWaitFor,
        )

        inheritanceModifiers = listOf(
            ::modifyMethodInheritance,
        )

        input = listOf("types/**/*.d.ts")
        ignoreOutput = listOf(
            "**/CreateEvent.kt",
            "**/CreateObject.kt",
            "**/CreateFunction.kt",
            "**/createEvent.fun.kt",
            "**/EventType.kt",
            "**/FireObject.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
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
