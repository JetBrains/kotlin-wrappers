import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
}

tasks {
    val prepareNpmPublish = register<Copy>("prepareNpmPublish") {
        from(jsOutputDir)

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

        dependsOn(prepareNpmPublish)
    }
}
