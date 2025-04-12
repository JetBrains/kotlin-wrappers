package karakum.query

internal enum class Package(
    private val id: String,
) {
    CORE("tanstack.query.core"),
    REACT("tanstack.react.query"),

    ;

    val module: String = "@" + id.replaceFirst(".", "/").replaceFirst(".", "-")

    val pkg: String = "package $id"

    val path: String = id.replace(".", "/")

    val starImport = "import $id.*"
}
