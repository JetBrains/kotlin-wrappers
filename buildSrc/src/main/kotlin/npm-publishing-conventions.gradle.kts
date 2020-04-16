import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

val BUILD_NPM = "build/npm"
val PACKAGE_JSON = "package.json"

tasks {
    val processPkg = register<Copy>("processPkg") {
        from(".")
        into(BUILD_NPM)
        include(PACKAGE_JSON)
        filter(project.packageJsonFilter())
    }

    val prepublish = register<Copy>("prepublish") {
        from(".")
        from(jsDistDir)
        into(BUILD_NPM)
        exclude(PACKAGE_JSON)
        exclude(BUILD_NPM)

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(file(BUILD_NPM))

        dependsOn(prepublish)
        dependsOn(processPkg)
    }
}
