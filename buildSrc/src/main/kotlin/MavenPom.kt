import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication

internal fun MavenPublication.configurePom(
    project: Project
) {
    pom {
        name.set(project.name)
        description.set(project.description)
        url.set("https://github.com/JetBrains/kotlin-wrappers")

        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }

        developers {
            developer {
                id.set("JetBrains")
                name.set("JetBrains Team")
                email.set("community-support@jetbrains.com")
                organization.set("JetBrains")
                organizationUrl.set("https://www.jetbrains.com/")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/JetBrains/kotlin-wrappers.git")
            developerConnection.set("scm:git:git@github.com:JetBrains/kotlin-wrappers.git")
            url.set("https://github.com/JetBrains/kotlin-wrappers")
        }
    }
}
