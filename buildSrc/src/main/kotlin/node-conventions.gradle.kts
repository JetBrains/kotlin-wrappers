import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        nodeVersion = "20.13.1"
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
        ignoreScripts = false
    }
}
