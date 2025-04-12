package karakum.table

internal enum class Package(
    id: String,
    val moduleName: String,
) {
    TABLE_CORE("tanstack.table.core", "@tanstack/table-core"),
    // REACT_TABLE("tanstack.react.table", "@tanstack/react-table"),

    ;

    val pkg = "package $id"
    val path = id.replace(".", "/")
}
