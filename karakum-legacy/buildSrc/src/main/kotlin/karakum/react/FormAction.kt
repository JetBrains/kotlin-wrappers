package karakum.react

internal const val FORM_ACTION = "FormAction"

internal fun FormAction(): ConversionResult =
    ConversionResult(
        name = "FormAction",
        body = "typealias FormAction = ActionOrString<FormData>",
        pkg = Package.DOM,
    )
