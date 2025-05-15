import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

val TEST_SOURCE_SETS = listOf(
    "jsTest",
    "commonTest",
)

afterEvaluate {
    val kotlin = project.extensions.getByName<KotlinProjectExtension>("kotlin")

    val hasSupportedTestSourceSet = TEST_SOURCE_SETS
        .mapNotNull { name -> kotlin.sourceSets.findByName(name) }
        .flatMap { it.kotlin.sourceDirectories }
        .any { it.exists() }

    tasks.named("jsTestPackageJson") {
        onlyIf {
            hasSupportedTestSourceSet
        }
    }
}
