plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(npm(jspkg.semver))
    webMainImplementation(devNpm(jspkg.types.semver))
}
