import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

val TEST_SOURCE_SETS = listOf(
    "jsTest",
    "commonTest",
)

val JS_TEST_TASK_NAME = "jsTestPackageJson"

afterEvaluate {
    val kotlin = project.extensions.getByName<KotlinProjectExtension>("kotlin")

    val hasSupportedTestSourceSet = TEST_SOURCE_SETS
        .mapNotNull { name -> kotlin.sourceSets.findByName(name) }
        .flatMap { it.kotlin.sourceDirectories }
        .any { it.exists() }

    tasks.named(JS_TEST_TASK_NAME) {
        onlyIf {
            hasSupportedTestSourceSet
        }
    }
}
