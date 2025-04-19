package karakum.react

internal enum class Package(
    id: String,
) {
    DOM("react.dom"),
    ARIA("react.dom.aria"),
    EVENTS("react.dom.events"),
    HTML("react.dom.html"),
    SVG("react.dom.svg"),

    ;

    val pkg = "package $id"
    val path = id.replace(".", "/")
}
