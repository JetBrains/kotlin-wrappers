import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

val Task.npmBuildDir: File
    get() = project.buildDir.resolve("npm")

tasks {
    val prepublish = register<Copy>("prepublish") {
        from(jsDistDir)

        from(".") {
            include("package.json")
            filter(packageJsonFilter())
        }

        from(".") {
            include("README.md")
        }

        into(npmBuildDir)

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(npmBuildDir)

        dependsOn(prepublish)
    }
}
