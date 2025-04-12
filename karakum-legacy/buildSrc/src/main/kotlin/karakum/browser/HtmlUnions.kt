package karakum.browser

import karakum.common.sealedUnionBody

internal const val AUTO_CAPITALIZE = "AutoCapitalize"
internal const val PRELOAD = "Preload"
internal const val FETCH_PRIORITY = "FetchPriority"
internal const val FORM_ENCTYPE = "FormEncType"
internal const val FORM_METHOD = "FormMethod"
internal const val REQUEST_METHOD = "RequestMethod"

internal class UnionData(
    val name: String,
    val values: List<String>,
    val pkg: String,
)

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
            "select-multiple"
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
        name = "SelectionDirection",
        values = listOf(
            "forward",
            "backward",
            "none",
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
)

internal fun htmlUnions(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = AUTO_CAPITALIZE,
            body = sealedUnionBody(
                name = AUTO_CAPITALIZE,
                values = listOf(
                    "off",
                    "none",
                    "on",
                    "sentences",
                    "words",
                    "characters",
                ),
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "CrossOrigin",
            body = sealedUnionBody(
                name = "CrossOrigin",
                values = listOf(
                    "anonymous",
                    "use-credentials",
                    "",
                )
            ),
            pkg = "web.http",
        ),
        ConversionResult(
            name = FETCH_PRIORITY,
            body = sealedUnionBody(
                name = FETCH_PRIORITY,
                values = listOf(
                    "auto",
                    "high",
                    "low",
                ),
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
                )
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "ImageDecoding",
            body = sealedUnionBody(
                name = "ImageDecoding",
                values = listOf(
                    "async",
                    "sync",
                    "auto",
                )
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "InputMode",
            body = sealedUnionBody(
                name = "InputMode",
                values = listOf(
                    "none",
                    "text",
                    "tel",
                    "url",
                    "email",
                    "numeric",
                    "decimal",
                    "search",
                )
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "InputType",
            body = sealedUnionBody(
                name = "InputType",
                values = listOf(
                    "button",
                    "checkbox",
                    "color",
                    "date",
                    "datetime-local",
                    "email",
                    "file",
                    "hidden",
                    "image",
                    "month",
                    "number",
                    "password",
                    "radio",
                    "range",
                    "reset",
                    "search",
                    "submit",
                    "tel",
                    "text",
                    "time",
                    "url",
                    "week",
                )
            ),
            pkg = "web.html",
        ),
        ConversionResult(
            name = "Loading",
            body = sealedUnionBody(
                name = "Loading",
                values = listOf(
                    "eager",
                    "lazy",
                )
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
        }
    )
