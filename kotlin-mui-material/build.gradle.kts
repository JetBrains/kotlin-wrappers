plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinMuiBase)

    webMainApi(npm(jspkg.mui.material))
}
