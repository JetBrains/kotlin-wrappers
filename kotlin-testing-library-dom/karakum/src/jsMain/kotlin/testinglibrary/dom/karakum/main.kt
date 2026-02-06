package testinglibrary.dom.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import testinglibrary.dom.karakum.annotations.annotateWaitFor
import testinglibrary.dom.karakum.inheritanceModifiers.modifyMethodInheritance
import testinglibrary.dom.karakum.plugins.PromiseFunctionApiPlugin
import testinglibrary.dom.karakum.plugins.QueriesPlugin
import testinglibrary.dom.karakum.plugins.convertFunctionInterfaces
import testinglibrary.dom.karakum.plugins.convertOptionalType
import testinglibrary.dom.karakum.plugins.convertPrettyFormatOptionsReceived
import testinglibrary.dom.karakum.plugins.convertPromiseResult
import testinglibrary.dom.karakum.plugins.convertSecondFindArgumentType
import testinglibrary.dom.karakum.plugins.convertSkippedGenerics
import testinglibrary.dom.karakum.plugins.convertTypealiasParameterBounds
import testinglibrary.dom.karakum.plugins.convertUtilityTypes
import testinglibrary.dom.karakum.plugins.convertWaitForName

private val asyncQueries = setOf(
    "findByLabelText",
    "findAllByLabelText",
    "findByPlaceholderText",
    "findAllByPlaceholderText",
    "findByText",
    "findAllByText",
    "findByAltText",
    "findAllByAltText",
    "findByTitle",
    "findAllByTitle",
    "findByDisplayValue",
    "findAllByDisplayValue",
    "findByRole",
    "findAllByRole",
    "findByTestId",
    "findAllByTestId",
)

private val asyncQueriesTypes = setOf(
    "FindAllBy",
    "FindAllByBoundAttribute",
    "FindAllByRole.type",
    "FindAllByText.type",
    "FindBy",
    "FindByBoundAttribute",
    "FindByRole.type",
    "FindByText.type",
)

private val queriesTypes = asyncQueriesTypes + setOf(
    "AllByBoundAttribute",
    "AllByRole",
    "AllByText",
    "GetAllBy",
    "GetBy",
    "GetByBoundAttribute",
    "GetByRole.type",
    "GetByText.type",
    "QueryBy",
    "QueryByBoundAttribute",
    "QueryByRole.type",
    "QueryByText.type",
)

private val queries = asyncQueries + setOf(
    "getByLabelText",
    "getAllByLabelText",
    "queryByLabelText",
    "queryAllByLabelText",
    "getByPlaceholderText",
    "getAllByPlaceholderText",
    "queryByPlaceholderText",
    "queryAllByPlaceholderText",
    "getByText",
    "getAllByText",
    "queryByText",
    "queryAllByText",
    "getByAltText",
    "getAllByAltText",
    "queryByAltText",
    "queryAllByAltText",
    "getByTitle",
    "getAllByTitle",
    "queryByTitle",
    "queryAllByTitle",
    "getByDisplayValue",
    "getAllByDisplayValue",
    "queryByDisplayValue",
    "queryAllByDisplayValue",
    "getByRole",
    "getAllByRole",
    "queryByRole",
    "queryAllByRole",
    "getByTestId",
    "getAllByTestId",
    "queryByTestId",
    "queryAllByTestId",
)

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            QueriesPlugin(),
            PromiseFunctionApiPlugin(),

            convertFunctionInterfaces,
            convertOptionalType,
            convertPrettyFormatOptionsReceived,
            convertPromiseResult,
            convertSecondFindArgumentType,
            convertSkippedGenerics,
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
        importInjector = recordOf(
            pairs = queries.map {
                "$it.suspend.kt" to arrayOf(
                    "web.html.HTMLElement",
                )
            }.toTypedArray() + (queries + queriesTypes).map {
                "$it.kt" to if (it in asyncQueries || it in asyncQueriesTypes) {
                    arrayOf(
                        "js.promise.Promise",
                        "web.html.HTMLElement",
                    )
                } else {
                    arrayOf(
                        "web.html.HTMLElement",
                    )
                }
            }.toTypedArray() + arrayOf(
                "(AllByAttribute|QueryByAttribute).kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "Config.kt" to arrayOf(
                    "js.promise.Promise",
                    "web.dom.Element",
                ),
                "(CreateFunction|FireFunction).kt" to arrayOf(
                    "web.dom.Document",
                    "web.dom.Element",
                    "web.dom.Node",
                    "web.events.Event",
                    "web.window.Window",
                ),
                "CreateObject.kt" to arrayOf(
                    "web.events.Event",
                ),
                "computeHeadingLevel.kt" to arrayOf(
                    "web.dom.Element",
                ),
                "getElementError.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "getNodeText.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "getQueriesForElement.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "(getRoles|logRoles).kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "GetRolesResult.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "getSuggestedQuery.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "isInaccessible.kt" to arrayOf(
                    "web.dom.Element",
                ),
                "Match.kt" to arrayOf(
                    "web.html.HTMLElement",
                ),
                "MatcherFunction.kt" to arrayOf(
                    "web.dom.Element",
                ),
                "(logDOM|prettyDOM).kt" to arrayOf(
                    "web.dom.Element",
                    "web.html.HTMLDocument",
                ),
                "PrettyDOMOptions.kt" to arrayOf(
                    "web.dom.Node",
                ),
                "waitForOptions.kt" to arrayOf(
                    "web.html.HTMLElement",
                    "web.mutation.MutationObserverInit",
                ),
                "(waitFor|waitForElementToBeRemoved).kt" to arrayOf(
                    "js.promise.Promise",
                ),
            )
        )
    }
}
