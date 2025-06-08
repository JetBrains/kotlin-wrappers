plugins {
    id("wrappersbuild.kotlin-library-conventions")
    alias(libs.plugins.karakum)
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(npm(jspkg.semver))
    commonMainImplementation(devNpm(jspkg.types.semver))
}
