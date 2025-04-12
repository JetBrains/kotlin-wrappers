package karakum.popper

internal enum class Package(
    val id: String,
) {
    CORE("popper.core"),
    MODIFIERS("popper.core.modifiers"),

    ;

    val pkg = "package $id"
    val path = id.replace(".", "/")
}
