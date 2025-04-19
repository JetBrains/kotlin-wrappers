import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

val TEST_SOURCE_SETS = listOf(
    "jsTest",
    "commonTest",
)

afterEvaluate {
    tasks.named("jsTestPackageJson") {
        onlyIf {
            val kotlin = project.extensions.getByName<KotlinProjectExtension>("kotlin")

            TEST_SOURCE_SETS.asSequence()
                .map { kotlin.sourceSets.getByName(it) }
                .flatMap { it.kotlin.sourceDirectories }
                .any { it.exists() }
        }
    }
}
