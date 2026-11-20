package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConverter
import karakum.common.unionConstant

internal const val AUTO_CAPITALIZE = "AutoCapitalize"
internal const val BLOCKING = "Blocking"
internal const val PRELOAD = "Preload"
internal const val FETCH_PRIORITY = "FetchPriority"
internal const val FORM_ENCTYPE = "FormEncType"
internal const val FORM_METHOD = "FormMethod"
internal const val HIDDEN = "Hidden"
internal const val REQUEST_METHOD = "RequestMethod"

internal val UNION_DATA_LIST = listOf(
    UnionData(
        name = "ButtonType",
        values = listOf(
            "submit",
            "reset",
            "button",
        ),
        pkg = "web.html",
    ),
    UnionData(
        name = "SelectType",
        values = listOf(
            "select-one",
            "select-multiple",
        ),
        pkg = "web.html",
    ),
    UnionData(
        name = PRELOAD,
        values = listOf(
            "none",
            "metadata",
            "auto",
        ),
        pkg = "web.html",
    ),
    UnionData(
        name = "DropEffect",
        values = listOf(
            "none",
            "copy",
            "link",
            "move",
        ),
        pkg = "web.data",
    ),
    UnionData(
        name = "AllowedEffect",
        values = listOf(
            "none",
            "copy",
            "copyLink",
            "copyMove",
            "link",
            "linkMove",
            "move",
            "all",
            "uninitialized",
        ),
        pkg = "web.data",
    ),
    UnionData(
        name = "CrossOrigin",
        values = listOf(
            "anonymous",
            "use-credentials",
        ),
        pkg = "web.http",
    ),
)

internal fun htmlUnions(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = AUTO_CAPITALIZE,
            body = unionBody(
                name = AUTO_CAPITALIZE,
                contentPath = "HTMLElement/autocapitalize",
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = BLOCKING,
            body = sealedUnionBody(
                name = BLOCKING,
                values = listOf(
                    "render",
                ),
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = HIDDEN,
            body = unionBodyByConstants(
                name = HIDDEN,
                constants = listOf(
                    unionConstant(false),
                    unionConstant(true),
                    unionConstant("until-found"),
                ),
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = FETCH_PRIORITY,
            body = unionBody(
                name = FETCH_PRIORITY,
                contentPath = "HTMLImageElement/fetchPriority",
            ),
            pkg = "web.http",
        ),
        ConversionResult(
            name = REQUEST_METHOD,
            body = sealedUnionBody(
                name = REQUEST_METHOD,
                values = listOf(
                    "DELETE",
                    "GET",
                    "HEAD",
                    "OPTIONS",
                    "PATCH",
                    "POST",
                    "PUT",
                ),
            ),
            pkg = "web.http",
        ),
        ConversionResult(
            name = FORM_METHOD,
            body = sealedUnionBody(
                name = FORM_METHOD,
                values = listOf(
                    "get",
                    "dialog",
                    "post",
                ),
            ),
            pkg = "web.form",
        ),
        ConversionResult(
            name = FORM_ENCTYPE,
            body = sealedUnionBody(
                name = FORM_ENCTYPE,
                values = listOf(
                    "application/x-www-form-urlencoded",
                    "multipart/form-data",
                    "application/json",
                    "text/plain",
                ),
            ),
            pkg = "web.form",
        ),
        ConversionResult(
            name = "EnterKeyHint",
            body = sealedUnionBody(
                name = "EnterKeyHint",
                values = listOf(
                    "enter",
                    "done",
                    "go",
                    "next",
                    "previous",
                    "search",
                    "send",
                ),
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "ImageDecoding",
            body = unionBody(
                name = "ImageDecoding",
                contentPath = "HTMLImageElement/decoding",
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "InputMode",
            body = unionBody(
                name = "InputMode",
                contentPath = "HTMLElement/inputMode",
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "InputType",
            body = inputTypeBody("InputType"),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "Loading",
            body = unionBody(
                "Loading",
                "HTMLImageElement/loading",
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "ClosedBy",
            body = unionBody(
                "ClosedBy",
                "HTMLDialogElement/closedBy",
            ),
            pkg = "web.html",
        ),
    ).plus(
        UNION_DATA_LIST.map { data ->
            ConversionResult(
                name = data.name,
                body = sealedUnionBody(
                    name = data.name,
                    values = data.values,
                ),
                pkg = data.pkg,
            )
        },
    )

private fun inputTypeBody(name: String): String {
    val commentProvider = object : UnionConverter.CommentProvider {
        override fun getComment(name: String): String =
            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/HTML/Reference/Elements/input#input_types)
             */
            """.trimIndent()

        override fun getComment(name: String, unionValue: String): String =
            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/HTML/Reference/Elements/input/$unionValue)
             */
            """.trimIndent()
    }

    val values = MDN.root.resolve("html/reference/elements/input")
        .listFiles { it.isDirectory }
        .map { it.name }
        .sorted()

    return sealedUnionBody(
        name = name,
        values = values,
        commentProvider = commentProvider,
    )
}

private fun getValueSection(
    contentPath: String,
): String =
    getApiDirectory(contentPath)!!
        .resolve("index.md")
        .readText()
        .substringAfter("## Value\n", "")
        .substringBefore("\n#")

private fun unionValues(
    contentPath: String,
): List<String> =
    getValueSection(contentPath)
        .splitToSequence("\n")
        .mapNotNull { line -> line.removePrefix("- ").takeIf { it != line } }
        .flatMap { it.splitToSequence(" or ") }
        .map { it.removeSurrounding("`") }
        .toList()

private fun findUnionValues(
    contentPath: String,
): List<String> =
    getValueSection(contentPath)
        .substringAfter("value is one of ", "")
        .substringBefore(".", "")
        .ifEmpty { return emptyList() }
        .splitToSequence("`")
        .filterIndexed { index, _ -> index % 2 == 1 }
        .toList()

private fun unionBody(
    name: String,
    contentPath: String,
): String {
    var values = unionValues(contentPath)
    var hashPrefix = ""
    if (values.isEmpty()) {
        hashPrefix = ":~:text="
        values = findUnionValues(contentPath)
    }

    val commentProvider = object : UnionConverter.CommentProvider {
        override fun getComment(name: String): String =
            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$contentPath#value)
             */
            """.trimIndent()

        override fun getComment(name: String, unionValue: String): String =
            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$contentPath#$hashPrefix$unionValue)
             */
            """.trimIndent()
    }

    return sealedUnionBody(
        name = name,
        values = values,
        commentProvider = commentProvider,
    )
}
