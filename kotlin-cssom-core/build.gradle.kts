plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)

    webMainApi(devNpm(jspkg.csstype))
}
