import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

val compareLocks by tasks.registering {
    dependsOn("kotlinNpmInstall")

    doLast {
        val rootLock = rootProject.layout.projectDirectory.file("package-lock.json")
        val buildLock = rootProject.layout.buildDirectory.file("js/package-lock.json").get()

        val rootLockLines = rootLock.asFile.readLines()
        val buildLockLines = buildLock.asFile.readLines()

        val (minLines, maxLines) = listOf(rootLockLines, buildLockLines).sortedBy { it.size }

        val differences = mutableListOf<String>()

        for ((index, line) in maxLines.withIndex()) {
            val otherLine = minLines.getOrNull(index) ?: "<empty line>"

            if (line != otherLine) {
                differences.add(
                    """
                    Difference on line #$index:
                    $line
                    $otherLine
                    """.trimIndent()
                )
            }
        }

        if (differences.isNotEmpty()) {
            throw GradleException(differences.joinToString("\n"))
        }
    }
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        version = "20.15.1"
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        ignoreScripts = false
    }

    tasks.named("kotlinStorePackageLock") {
        dependsOn(compareLocks)
    }
}
