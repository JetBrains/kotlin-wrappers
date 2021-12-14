import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

the<YarnRootExtension>().version = "1.22.17"
the<YarnRootExtension>().ignoreScripts = false

the<NodeJsRootExtension>().nodeVersion = "16.13.1"
