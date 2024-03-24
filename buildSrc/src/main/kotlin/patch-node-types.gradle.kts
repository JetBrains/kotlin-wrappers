import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

rootProject.plugins.apply(PatchNodeTypes::class)

private class PatchNodeTypes : Plugin<Project> {
    override fun apply(target: Project): Unit = with(target) {
        tasks.named("kotlinNpmInstall") {
            doLast {
                patch("@types/node/events.d.ts") { content ->
                    content
                        .replace("@param eventName ", "@param type ")
                        .replace("(eventName: ", "(type: ")
                }
            }
        }
    }

    companion object {
        fun Project.patch(
            path: String,
            transform: (String) -> String,
        ) {
            val file = layout.buildDirectory.file("js/node_modules/$path").get().asFile
            file.writeText(transform(file.readText()))
        }
    }
}
