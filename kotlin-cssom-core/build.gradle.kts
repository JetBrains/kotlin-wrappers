plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainApi(devNpm(jspkg.csstype))
}
