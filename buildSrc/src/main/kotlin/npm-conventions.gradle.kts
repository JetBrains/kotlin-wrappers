import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

val NPM_CONFIGURATIONS = listOf(
    "jsMainApi",
    "jsMainImplementation",
)

val npmResolutions by tasks.registering {
    doLast {
        val yarnExtension = rootProject.the<YarnRootExtension>()

        for (dependency in project.getNpmDependencies()) {
            val version = dependency.version
            if (version.startsWith("^")) {
                yarnExtension.resolution(dependency.name, version.removePrefix("^"))
            }
        }
    }
}

// TODO: remove `afterEvaluate` usage
afterEvaluate {
    // TODO: find better task
    tasks.named("jsPackageJson") {
        dependsOn(npmResolutions)
    }
}

fun Project.getNpmDependencies(): Sequence<NpmDependency> =
    NPM_CONFIGURATIONS.asSequence()
        .map { configurations.getByName(it) }
        .flatMap { it.allDependencies }
        .filterIsInstance<NpmDependency>()
