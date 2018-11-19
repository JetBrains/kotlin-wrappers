import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import com.jfrog.bintray.gradle.BintrayExtension
import com.jfrog.bintray.gradle.tasks.BintrayUploadTask

apply {
    from("versions.gradle.kts")
}

group = "org.jetbrains"
version = "1.0-SNAPSHOT"

val kotlinVersion = extra.get("kotlin_version")
val kotlinxHtmlVersion = extra.get("kotlinx_html_version")

buildscript {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
        maven(url = "https://kotlin.bintray.com/kotlinx")
        gradlePluginPortal()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.0")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.3.0")
        classpath("com.moowork.gradle:gradle-node-plugin:1.2.0")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
    }
}

plugins {
    id("kotlin2js") version "1.3.0" apply false
    id("com.jfrog.bintray") version "1.8.4" apply true
    id("com.moowork.node") version "1.2.0" apply false
    `maven-publish`
    java
}

allprojects {
    repositories {
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
        maven(url = "https://kotlin.bintray.com/kotlinx")
        maven(url = "https://plugins.gradle.org/m2/")
        mavenCentral()
        jcenter()
        maven(url = "http://dl.bintray.com/kotlin/kotlin-js-wrappers")
    }
}

configure(subprojects.filter { !it.name.startsWith("kotlin-css") }) {
    apply {
        plugin("kotlin2js")
    }

    dependencies {
        compile(kotlin("stdlib-js"))
        compile("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinxHtmlVersion")
    }

    val projectName = name
    val compileKotlin2Js = tasks.getByName<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>("compileKotlin2Js")
    compileKotlin2Js.apply {
        kotlinOptions {
            outputFile = "$projectDir/build/classes/main/$projectName.js"
            moduleKind = "commonjs"
            sourceMap = true
            sourceMapEmbedSources = "always"
        }
    }
}

configure(subprojects.filter { it.name != "examples"}) {
    apply {
        plugin("com.moowork.node")
        plugin("com.jfrog.bintray")
        plugin("maven-publish")
        plugin("java")
    }

    val publicationName = "Publication"
    val projectName = name
    val projectVersion = "${projectVersion(name)}-kotlin-$kotlinVersion"

    tasks.withType<BintrayUploadTask>().configureEach {
        extension = BintrayExtension(project).apply {
            apiUrl = "https://api.bintray.com"
            user = System.getenv("BINTRAY_USER")
            key = System.getenv("BINTRAY_KEY")

            publish = true

            pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
                userOrg = "kotlin"
                repo = "kotlin-js-wrappers"
                setPublications(publicationName)
                name = projectName
                vcsUrl = "https://github.com/JetBrains/kotlin-wrappers.git"
                githubRepo = "JetBrains/kotlin-wrappers"
                setLicenses("Apache-2.0")

                version(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                    name = projectVersion
                })
            })
        }
    }

    tasks {
        val sourcesJar by creating(Jar::class) {
            dependsOn(JavaPlugin.CLASSES_TASK_NAME)
            classifier = "sources"
            // java.sourceSets -> sourceSets in gradle 4.10+
            from(java.sourceSets["main"].allSource)
        }

        artifacts {
            add("archives", sourcesJar)
        }

        publishing {
            publications.invoke {
                // Doesn't work in Gradle 4.10+
                // https://github.com/bintray/gradle-bintray-plugin/issues/261
                publicationName(MavenPublication::class) {
                    from(components.findByName("java"))
                    groupId = rootProject.group as String
                    artifactId = projectName
                    artifact(sourcesJar)
                    version = projectVersion
                }
            }
        }


        val versions = mutableMapOf<String, Any?>()
        versions["kotlin_version"] = kotlinVersion
        rootProject.subprojects.filter { it.name != "examples" }.forEach {
            versions[projectKey(it.name)] = projectVersion(it.name)
        }

        val processPkg by creating(Copy::class) {
            from(".")
            into("build/npm")
            include("package.json")
            expand(versions)
        }

        val prepublish by creating(Copy::class) {
            from(".")
            into("build/npm")
            exclude("package.json")
            exclude("build/npm")

            dependsOn("build")
        }

        val npm_publish by creating(com.moowork.gradle.node.npm.NpmTask::class) {
            setArgs(listOf("publish", "--access", "public"))
            setWorkingDir(file("${project.buildDir}/npm"))

            dependsOn("processPkg", "prepublish")
        }
    }
}

fun projectKey(projectName: String) = "${projectName.replace("-", "_")}_version"

fun Project.projectVersion(projectName: String) = rootProject.extra.get(projectKey(projectName))