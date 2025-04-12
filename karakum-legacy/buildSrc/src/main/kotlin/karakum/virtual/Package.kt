package karakum.virtual

internal enum class Package(
    id: String,
    val moduleName: String,
) {
    VIRTUAL_CORE("tanstack.virtual.core", "@tanstack/virtual-core"),
    REACT_VIRTUAL("tanstack.react.virtual", "@tanstack/react-virtual"),

    ;

    val pkg = "package $id"
    val path = id.replace(".", "/")
}
