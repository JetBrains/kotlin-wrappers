import java.util.*

val parentProperties = rootProject.layout
    .projectDirectory
    .dir("../..")
    .file("gradle.properties")
    .asFile
    .inputStream()
    .use { Properties().apply { load(it) } }

for (npmKey in parentProperties.keys.map { it as String }) {
    if (!npmKey.endsWith(".npm.version"))
        continue

    val key = npmKey.replaceFirst(".npm.version", ".version")
    if (hasProperty(key))
        continue

    val value = (parentProperties[npmKey] as String)
        .removePrefix("^")

    extensions.extraProperties[key] = value
}
