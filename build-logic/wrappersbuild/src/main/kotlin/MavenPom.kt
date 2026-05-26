import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.assign

internal fun MavenPublication.configurePom(
    project: Project,
) {
    pom {
        name = project.name
        description = project.description
        url = KotlinWrappers.PROJECT_URL

        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }

        developers {
            developer {
                id = "JetBrains"
                name = "JetBrains Team"
                email = "community-support@jetbrains.com"
                organization = "JetBrains"
                organizationUrl = "https://www.jetbrains.com/"
            }
        }

        scm {
            connection = "scm:git:git://github.com/JetBrains/kotlin-wrappers.git"
            developerConnection = "scm:git:git@github.com:JetBrains/kotlin-wrappers.git"
            url = KotlinWrappers.PROJECT_URL
        }
    }
}
