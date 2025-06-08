package karakum.actions

internal class Library(
    val name: String,
) {
    val moduleId: String = "@actions/$name"
    val path: String = "actions/" + name.replace("-", "/")
    val pkg: String = path.replace("/", ".")
}
