plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(npm(jspkg.semver))
    commonMainImplementation(devNpm(jspkg.types.semver))
}
